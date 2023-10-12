package exec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import autentication.VerificarConection;
import book.BookReader;

public class Start {
	
	public void Start(String arquivo, int rota) {
		
		File dir = new File("C:\\Teste");
		File[] arquivos = dir.listFiles();
		Header h = new Header();
		Conection c = new Conection(h);
		Trailer t = new Trailer();
		Transitor tra = new Transitor();
		VerificarConection vc = new VerificarConection();
		try {
			BookReader br = new BookReader();
			//Vai ler todos os arquivos que terminem com txt
			for(File arq : arquivos) {
				if(arq.isFile() && arq.getName().endsWith(".txt") && arq.getName().contains("rota")) {
                    BufferedReader arqLeitor = new BufferedReader(new FileReader(arq));
					String linha;
					
					Weight w = new Weight(h);
					linha = arqLeitor.readLine();
					
					if(linha.length() != 6) {
						System.out.println(arq +" Header inválido");
						arqLeitor.close();
						tra.NaoProcessado(arq);
						continue;
					}
					if(h.Header(linha)) {
						while((linha=arqLeitor.readLine()) != null) {
							if(linha.startsWith("01")) {
								if(vc.VerificarConection(linha)) {
									c.Conection(linha);									
								}else {
									System.out.println(arq + " Resumo de conexões inválido");
									arqLeitor.close();
									tra.NaoProcessado(arq);
									break; 
								}
							}
							
							if(linha.startsWith("02")){
								w.Weight(linha);								
							}

							if(linha.startsWith("09")) {
								
								t.Trailer(linha);	
							}
							
						}
						
						if(arq.exists()) {
							//verifica se o numero de nos é igual ao numero de nos no header
							if(c.getNna() != h.getQtdNos()) {
								System.out.println(arq + " Número totais de nós inválido.");
								arqLeitor.close();
								tra.NaoProcessado(arq);
								
							}
							//verifica se o total de pesos é igual ao numero do total no header
							if(w.getTotalPeso() != h.getQtdPesos() && arq.exists()) {
								System.out.println(arq + " Soma dos pesos difere (Valor do Registro HEADER = NN e Soma dos Pesos = NN)");
								arqLeitor.close();
								tra.NaoProcessado(arq);
								continue;								
							}	
							
						}
						
					}else {
						System.out.println(arq + " Número totais de nós inválido");
						arqLeitor.close();
						tra.NaoProcessado(arq);
						
					}
					if(arq.exists()) {
						System.out.println(arq+ " processado com sucesso, aguarde 10 segundos para ele ser redirecionado");
						arqLeitor.close();
						
						synchronized (arq) {
						    try {
						        arq.wait(10000);
						        tra.Processado(arq);
						    } catch (InterruptedException e) {
						        e.printStackTrace();
						    }
						}
						
					}
					
				}
				
			}
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
