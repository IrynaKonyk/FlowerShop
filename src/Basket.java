import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Plant> plantsInBasket;

    public Basket(){
        plantsInBasket=new ArrayList<>();

    }

    public void addPlantToBasket(Plant plant){

        plantsInBasket.add(plant);

    }

}
