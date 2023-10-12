package autentication;

import java.io.File;
import java.util.ArrayList;

import exec.Transitor;

public class VerificarNumeroNos {
	
	public int VerificaNumeroNos(ArrayList<String> array,String origem, String destino) {
		
		if(array.contains(origem)) {
			
		}else {
			array.add(origem);
		}
		if(array.contains(destino)) {
			
		}else {
			array.add(destino);					
		}
		
		int numeroNos = array.size();
		return numeroNos;
	}
	
}
