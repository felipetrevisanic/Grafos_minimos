package autentication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import book.BookReader;
import book.BookWriter;

public class VerificarConfig {
	
//	verifica se as linhas estao vazias
	public boolean LinhasVazias(File arquivo) throws IOException {
		BookReader br = new BookReader();
		BufferedReader reader = br.Leitor(arquivo);
		int i = 0; 
		while(i < 100){
			if(reader.readLine() == null) {
				i++;
			}
			if(reader.readLine() != null) {
				return false;
			}else {
				return true;
			}
		}
		return true;
	}
	
//	public void VerificaProcessos(String arquivo) throws IOException {
//		try {
//			InputStream is = new FileInputStream(arquivo);
//			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader reader = new BufferedReader(isr);
//			
//			String linha = "";
//			
//			while((linha = reader.readLine()) != null) {
//				
//				if(linha.equals("Processado=C:\\Teste\\Processado")) {
//					linha = reader.readLine();
//					if(linha.equals("Processado=C:\\Teste\\NaoProcessado")) {
//						System.out.println("Não foi possível continuar a aplicação pois o segundo comando esta incorreto ou não existe");
//					}	
//				}else {
//					System.out.println("Não foi possível pois o primeiro comando esta fora do padrão");
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public void EstruturaConfig(File arquivo) {
		try {
			BookWriter bw = new BookWriter();
			BufferedWriter writer = bw.Escritor(arquivo);
			PrintWriter pw = new PrintWriter(writer);
			if(LinhasVazias(arquivo)){
				
				writer.write("Processado=C:\\Teste\\Processado");
				writer.newLine();
				writer.write("Não Processado=C:\\Teste\\NaoProcessado");
				
				writer.close();
			}else {
				pw.write("");
				writer.write("Processado=C:\\Teste\\Processado");
				writer.newLine();
				writer.write("Não Processado=C:\\Teste\\NaoProcessado");
				
				writer.close();
			}
		}catch(Exception e){
			System.out.println("erro ao configurar o arquivo config.txt");
			System.out.println("erro: " + e);
		}
	}
	
	//verifica se há um txt de config e se ele esta vazio
	public void VerificarConfig(File arquivo) {
		try {
			BookReader br = new BookReader();
			BufferedReader reader = br.Leitor(arquivo);
			
			EstruturaConfig(arquivo);
				
			reader.close();
				
			
		} catch (FileNotFoundException e1) {
			EstruturaConfig(arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
