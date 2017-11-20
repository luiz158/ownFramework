package br.com.ealmeida.fileLoader;

import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileParser implements IFileParser{

	Logger log = Logger.getLogger(FileParser.class);
	
	@Override
	public IFormatReturn parseFile(FileInputStream file, Class<? extends Object> returnType) throws Exception {
		Workbook workBook = WorkbookFactory.create(file);
		workBook.get
		return null;
	}

}