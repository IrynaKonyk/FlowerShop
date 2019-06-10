package products;

public class Flowerpot extends Product {
    private Plant plant;
    private Pot pot;

    public Flowerpot(Plant plant, Pot pot) {
        super(plant.getName(), plant.getPrice() + pot.getPrice());
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
    public String toString() {
        return "Flowerpot{" +
                "plant=" + plant +
                ", pot=" + pot +
                '}';
    }
}
