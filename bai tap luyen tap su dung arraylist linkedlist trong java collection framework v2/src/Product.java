public class Product {
    private String productName;
    private int productId;
    private double productPrice;
    private static int nextId=1;


    public Product(){
        this.productName="";
        this.productPrice=0.0;
    }
    public Product(String name,double price){
        this.productName=name;
        this.productPrice=price;
    }

    {
        this.productId=nextId;
        nextId++;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

}
