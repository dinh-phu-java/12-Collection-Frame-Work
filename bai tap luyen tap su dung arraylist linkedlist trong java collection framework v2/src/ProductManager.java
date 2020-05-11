import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager  {
    private ArrayList<Product> listProduct;

    public ProductManager(){
        this.listProduct=new ArrayList<>();
    }
    public void addProduct(String name, double price) {
        Product myProduct= new Product(name,price);
        this.listProduct.add(myProduct);
    }

    public void editProductName(String oldProductName, String newProductName) {
        int indexValue=-1;
        indexValue= getIndexCompareByName(oldProductName);
        if(indexValue != -1){
            this.listProduct.set(indexValue,new Product(newProductName,this.listProduct.get(indexValue).getProductPrice()));
        }else{
            System.out.println("Can't find "+ oldProductName);
        }
    }

    public void deleteProduct(String productName) {
        int indexValue= -1;
        indexValue=getIndexCompareByName(productName);
        if (indexValue!= -1){
            this.listProduct.remove(indexValue);
        }else{
            System.out.println("can't delete "+productName);
        }
    }

    private int getIndexCompareByName(String productName){
        int indexValue=-1;
        for (int i =0 ;i < this.listProduct.size();i++){
            if (this.listProduct.get(i).getProductName().equals(productName)){
                indexValue=i;
            }
        }
        return indexValue;
    }

    public void displayList() {
        for (int i = 0; i < this.listProduct.size(); i++) {
            System.out.println("{ Id: "+this.listProduct.get(i).getProductId()+" , Name: "+this.listProduct.get(i).getProductName()+" ,Price: "+this.listProduct.get(i).getProductPrice()+" }");
        }
    }


    public int findElement(String findName){
        return findElementByBinarySearch(this.listProduct,findName);
    }
    private int findElementByBinarySearch(ArrayList<Product> myList, String findName) {
        int left = 0;
        int right = myList.size() - 1;
        while (right >= left) {
            int mid = (right + left) / 2;

            if (myList.get(mid).getProductName().compareTo(findName) > 0) {
                left = mid + 1;
            } else if (myList.get(mid).getProductName().compareTo(findName) < 0) {
                right = mid - 1;
            } else if (myList.get(mid).getProductName().equals(findName)) {
                return mid;
            }

        }
        return -1;
    }

    public void mySort(){
        Collections.sort(this.listProduct,new Comparator<Product>(){
            @Override
            public int compare(Product p1,Product p2){
                if(p1.getProductName().compareTo(p2.getProductName()) > 0) return 1;
                else return -1;
            }
        });
    }
}