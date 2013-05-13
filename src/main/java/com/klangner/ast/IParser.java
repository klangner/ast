package com.klangner.ast;


public interface IParser {

	public INode parseFile(String fileName);
	public INode parsePackage(String packagePath);
	public INode parseProject(String srcPath);
}
