package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.Node;

class PersonalTreeTestII {

	@Test
	void testPersonalTreeIIClass() {
		fail("Not yet implemented");
	}
	
	// void testIsValidNode() { }
	
	void testIsValidBST(Node node, int min, int max) {
		if(node == null) assertTrue(true);
		
		if (node.getKey() < min || node.getKey() > max) assertTrue(false);
		
		
		while (node != null) {
			testIsValidBST(node.getLeft(), min, node.getKey() - 1);
			testIsValidBST(node.getRight(), node.getKey() + 1, max);
		}
		
		
		assertTrue(true);
	}
		
	
	// test that PersonalTree can find a key
	
	// test that the PersonalTree can find and return a key
	
	// test that PersonalTree can insert a key
	
	// ..

}
