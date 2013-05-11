package com.klangner.ast;


public interface INode {

	public String getName();
	public int getChildCount();
	public INode getChild(int index);
}
