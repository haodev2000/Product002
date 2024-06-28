package model;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private static final String name = "ABC Store";

    public static String getP(){
        return name;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getName() {
        return name;
    }

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "ProductId=" + productId +
                        ", ProductName='" + productName + '\'' +
                        ", Price=" + price + ", NameStore=" + name;
    }
}
