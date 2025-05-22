package com.example;

public class Test {

	public static void main(String[] args) {
		PersonalTree tree = new PersonalTree();
		PersonalTreeUtils utils = new PersonalTreeUtils();
		
		tree.setRoot(new Node(10));
		tree.setLeft(new Node(20));
		tree.setRight(new Node(30));
		
		System.out.println(utils.findKey(tree.getNode(), 30));
	}
}
