public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void delete(int key) {
        this.root = deleteRect(this.root, key);
    }

    private Node deleteRect(Node node, int key) {
        if (node == null) return node;

        if (key < node.key)
            node.left = deleteRect(node.left, key);
        else if (key > node.key)
            node.right = deleteRect(node.right, key);
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            node.key = getMinValue(node.right);
            node.right = deleteRect(node.right, node.key);
        }
        return node;
    }

    public int getMinValue(Node node) {
        int minValue = node.key;
        while (node.left != null) {
            minValue = node.left.key;
            node = node.left;
        }
        return minValue;
    }

    public void insert(int key) {
        this.root = insertRec(this.root, key);
    }

    private Node insertRec(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (key < node.key)
            node.left = insertRec(node.left, key);
        else if (key > node.key)
            node.right = insertRec(node.right, key);

        return node;
    }

    public void printPostOrder() {
        printPostOrder(this.root);
    }

    private void printPostOrder(Node node) {
        if (node == null)
            return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }
}



















































//public class BinaryTree {
//    public Node root;
//
//    public BinaryTree() {
//        this.root = null;
//    }
//
//    public void delete(int key) {
//        this.root = deleteRec(this.root, key);
//    }
//
//    private Node deleteRec(Node node,int key) {
//        if(node ==null) return null;
//
//        if(key > node.key)
//            node.right=deleteRec(node.right,key);
//        else if(key < node.key)
//            node.left= deleteRec(node.left,key);
//        else if(key == node.key){
//
//            if(node.left == null){
//                System.out.println("access return node right");
//                return node.right;
//            } else if(node.right ==null)
//            {
//                System.out.println("access return node left");
//                return node.left;
//            }
//
//            node.key=getMinValue(node.right);
//            node.right=deleteRec(node.right,node.key);
//        }
//        return node;
//    }
//    public int getMinValue(Node node){
//        int minValue= node.key;
//        while(node.left != null){
//            minValue=node.left.key;
//            node=node.left;
//        }
//        return minValue;
//    }
//
//    public void insert(int key) {
//        this.root = insertRec(this.root, key);
//    }
//
//    private Node insertRec(Node node, int key) {
//        if (node == null) {
//            node = new Node(key);
//            return node;
//        }
//        if (key < node.key)
//            node.left = insertRec(node.left, key);
//        else if (key > node.key)
//            node.right = insertRec(node.right, key);
//
//        return node;
//    }
//
//    private void printInOrder(Node node) {
//        if (node == null)
//            return;
//        printInOrder(node.left);
//        printInOrder(node.right);
//        System.out.print(node.key + " ");
//    }
//
//    public void printInOrder() {
//        printInOrder(this.root);
//    }
//}