import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest 
{
    @Test
	public void createTree1()
	{ 
        System.out.println("1st Testing Example:");
		BinaryTree<String> aTree = new BinaryTree<>();
		// Leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);
	} // end createTree
	
	/**-------------------------------------------------------------------- */
	/**Task 4: Create a tree case as shown in assignment 3*/
    @Test
	public void createTree2()
	{ 
        System.out.println("2nd Testing Example:");
		BinaryTree<String> aTree2 = new BinaryTree<>();
		// Leaves
		BinaryTree<String> fTree = new BinaryTree<>("F");
		BinaryTree<String> gTree = new BinaryTree<>("G");
		BinaryTree<String> hTree = new BinaryTree<>("H");
		BinaryTree<String> iTree = new BinaryTree<>("I");
		BinaryTree<String> jTree = new BinaryTree<>("J");
		BinaryTree<String> kTree = new BinaryTree<>("K");

		// Subtrees:
	
		BinaryTree<String> dTree = new BinaryTree<>("D", fTree, gTree);
		BinaryTree<String> eTree = new BinaryTree<>("E",hTree,iTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", jTree,kTree);
		BinaryTree<String> bTree = new BinaryTree<>("B",dTree,eTree);
	} // end createTree2
    
}
