public class Cactus extends Flowerpot {
    private String kind;
    private String prickleSize;

    public Cactus(String name, double price, String producingCountry, String size, String jugType, boolean bloomingPossibility, String kind, String prickleSize) {
        super(name, price,  producingCountry, size, jugType, bloomingPossibility);
        this.kind=kind;
        this.prickleSize=prickleSize;

    }

    public String getKind() {
        return kind;
    }

    public String getPrickleSize() {
        return prickleSize;
    }
    public String plantInformation() {
        StringBuilder builder = new StringBuilder();
        builder.append('\n').append("Name: ").append(getName());
        builder.append('\n').append("Price: ").append(getPrice());
        builder.append('\n').append("Producing Country: ").append(getProducingCountry());
        builder.append('\n').append("Size: ").append(getSize());
        builder.append('\n').append("JugType : ").append(getJugType());
        builder.append('\n').append("Blooming Possibility: ").append(isBloomingPossibility());
        builder.append('\n').append("Kind: ").append(kind);
        builder.append('\n').append("Princle Size: ").append(prickleSize);
        return builder.toString();
    }
}
