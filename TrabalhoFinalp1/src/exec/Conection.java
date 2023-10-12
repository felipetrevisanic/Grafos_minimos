package exec;

import java.util.ArrayList;

import autentication.VerificarNumeroNos;

public class Conection {

	private int nna;
	ArrayList<String> array = new ArrayList();
	Header h = new Header();
	
	public Conection(Header header) {
		h = header;
	}

	public int Conection(String linha) {
			String codigo = linha.substring(0,2);
			String dado = linha.substring(2);
			String[] partes = dado.split("=");
			String origem = partes[0].trim();
			String destino = partes[1].trim();
			
			
			VerificarNumeroNos vnn = new VerificarNumeroNos();
			int numeroNosArquivo = vnn.VerificaNumeroNos(array, origem, destino);
			
			return setNna(numeroNosArquivo);	
	}
	

	public int getNna() {
		return nna;
	}

	public int setNna(int nna) {
		return this.nna = nna;
	}
	
	
}
