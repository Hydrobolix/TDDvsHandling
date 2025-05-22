# TDDvsHandling
TDD in OOP seems redundant, Test Cases and Business Logic test cases make more sense.

When completing TDD in OOP, you end with the converse argument, does the class work? Classes always work when designed properly. 
Allowing an environment that makes arguments and code redundant is debt issue and would like to tackle this opinion with an example using a personalized BST. 

When creating the base, you generally start with a test case, then implement the code. Here, we want to create a PersonalTree class.



```
class PersonalTreeTest {

	@Test
	void testPersonalTreeClass() {
		fail("Not yet implemented");
	}
}
```
With the test created, we can go into the base and properly create a PersonalTree class.

```
public class PersonalTree { }
```

The test case environment requires at minimum these elements:
- testClass(), fail()
- testValidClass
- testValidEntity // BST

Let us continue with creating the ValidClass test. In this case, we create a Tree and simply assert it is true, created successfully.

```
void testIsValidPersonalTree() {
		// create PersonalTree class
		PersonalTree tree = new PersonalTree();
		assertEquals(tree, new PersonalTree());		
}
```

The test above enables us to do the following:
- import a Node library into our PersonalTree class
- Further express the PersonalTree class by setting default constructions that use the Node library

Given this is not a personally created Node class, of which has been tested time and time again, I excluded created the test cases for testing the 
Node, especially since this would be tested in another class, formally.

```
import com.example.Node;

public class PersonalTree {
	Node root;
	
	public PersonalTree() {
		root = null;
	}
}
```

The next step is to create the ValidEntity test. In this case, we would use the tested Node class methods and make sure that the Tree we are creating is 
a valid tree entity, specifically a BST.

```
void testIsValidBST(Node node, int min, int max) {
  if(node == null) assertTrue(true);
  
  if (node.getKey() < min || node.getKey() > max) assertTrue(false);
  
  
  while (node != null) {
    testIsValidBST(node.getLeft(), min, node.getKey() - 1);
    testIsValidBST(node.getRight(), node.getKey() + 1, max);
  }
  
  
  assertTrue(true);
}
```

Notice that after creating this test we did not have to add anything to the Tree class. This is a great example of what I like to call business logic 
testing. The business requires their own Tree model, and this is a great business logic test case to validate that the model the business requires is accurate.


The last step would be to create the function tests and implement the functions into the class. We will come back to this step later.
