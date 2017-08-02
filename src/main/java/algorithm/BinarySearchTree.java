package algorithm;

public class BinarySearchTree {
    public static class Node {
        public int value;
        public Node left, right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean contains(Node root, int value) {
        if (root == null)
            return false;
        if (root.value == value)
            return true;
        if (root.value < value)
            return contains(root.right, value);
        if (root.value > value)
            return contains(root.left, value);
        return false;
    }
}
