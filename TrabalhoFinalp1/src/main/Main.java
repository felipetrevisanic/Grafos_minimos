package main;

import java.io.File;

import autentication.VerificarConfig;
import autentication.VerificarDiretorio;
import exec.Start;

public class Main {
	
	public static void main(String[] args) {
		
		File ArquivoConfig = new File("C:\\Teste\\Configuracao\\Config.txt");
		int rota = 00;
		String ArquivoTeste = "C:\\Teste\rota" + rota + ".txt";
		
		VerificarDiretorio vd = new VerificarDiretorio();
		vd.VerificarDiretorio();
		
		VerificarConfig vg = new VerificarConfig();
		vg.VerificarConfig(ArquivoConfig);

		Start start = new Start();
		start.Start(ArquivoTeste, rota);
	}
	
}

