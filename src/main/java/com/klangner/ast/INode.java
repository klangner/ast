package com.klangner.ast;


public interface INode {

	public String getText();
	public int getChildCount();
	public INode getChild(int index);
}
