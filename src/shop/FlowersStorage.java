package shop;

import enums.ColorEnum;
import enums.CountryEnum;
import enums.MaterialEnum;
import enums.SizeEnum;
import products.*;
import properties.PropertiesForBush;
import properties.PropertiesForPalms;
import properties.PropertiesForRoses;
import properties.PropertiesForСhamomile;

import java.util.ArrayList;
import java.util.Arrays;

public class FlowersStorage {
    public ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(
            new Flower("Rose", 20,60, CountryEnum.UKRAINE, new PropertiesForRoses(ColorEnum.RED, SizeEnum.BIG, 1.0, 1, SizeEnum.NONE )),
            new Flower("Chamomile", 40, 50,CountryEnum.HOLLAND,new PropertiesForСhamomile(ColorEnum.WHITE, SizeEnum.BIG, 0.5, 1)),
            new Flower("Marigold", 20, 35,CountryEnum.UKRAINE,new PropertiesForBush(ColorEnum.ORANGE, SizeEnum.SMALL, 10)),
            new Flower("Pions", 30, 35,CountryEnum.UKRAINE,new PropertiesForСhamomile(ColorEnum.PINK, SizeEnum.BIG, 0.85, 1)),
            new Flower("Violet", 15, 25,CountryEnum.POLAND,new PropertiesForBush(ColorEnum.VIOLET, SizeEnum.SMALL, 6)),
            new Pot("Vase", 3, 120, 2.5, ColorEnum.BLACK, MaterialEnum.GLASS),
            new Pot("Jug", 5, 300, 5.0, ColorEnum.WHITE, MaterialEnum.CERAMIC),
            new Pot("Pot", 10, 100, 3.0, ColorEnum.BLACK, MaterialEnum.EARTHEN),
            new Flowerpot(new Plant("Money Tree", 1, 90, CountryEnum.HOLLAND), new Pot("Pot", 1, 100, 1.0, ColorEnum.WHITE, MaterialEnum.EARTHEN),3),
            new Palm("Banana`s Palm", 4, 500,CountryEnum.AFRICA, new PropertiesForPalms(1.2, 2,  true)),
            new Flowerpot(new Plant("Azalea", 1, 80, CountryEnum.HOLLAND), new Pot("Pot", 1, 140, 2.0, ColorEnum.BLACK, MaterialEnum.CERAMIC),6),
            new Palm("Coconut`s Palm", 6, 600,CountryEnum.AFRICA, new PropertiesForPalms(1.6, 3,  true))));

}
