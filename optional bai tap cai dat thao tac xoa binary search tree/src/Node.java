public class Node {
    public String data;
    public Node right,left,parent;
    public Node(String data){
        this.data=data;
        this.right=this.left=this.parent=null;
    }
    public Node(String data,Node parent,Node leftChild,Node rightChild){
        this.data=data;
        this.parent=parent;
        this.left=leftChild;
        this.right=rightChild;
    }
}
