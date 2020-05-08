public class Main {
    public static void main(String[] args) {
        BinaryTree myTree=new BinaryTree();
        myTree.root=new Node("A");
        myTree.root.left=new Node("B");
        myTree.root.right=new Node("C");
        myTree.root.left.left=new Node("D");
        myTree.root.left.right=new Node("E");
        myTree.root.right.left=new Node("F");
        myTree.root.right.right= new Node("G");

        myTree.printPostOrder(myTree.root);


    }
}
