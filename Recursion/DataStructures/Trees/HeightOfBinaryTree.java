/**
  height of binary tree

  time complexity: O(n)
*/

class Node {
   int value;
   Node left, right;

   Node(int val) {
      value = val;
      left = right = null;
   }
}

class HeightOfBinaryTree {
   Node root;
   public static int height(Node root) {
     // base case
     if (root == null) return 0;

     int leftHeight = height(root.left);
     int rightHeight = height(root.right);

     return 1 + Math.max(leftHeight, rightHeight);
   }

   public static void main(String[] args) {
      Node root = null;
      root = new Node(15);
      root.left = new Node(10);
      root.right = new Node(20);
      root.left.left = new Node(8);
      root.left.right = new Node(12);
      root.right.left = new Node(16);
      root.right.right = new Node(25);

     System.out.println("The height of the binary tree is: " + height(root));
    }
}

   
