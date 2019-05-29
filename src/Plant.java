public abstract class Plant {
    private String name;
    private double price;
    private String producingCountry;


    public Plant(String name, double price, String producingCountry) {
        this.name = name;
        this.price = price;
        this.producingCountry=producingCountry;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProducingCountry(){
        return producingCountry;
    }


    public String plantInformation() {
        StringBuilder builder = new StringBuilder();
        builder.append('\n').append("Name: ").append(name);
        builder.append('\n').append("Price: ").append(price);
        builder.append('\n').append("Producing Country: ").append(producingCountry);
        return builder.toString();
    }

}
