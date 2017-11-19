package br.com.ealmeida.fileLoader.service;

import java.nio.file.Path;

import org.apache.poi.ss.formula.functions.T;

public interface IFileParser {

	T parseFile(Path path, Class<T> returnType);
}
