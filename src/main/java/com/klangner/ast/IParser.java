package com.klangner.ast;

import java.io.IOException;
import java.io.InputStream;

public interface IParser {

	public INode parseFile(InputStream is) throws IOException;
	public INode parseFolder(String path) throws IOException;
}
