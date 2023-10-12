package exec;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Transitor {

	public void NaoProcessado(File arq) {
		String nomeArq = arq.toString();
		Path origem = Paths.get(nomeArq);	
		String ende = nomeArq.substring(0, 9);
		String reco = nomeArq.substring(9);
		String endereco = (ende + "NaoProcessado\\" + reco);
		Path destino = Paths.get(endereco);
		
		try {
			Files.move(origem, destino, StandardCopyOption.REPLACE_EXISTING);							
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Processado(File arq) {
		String nomeArq = arq.toString();
		Path origem = Paths.get(nomeArq);	
		String ende = nomeArq.substring(0, 9);
		String reco = nomeArq.substring(9);
		String endereco = (ende + "Processado\\" + reco);
		Path destino = Paths.get(endereco);
		
		try {
			Files.move(origem, destino, StandardCopyOption.REPLACE_EXISTING);							
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
