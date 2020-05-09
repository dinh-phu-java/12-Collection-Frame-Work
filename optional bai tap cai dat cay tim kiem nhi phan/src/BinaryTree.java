public class BinaryTree {
    public Node root;

    public BinaryTree(){
        this.root=null;
    }

    public void insert(int key){
        this.root=insertRec(this.root,key);
    }

    public Node insertRec(Node node,int key){
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

    public int search(int key){
        return searchPostOrder(this.root,key);
    }

    public int searchPostOrder(Node node,int key){
        if(node == null)
            return -1;
        else if(node.key == key)
            return 1;
        searchPostOrder(node.left,key);
        searchPostOrder(node.right,key);

        return -1;
    }
}
