public class Main {
    public static void main(String[] args) {
        ProductManager myProductList= new ProductManager();
        myProductList.addProduct("Iphone",8605.5);
        myProductList.addProduct("Nokia",7416.9);
        myProductList.addProduct("Nexus",11239.2);
        System.out.println("Before delete: ");
        myProductList.displayList();

        myProductList.deleteProduct("Nexus");

        System.out.println("After delete: ");
        myProductList.displayList();
    }
}
