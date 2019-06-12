package products;

public class Flowerpot extends Product {
    private Plant plant;
    private Pot pot;

    public Flowerpot(Plant plant, Pot pot, int amount) {
        super(plant.getDescription() + "in" + pot.getDescription(), amount);
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
                "description=" + getDescription() +
                ", amount="+ getAmount()+
                ", price=" + price() +
                ", plant=" + plant +
                ", pot=" + pot +
                '}';
    }
}
