/**
 * Mattress Class: subclass of StoreItem
 * 3 additional attributes: thickness, weightCapacity, firmness
 */
class Mattress extends StoreItem {
    private double thickness;
    private double weightCapacity;

    /**
     * Constructor for Mattress class that accepts 9 parameters
     * @param name String
     * @param price double
     * @param quantity int
     * @param size String (twin, full, queen, king, etc)
     * @param returnPolicy String
     * @param material (polyurethane, wool, cotton, etc)
     * @param thickness double
     * @param weightCapacity double
     */
    public Mattress(String name, double price, int quantity, String size, String returnPolicy, String material, double thickness, double weightCapacity) {
        super(name, price, quantity, size, returnPolicy, material);
        this.thickness = thickness;
        this.weightCapacity = weightCapacity;

    }

    @Override
    public String getReturnPolicy() {
        return "Returnable in 30 days with no damages";
    }

    /**
     * getter for thickness
     * @return String instance of thickness
     */
    public double getThickness() {return this.thickness;}

    /**
     * setter for thickness
     * @param thickness double
     */
    public void setThickness(double thickness) {this.thickness = thickness;}

    /**
     * getter for weightCapacity
     * @return double instance of weightCapacity
     */
    public double getWeightCapacity() {return this.weightCapacity;}

    /**
     * setter for weight capacity
     * @param weightCapacity double
     */
    public void setWeightCapacity(double weightCapacity) {this.weightCapacity = weightCapacity;}

}
