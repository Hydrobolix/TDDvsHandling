package com.example;

public class PersonalTreeUtilsII {
	public boolean findKey(Node root, int key) throws Exception {
		if(root == null)
			throw new Exception("PersonalTreeUtilsII findKey() error: root can not be null.");
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
