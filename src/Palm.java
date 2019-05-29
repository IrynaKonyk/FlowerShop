public class Palm extends Tree {
    private boolean hasFruits;

    public Palm(String name, double price,  String producingCountry, int age, double length, double weight, boolean hasFruits) {
        super(name, price, producingCountry, age, length, weight);
        this.hasFruits=hasFruits;

    }

    public boolean isHasFruits() {
        return hasFruits;
    }
    public String plantInformation() {
        StringBuilder builder = new StringBuilder();
        builder.append('\n').append("Name: ").append(getName());
        builder.append('\n').append("Price: ").append(getPrice());
        builder.append('\n').append("Producing Country: ").append(getProducingCountry());
        builder.append('\n').append("Age: ").append(getAge());
        builder.append('\n').append("Length: ").append(getLength());
        builder.append('\n').append("Weight: ").append(getWeight());
        builder.append('\n').append("Has Fruits: ").append(hasFruits);

        return builder.toString();
    }
}
