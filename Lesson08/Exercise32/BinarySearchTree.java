//Public class holding the functions of Entire Binary Tree structure
public class BinarySearchTree {
    private Node parent;
    private int data;
    private int size = 0;

    public BinarySearchTree() {
        parent = new Node(data);
    }

    private class Node {
        Node left; // points to left node
        Node right; // points to right node
        int data;

        // constructor of Node
        public Node(int data) {
            this.data = data;
        }
    }

    /*
     * This is the method exposed as public for adding elements into the Tree. it
     * checks if the size == 0 and then adds the element into parent node. if parent
     * is already filled,creates a New Node with data and calls the add(parent,
     * newNode) to find the right root and add it to it.
     * 
     * @param data
     */
    public void add(int data) {
        if (size == 0) {
            parent.data = data;
            size++;
        } else {
            add(parent, new Node(data));
        }
    }

    /**
     * Takes two params, root node and newNode. As per BST, check if the root data
     * is > newNode data if true: newNode has to be added in left Node (again
     * recursively check if it has child nodes and the same logic of BST until it
     * reaches the leaf node to add value) else: newNode has to be added in right
     * (again recursively check if it has child nodes and the* same logic of BST
     * until it reaches the leaf node to add value)
     *
     * @param root
     * @param newNode
     */
    private void add(Node root, Node newNode) {
        if (root == null) {
            return;
        }
        if (newNode.data < root.data) {
            if (root.left == null) {
                root.left = newNode;
                size++;
            } else {
                add(root.left, newNode);
            }
        }
        if ((newNode.data > root.data)) {
            if (root.right == null) {
                root.right = newNode;
                size++;
            } else {
                add(root.right, newNode);
            }
        }
    }

    public void traverseLeft() {
        Node current = parent;
        System.out.print("Traverse the BST From Left : ");
        while (current.left != null && current.right != null) {
            System.out.print(current.data + "->[" + current.left.data + " " + current.right.data + "] ");
            current = current.left;
        }
        System.out.println("Done");
    }

    public void traverseRight() {
        Node current = parent;
        System.out.print("Traverse the BST From Right");
        while (current.left != null && current.right != null) {
            System.out.print(current.data + "->[" + current.left.data + " " + current.right.data + "] ");
            current = current.right;
        }
        System.out.println("Done");
    }

    /**
     * Main program to demonstrate the BST functionality. - Adding nodes - finding
     * High and low - Traversing left and right
     * 
     * @param args
     */
    public static void main(String args[]) {
        BinarySearchTree bst = new BinarySearchTree();
        // adding nodes into the BST
        bst.add(32);
        bst.add(50);
        bst.add(93);
        bst.add(3);
        bst.add(40);
        bst.add(17);
        bst.add(30);
        bst.add(38);
        bst.add(25);
        bst.add(78);
        bst.add(10);
        bst.traverseLeft();
        bst.traverseRight();
    }
}