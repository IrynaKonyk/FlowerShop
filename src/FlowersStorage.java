import java.util.ArrayList;
import java.util.Arrays;

public class FlowersStorage {
    public static ArrayList<Plant> plants =new ArrayList<>(Arrays.asList(
            new Flower("Rose", 60, "Ukraine", "White", 0.8,"Special"),
            new Flower("Tulip", 40, "Holland", "Red", 0.2,"Special"),
            new Flowerpot("orchid",200, "Poland", "small","glass",true),
            new Cactus("Opuntia", 300, "Sourth America","big", "glass", true,"Usual","small"),
            new Palm("Banana`s", 1040, "Africa",5, 1.2, 12, true)));



}
