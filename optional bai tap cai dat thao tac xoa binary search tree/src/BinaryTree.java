import org.w3c.dom.xpath.XPathResult;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void findNode(Node node, String findValue) {

        if (node == null) {
            return;
        }

        findNode(node.left, findValue);
        findNode(node.right, findValue);

        if (node.data.equals(findValue)) {
            if (node.parent == null)
                System.out.println("can't delete root");
            else {
                if (node.left == null && node.right == null) {
                    if (node.parent.left.data.equals(findValue)) {
                        node.parent.left = null;
                        node.parent = null;
                        System.out.println("delete " + node.data);
                        return;
                    }
                    if (node.parent.right.data.equals(findValue)) {
                        node.parent.right = null;
                        node.parent = null;
                        System.out.println("delete " + node.data);
                        return;
                    }
                }
            }
        }
    }
}
