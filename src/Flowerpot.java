public class Flowerpot extends Plant {
    private String size;
    private String jugType;
    private boolean bloomingPossibility;

    public Flowerpot(String name, double price, String producingCountry, String size, String jugType, boolean bloomingPossibility ) {
        super(name, price, producingCountry);
        this.size = size;
        this.jugType = jugType;
        this.bloomingPossibility=bloomingPossibility;
    }
    public String getSize(){
        return size;

    }
    public String getJugType(){
        return jugType;
    }
    public boolean isBloomingPossibility(){
        return bloomingPossibility;
    }
    public String plantInformation() {
        StringBuilder builder = new StringBuilder();
        builder.append('\n').append("Name: ").append(getName());
        builder.append('\n').append("Price: ").append(getPrice());
        builder.append('\n').append("Producing Country: ").append(getProducingCountry());
        builder.append('\n').append("Size: ").append(size);
        builder.append('\n').append("JugType : ").append(jugType);
        builder.append('\n').append("Blooming Possibility: ").append(bloomingPossibility);
        return builder.toString();
    }

}
