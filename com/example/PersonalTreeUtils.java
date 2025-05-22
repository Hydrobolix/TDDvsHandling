package com.example;

public class PersonalTreeUtils {
	
	public boolean findKey(Node root, int key) {
		if(root == null)
			return false;
		if (root.getKey() == key)
			return true;
		
		if (root.getKey() < key)
		{
			while (root != null) {
				return findKey(root.getRight(), key);
			}
		}
		
		while (root != null) {
			return findKey(root.getLeft(), key);
		}
		
		return false;
	}
}
