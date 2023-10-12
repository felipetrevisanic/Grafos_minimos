package autentication;

import java.io.File;

public class VerificarDiretorio {
	public void VerificarDiretorio() {
		File fileTeste = new File("C:\\Teste");
		File fileConfiguracao = new File("C:\\Teste\\Configuracao");
		File fileNaoProcessado = new File("C:\\Teste\\NaoProcessado");
		File fileProcessado = new File("C:\\Teste\\Processado");
		
		
		
		if(!fileTeste.exists()) {
			fileTeste.mkdir();
		}
		if(!fileConfiguracao.exists()) {
			fileConfiguracao.mkdir();
		}
		if(!fileNaoProcessado.exists()) {
			fileNaoProcessado.mkdir();
		}
		if(!fileProcessado.exists()) {
			fileProcessado.mkdir();
		}
	
	}
}
