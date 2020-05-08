public class Main {
    public static void main(String[] args) {
        BinaryTree myTree= new BinaryTree();
        myTree.root=new Node("A");
        myTree.root.left=new Node("B",myTree.root,null,null);
        myTree.root.right=new Node("C",myTree.root,null,null);
        myTree.root.left.left=new Node("D",myTree.root.left,null,null);
        myTree.root.left.right=new Node("E",myTree.root.left,null,null);
        myTree.root.right.left=new Node("D",myTree.root.right,null,null);
        myTree.root.right.right=new Node("E",myTree.root.right,null,null);

        myTree.findNode(myTree.root,"E");

    }
}
