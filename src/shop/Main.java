package shop;

import enums.ColorEnum;
import enums.MaterialEnum;
import products.Pot;

public class Main {
    public static void main(String[] args) {


        Pot pot = new Pot("Pot", 100, 3.0, ColorEnum.BLACK, MaterialEnum.GLASS);
        System.out.println(pot.toString());
    }
}
