package autentication;

public class VerificarConection {

	public boolean VerificarConection(String linha) {
		
		if(linha.length() <= 7 && linha.length() >= 5) {
			if(linha.contains("=")) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
		
		
	}
}
