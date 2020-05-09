public class Main {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree();
        myTree.insert(10);
        myTree.insert(5);
        myTree.insert(20);
        myTree.insert(3);
        myTree.insert(7);
        myTree.insert(15);
        myTree.insert(25);
        myTree.insert(-1);
        myTree.insert(4);

        System.out.println("Before delete");


        myTree.printPostOrder();
        System.out.println();

        System.out.println("after delete");
        myTree.delete(-10);
        myTree.printPostOrder();
        System.out.println();


    }
}
