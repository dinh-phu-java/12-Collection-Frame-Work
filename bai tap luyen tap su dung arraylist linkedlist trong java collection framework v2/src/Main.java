import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ProductManager myProductList= new ProductManager();
        myProductList.addProduct("Iphone",8605.5);
        myProductList.addProduct("Nokia",7416.9);
        myProductList.addProduct("Nexus",11239.2);
        myProductList.addProduct("Aeo",1239.2);
        myProductList.addProduct("Bphone",239.2);
        System.out.println("Before delete: ");
        myProductList.displayList();

        myProductList.editProductName("Nexus","Redmi");

        if (myProductList.findElement("Redmi")!= -1){
            System.out.println("found");
        }else{
            System.out.println("can't found");
        }

        myProductList.mySort();
        System.out.println("After action: ");
        myProductList.displayList();


    }
}
