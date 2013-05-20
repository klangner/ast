package com.klangner.ast;


public interface IModule extends INode{
	
	/** Module name is the same as package where it resides */
	public String getName();
}
