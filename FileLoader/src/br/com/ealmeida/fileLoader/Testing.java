package br.com.ealmeida.fileLoader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Testing {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("/home/ealmeida/Downloads/Book.xlsx");
			IFileParser fileParser = new FileParser();
			
			fileParser.parseFile(file, Pessoas.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
