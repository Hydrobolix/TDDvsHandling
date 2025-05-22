package com.example;

public class PersonalTreeII {
	Node root;
	
	public PersonalTreeII() throws Exception {
		if (root != null) throw new Exception("PersonalTreeII default constructor error: root can not be initialized in this class.");
		root = null;
	}
	
	public Node getNode() throws Exception {
		if (root != null) throw new Exception("PersonalTreeII getNode() error: root can not have a value.");
		return root;
	}
	
	/*
	public void setRoot(Node n) {
		root = n;
	}
	
	public void setLeft(Node n) {
		root.left = n;
	}
	
	public void setRight(Node n) {
		root.right = n;
	}
	*/
}
