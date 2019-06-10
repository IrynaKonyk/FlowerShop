package products;

public class Flowerpot extends Product {
    private Plant plant;
    private Pot pot;

    public Flowerpot(Plant plant, Pot pot) {
        super();
        setDescription(plant.getDescription()+"with" +pot.getDescription());
        setPrice(this.price());
        this.plant = plant;
        this.pot = pot;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public Pot getPot() {
        return pot;
    }

    public void setPot(Pot pot) {
        this.pot = pot;
    }

    @Override
    public double price() {
        return plant.price() + pot.price();
    }

    @Override
    public String toString() {
        return "Flowerpot{" +
                "plant=" + plant +
                ", pot=" + pot +
                '}';
    }
}
