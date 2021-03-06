class BinaryNode<T>

{
   private T             data;
   private BinaryNode<T> leftChild;  // Reference to left child
   private BinaryNode<T> rightChild; // Reference to right child

   public BinaryNode()
   {
      this(null); // Call next constructor
   } // end default constructor

   public BinaryNode(T dataPortion)
   {
      this(dataPortion, null, null); // Call next constructor
   } // end constructor

   public BinaryNode(T dataPortion, BinaryNode<T> newLeftChild,
                                    BinaryNode<T> newRightChild)
   {
      data = dataPortion;
      leftChild = newLeftChild;
      rightChild = newRightChild;
   } // end constructor

   /** Retrieves the data portion of this node.
       @return  The object in the data portion of the node. */
   public T getData()
   {
      return data;
   } // end getData

   /** Sets the data portion of this node.
       @param newData  The data object. */
   public void setData(T newData)
   {
      data = newData;
   } // end setData

   /** Retrieves the left child of this node.
       @return  A reference to this node's left child. */
   public BinaryNode<T> getLeftChild()
   {
      return leftChild;
   } // end getLeftChild

   /** Sets this node’s left child to a given node.
       @param newLeftChild  A node that will be the left child. */
   public void setLeftChild(BinaryNode<T> newLeftChild)
   {
      leftChild = newLeftChild;
   } // end setLeftChild

   /** Detects whether this node has a left child.
       @return  True if the node has a left child. */
   public boolean hasLeftChild()
   {
      return leftChild != null;
   } // end hasLeftChild

   /** Retrieves the right child of this node.
    @return  A reference to this node's right child. */
   public BinaryNode<T> getRightChild()
   {
      return rightChild;
   } // end getRightChild
   
   /** Sets this node’s right child to a given node.
    @param newRightChild  A node that will be the right child. */
   public void setRightChild(BinaryNode<T> newRightChild)
   {
      rightChild = newRightChild;
   } // end setRightChild
   
   /** Detects whether this node has a right child.
    @return  True if the node has a right child. */
   public boolean hasRightChild()
   {
      return rightChild != null;
   } // end hasRightChild

   /** Detects whether this node is a leaf.
    @return  True if the node is a leaf. */
   public boolean isLeaf()
   {
      return (leftChild == null) && (rightChild == null);
   } // end isLeaf
  
   /**A Recursion Example in the BinaryNode Class  
    * Copies the subtree rooted at this node.
       @return  The root of a copy of the subtree rooted at this node. */
   public BinaryNode<T> copy()
   {
      BinaryNode<T> newRoot = new BinaryNode<>(data);
      if (leftChild != null)
         newRoot.setLeftChild(leftChild.copy());
      
      if (rightChild != null)
         newRoot.setRightChild(rightChild.copy());
      
      return newRoot;
   } // end copy

   /** --------------------------------------------------------------------
    * Part of Task 1 */
   /** A Recursive Method in the BinaryNode Class   
    * prints (using post-order traversal) all nodes of the subtree rooted at "this" node 
 * @return */
   public void postorderTraverse_binaryNodeMethod()
   {
      postorderTraverse_binaryNodeMethod(this);
   }
   private void postorderTraverse_binaryNodeMethod(BinaryNode<T> node)
   {
      if(node !=null)
      {
         //Here is the aformentioned "thing" in the loop. It will collect data of the left and right children, then get the data of the node itself.
         postorderTraverse_binaryNodeMethod(node.getLeftChild());
         postorderTraverse_binaryNodeMethod(node.getRightChild());
         System.out.println(node.getData());
      }
   }
   /**-------------------------------------------------------------------- 
    * Part of Task 2*/
   /** A Recursive Method in the BinaryNode Class   
    * Computes the height of the subtree rooted at "this" node.
   @return  The height of the subtree rooted at "this" node. */
   public int getHeight_binaryNodeMethod()
   {
      //Setting up the different integer values needed for the operation
      int heightRight = 0;
      int heightLeft = 0;
      int height = 0;
      //This if loop checks for whether or not the node is null. Should it be null, it will return height as is.
      if (this != null)
      {
         //First if loop checks for the right child being null. If it's not null, it will repeat and go deeper
         if (rightChild != null)
            heightRight = rightChild.getHeight_binaryNodeMethod();
         //The same applies to the left side.
         if (leftChild != null)
            heightLeft = leftChild.getHeight_binaryNodeMethod();
         //Once this loop finishes, it ends with returning our height. Which is 1 (the root) + the max node height.
         height = 1 + Math.max(heightRight, heightLeft);
      }
      return height;
   } // end getHeight
   /** -------------------------------------------------------------------- */
   /** A Recursive Method in the BinaryNode Class  
    * Counts the nodes in the subtree rooted at "this" node.
   @return  The number of nodes in the subtree rooted at "this" node. */
	public int getNumberOfNodes_binaryNodeMethod()
	{
      //Setting up the integers being used
	  int leftNumber = 0;
	  int rightNumber = 0;
     //Similar loop that checks for whether or not the child is null. If it isn't null, it will increment the number, and dig deeper.
	  if (leftChild != null)
	     leftNumber = leftChild.getNumberOfNodes_binaryNodeMethod();
      //Second verse same as the first
	  if (rightChild != null)
	     rightNumber = rightChild.getNumberOfNodes_binaryNodeMethod();
      //Once all is said and done, the node will return 1 (the root) + the left and right number of nodes.
	  return 1 + leftNumber + rightNumber;
	} // end getNumberOfNodes
	
} // end BinaryNode
