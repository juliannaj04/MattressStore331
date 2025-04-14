/**
 * CSC 331
 * @author Julianna Johnston, Danny Soza, Caleb Joines,
 * Due Date: 05/21/25
 * Purpose:
 */

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/**
 * Store Item superclass
 * 6 attributes: String name, double price, int quantity, String returnPolicy, String material, String size, String SKU
 * All subclasses inherit these attributes
 */
public abstract class StoreItem {
    private String name;
    private double price;
    private int quantity;
    public String size;
    private String returnPolicy;
    private String material;
    private String SKU;
    public static List<String> skuList = new ArrayList<>();
    private static final char[] skuChars = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };



    /**
     * Constructor with 6 attributes as parameters
     * @param name item name: String
     * @param price item price: double
     * @param quantity item quantity: int
     * @param size item size: String
     * @param returnPolicy item return policy: String
     * @param material item brand: String
     */
    public StoreItem(String name, double price, int quantity, String size, String returnPolicy, String material) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.returnPolicy = returnPolicy;
        this.material = material;
        this.SKU = generateSKU();
    }

    /**
     * toString method for StoreItem that includes name, category, price, and quantity
     * @return String representation of StoreItem
     */
    public String toString() {
        return "Name: " + name + " , Price: " + price + " , Quantity: " + quantity + " , Size: " + size + " , Return Policy: " + returnPolicy + " , Material: " + material;
    }

    /**
     * Getter for name
     * @return instance of String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for price
     * @return instance of double price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * setter for price
     * @param price double
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter for quantity
     * @return instance of int quantity
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * setter for quantity
     * @param quantity int
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * getter for size
     * @return instance of String size
     */
    public String getSize() {return this.size;}

    /**
     * setter for String size
     * @param size String
     */
    public void setSize(String size) {this.size = size;}

    /**
     * getter for return policy
     * @return String instance return policy
     */
    public String getReturnPolicy() {
        return this.returnPolicy;
    }

    /**
     * setter for return policy
     * @param returnPolicy String
     */
    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    /**
     * getter for brand
     * @return instance of String brand
     */
    public String getMaterial() {
        return this.material;
    }

    /**
     * setter for brand
     * @param material String
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * getter for SKU
     * @return String instance of SKU
     */
    public String getSKU() {
        return this.SKU;
    }

    /**
     * Generates random 6 alphanumeric String
     * @return String SKU
     */
    public static String generateSKU() {
        Random random = new Random();
        int skuLength = 6;

        while (true) {
            char[] skuCharsGenerated = new char[skuLength];
            for (int i = 0; i < skuLength; i++) {
                skuCharsGenerated[i] = skuChars[random.nextInt(skuChars.length)];
            }

            String newSKU = new String(skuCharsGenerated);

            if (!skuList.contains(newSKU)) {
                skuList.add(newSKU);
                return newSKU;
            }
        }
    }
}
