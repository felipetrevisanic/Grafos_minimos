package book;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BookWriter {

	public BufferedWriter Escritor(File arquivo) throws FileNotFoundException {
		OutputStream os = new FileOutputStream("C:\\Teste\\Configuracao\\Config.txt");
		OutputStreamWriter osr = new OutputStreamWriter(os);
		BufferedWriter writer = new BufferedWriter(osr);
	
		return writer;
	}
}
