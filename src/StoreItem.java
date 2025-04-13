/**
 * CSC 331
 * @author Julianna Johnston, Danny Soza
 * Due Date: 05/21/25
 * Purpose:
 */

import java.util.Random;

/**
 * Store Item superclass
 * 6 attributes: String name, double price, int quantity, String returnPolicy, String brand, String ID
 * All subclasses inherit these attributes
 */
public class StoreItem {
    private String name;
    private double price;
    private int quantity;
    private String returnPolicy;
    public String brand;
    private String SKU;


    public StoreItem(String name, double price, int quantity, String returnPolicy, String brand) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.returnPolicy = returnPolicy;
        this.brand = brand;
        this.SKU = generateSKU();
    }

    public String toString() {
        return "Name: " + name + " , Price: " + price + " , Quantity: " + quantity + " , Return Policy: " + returnPolicy + " , Brand: " + brand;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReturnPolicy() {
        return this.returnPolicy;
    }

    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSKU() {
        return this.SKU;
    }


    private static String generateSKU() {
        char[] skuChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        int skuLength = 6;
        Random random = new Random();

        char[] SKU = new char[skuLength];
        for (int i = 0; i < skuLength; i++) {
            SKU[i] = skuChars[random.nextInt(skuChars.length)];
        }
        return new String(SKU);
    }
}
