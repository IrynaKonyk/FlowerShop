//abstract because selling trees is just in progress
public abstract class Tree extends Plant{
    private int age;
    private double length;
    private double weight;
    public Tree(String name, double price, String producingCountry, int age, double length, double weight) {
        super(name, price, producingCountry);
        this.age=age;
        this.length=length;
        this.weight=weight;
    }

    public int getAge() {
        return age;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }
    public String plantInformation() {
        StringBuilder builder = new StringBuilder();
        builder.append('\n').append("Name: ").append(getName());
        builder.append('\n').append("Price: ").append(getPrice());
        builder.append('\n').append("Producing Country: ").append(getProducingCountry());
        builder.append('\n').append("Age: ").append(age);
        builder.append('\n').append("Length: ").append(length);
        builder.append('\n').append("Weight: ").append(weight);

        return builder.toString();
    }
}
