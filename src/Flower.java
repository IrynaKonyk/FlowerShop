
public class Flower extends Plant {
    private String color;
    private double length;
    private String sort;

    public Flower(String name, double price, String producingCountry, String color, double length, String sort) {
        super(name, price, producingCountry);
        this.color=color;
        this.length=length;
        this.sort=sort;
    }

    public String getColor() {
        return color;
    }
    public double getLength(){
        return length;

    }
    public String getSort(){
        return sort;
    }

    public String plantInformation() {
        StringBuilder builder = new StringBuilder();
        builder.append('\n').append("Name: ").append(getName());
        builder.append('\n').append("Price: ").append(getPrice());
        builder.append('\n').append("Producing Country: ").append(getProducingCountry());
        builder.append('\n').append("Color: ").append(color);
        builder.append('\n').append("Length: ").append(length);
        builder.append('\n').append("Sort: ").append(sort);
        return builder.toString();
    }
}
