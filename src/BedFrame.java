/**
 * Mattress Class: subclass of StoreItem
 * 2 additional attributes: color and assemblyRequired
 */
class BedFrame extends StoreItem {
    private String color;
    private boolean assemblyRequired;

    /**
     * Constructor for BedFrame class that accepts 8 parameters
     * @param name String
     * @param price double
     * @param quantity int
     * @param size String
     * @param returnPolicy String
     * @param material String (wood, metal, fabric upholstery)
     * @param color String
     * @param assemblyRequired (boolean)
     */
    public BedFrame(String name, double price, int quantity, String size, String returnPolicy, String material, String color, boolean assemblyRequired\) {
        super(name, price, quantity, size, returnPolicy, material);
        this.color = color;
        this.assemblyRequired = assemblyRequired;
    }

    /***
     * getter for color
     * @return String instance of color
     */
    public String getColor() {return this.color;}

    /**
     * setter for color
     * @param color String
     */
    public void setColor(String color) {this.color = color;}

    /**
     * getter for AssemblyRequired
     * @return boolean instance of AssemblyRequired
     */
    public boolean getAssemblyRequired() {return this.assemblyRequired;}

    /**
     * Setter for assemblyRequired
     * @param assemblyRequired boolean
     */
    public void setAssemblyRequired(boolean assemblyRequired) {this.assemblyRequired = assemblyRequired;}



}
