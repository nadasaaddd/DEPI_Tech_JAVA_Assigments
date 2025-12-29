package OOP_Assignment03.Part02;

public class OnlineStore {

    public static void main(String[] args) {
        Product p1 = new Product("321", "TV", 25999.99, true);
        printDetails(p1);
        p1.setPrice(999.99);
        p1.setPrice(-30);
        p1.setInStock(false);

        Product p2 = new Product("322","Laptop",14999.99,false);
        printDetails(p2);
    }

    public static void printDetails(Product p) {
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Product Price: " + p.getPrice());
        System.out.println("Product Stock Status: " + p.isInStock());
        System.out.println("--------------------");
    }
}


