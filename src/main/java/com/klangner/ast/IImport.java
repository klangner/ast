package com.klangner.ast;


public interface IImport extends INode{
	
	/** Get only packages name. E.g. without ending class */
	public String getPackageName();
}
