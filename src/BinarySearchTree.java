public class BinarySearchTree {
    //Inorder Traversal - (left root right)
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // A utility function to search a given key in BST
    public Node search(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key)
            return root;

        // val is greater than root's key
        if (root.key > key)
            return search(root.left, key);

        // val is less than root's key
        return search(root.right, key);
    }

    //Root of BST
    Node root;

    //Constructor
    BinarySearchTree() {
        root = null;
    }

    // A utility function to insert a given key in BST
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
        }
        if (key < root.key) {
            insertRec(root.left, key);
        } else if (key > root.key) {
            insertRec(root.right, key);
        }
        return root;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    //A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    void inorder() {
        inorderRec(root);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        //create BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        //print inorder traversal of BST
        tree.inorder();
    }
}
