package com.klangner.ast;


public interface INode {

	public String getName();
	public int getChildrenCount();
	public INode getChild(int index);
}
