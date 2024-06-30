package binarytree;

class BinarySearchTree {
	TreeNode3 root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Function to insert a node in the tree
    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    // Recursive function to insert nodes in the tree
    private TreeNode3 insertRecursive(TreeNode3 root, int val) {
        if (root == null) {
            root = new TreeNode3(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);
        }

        return root;
    }

    // Function to find a node in the tree
    public boolean findNode(int val) {
        return findNodeRecursive(root, val);
    }

    // Recursive function to find a node in the tree
    private boolean findNodeRecursive(TreeNode3 root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        }

        if (val < root.val) {
            return findNodeRecursive(root.left, val);
        } else {
            return findNodeRecursive(root.right, val);
        }
    }

    // Function to print the tree in inorder traversal
    public void printInorder() {
        System.out.print("In-order traversal: ");
        inOrderRecursive(root);
        System.out.println();
    }

    // Recursive function to perform inorder traversal
    private void inOrderRecursive(TreeNode3 root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.val + " ");
            inOrderRecursive(root.right);
        }
    }
}

