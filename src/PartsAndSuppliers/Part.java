package PartsAndSuppliers;

// A class as a blueprint for creating an object
public class Part {
    // instance data for a part
    private int pno;
    private String name;
    private double weight;
    private String location;
    private String color;
    private double price;

    // Write a special function for constructing part objects
    // This function is called a "Constructor".

    public Part(int pno, String name, double weight, String location, String color, double price) {
        this.pno = pno;
        this.name = name;
        this.weight = weight;
        this.location = location;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Part{" +
                "pno=" + pno +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", location='" + location + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    // increase the price by n% where 0 <= n <= 1
    public void increasePrice(double n) {
        //this.price = this.price + this.price*n;
        this.price = this.price*(1 + n);
        // "this" inside of a class refers to the object
        // to the left of the "." where this method is called.
    }
}
