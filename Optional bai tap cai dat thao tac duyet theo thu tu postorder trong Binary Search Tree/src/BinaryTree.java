public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void printPostOrder(Node node) {
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }
}
