package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.Node;
import com.example.PersonalTree;

class PersonalTreeTest {

	@Test
	void testPersonalTreeClass() {
		fail("Not yet implemented");
	}
	
	void testIsValidPersonalTree() {
		// create PersonalTree class
		PersonalTree tree = new PersonalTree();
		assertEquals(tree, new PersonalTree());
		
	}
	
	void testIsValidBST(Node node, int min, int max) {
		if(node == null) assertTrue(true);
		
		if (node.getKey() < min || node.getKey() > max) assertTrue(false);
		
		
		while (node != null) {
			testIsValidBST(node.getLeft(), min, node.getKey() - 1);
			testIsValidBST(node.getRight(), node.getKey() + 1, max);
		}
		
		
		assertTrue(true);
	}
	
	void testFindKey(Node root, int key) {
		if(root == null)
			assertTrue(false);
		if (root.getKey() == key)
			assertTrue(true);
		if (root.getKey() < key)
		{
			while (root != null) {
				testFindKey(root.getRight(), key);
			}
		}
		
		while (root != null) {
			testFindKey(root.getLeft(), key);
		}
		
		assertTrue(false);
	}

}
