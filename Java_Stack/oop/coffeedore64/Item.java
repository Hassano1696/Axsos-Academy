public class Item {
    private String name;
    private double price;
    private int index;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return int return the index
     */
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index += index;
    }

    public void increaseCounter(){
        index+=1;
    }

}
