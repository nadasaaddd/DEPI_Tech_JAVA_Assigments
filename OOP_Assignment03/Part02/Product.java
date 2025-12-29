package OOP_Assignment03.Part02;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private boolean inStock;

    public Product(String productId, String productName, double price, boolean inStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.inStock = inStock;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setPrice(double newPrice) {
        System.out.println(productName + " Current Price is: " + price);

        if (newPrice < 0) {
            System.out.println("Error, a negative price!!!  ==> " + newPrice);
        } else {
            price = newPrice;
            System.out.println(productName + " Updated price is: " + price);
        }
        System.out.println("--------------------");
    }

    public void setInStock(boolean status) {
        System.out.println(productName + " Current stock status: " + inStock);
        inStock = status;
        System.out.println(productName + " NEW stock status: " + inStock);
        System.out.println("--------------------");
    }
}