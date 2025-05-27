public class FoodItem {
    // data fields
    private String description;
    private double size;
    private double price;

    // methods
    // postcondition: creates a new object with data
    // field values as specified by the arguments
    public FoodItem(String desc, double aSize,
            double aPrice) {
        description = desc;
        size = aSize;
        price = aPrice;
    }

    // postcondition: sets description to argument
    public void setDesc(String desc) {
        description = desc;
    }

    // postcondition: sets size to argument value
    public void setSize(double aSize) {
        size = aSize;
    }

    // postcondition: sets price to argument value
    public void setPrice(double aPrice) {
        price = aPrice;
    }

    // postcondition: returns the item description
    public String getDesc() {
        return description;
    }

    // postcondition: returns the item size
    public double getSize() {
        return size;
    }

    // postcondition: returns the item price
    public double getPrice() {
        return price;
    }

    // postcondition: returns string representing
    // the item state
    public String toString() {
        return description + ", size : " + size +
                ", price $" + price;
    }

    // postcondition: calculates & returns unit price
    public double calcUnitPrice() {
        return price / size;
    }
}