package br.com.ealmeida.fileLoader;

import java.io.FileInputStream;

public interface IFileParser {

	IFormatReturn parseFile(FileInputStream file, Class<? extends Object> returnType) throws Exception;
}