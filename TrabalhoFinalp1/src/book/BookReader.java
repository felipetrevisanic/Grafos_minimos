package book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BookReader {
	
	public BufferedReader Leitor(File arquivo) throws FileNotFoundException {
		InputStream is = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader reader = new BufferedReader(isr);
		return reader;
	}
}
