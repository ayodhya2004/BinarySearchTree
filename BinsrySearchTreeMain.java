package binarytree;

public class BinsrySearchTreeMain {

	    public static void main(String[] args) {
	        BinarySearchTree tree = new BinarySearchTree();

	        // Inserting the nodes to form the given BST
	        tree.insert(8);
	        tree.insert(3);
	        tree.insert(10);
	        tree.insert(1);
	        tree.insert(6);
	        tree.insert(14);
	        tree.insert(4);
	        tree.insert(7);
	        tree.insert(13);

	        // Printing the in-order traversal of the tree
	        tree.printInorder();

	        // Finding nodes in the tree
	        int[] nodesToFind = {6, 13, 15};
	        for (int val : nodesToFind) {
	            boolean found = tree.findNode(val);
	            System.out.println("Node " + val + " found: " + found);
	        }
	    }
	}