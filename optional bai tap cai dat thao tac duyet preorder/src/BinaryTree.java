public class BinaryTree {
    public Node root;
    public BinaryTree(){
        this.root=null;
    }

    public void insert(int key){
        this.root=insertRec(this.root,key);
    }

    private Node insertRec(Node node,int key){
        if(node == null){
            node=new Node(key);
            return node;
        }

        if(key < node.key)
            node.left=insertRec(node.left,key);
        else if(key > node.key)
            node.right=insertRec(node.right,key);

        return node;

    }

    public void print(){
        printPreOrder(this.root);
    }

    private void printPreOrder(Node node){
        if(node ==null)
            return;

        System.out.print(node.key+" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
}
