package properties;

import Enums.ColorEnum;
import Enums.SizeEnum;
import products.Plant;

public class PropertiesForRoses implements IProperties{
    private ColorEnum color;
    private SizeEnum flowerSize;
    private double stemLength;
    private int numberOfFlowers;
    private double thornLength;

    public PropertiesForRoses(ColorEnum color, SizeEnum flowerSize, double stemLength, int numberOfFlowers, double thornLength) {
        this.color = color;
        this.flowerSize = flowerSize;
        this.stemLength = stemLength;
        this.numberOfFlowers = numberOfFlowers;
        this.thornLength = thornLength;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public SizeEnum getFlowerSize() {
        return flowerSize;
    }

    public void setFlowerSize(SizeEnum flowerSize) {
        this.flowerSize = flowerSize;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    public void setNumberOfFlowers(int numberOfFlowers) {
        this.numberOfFlowers = numberOfFlowers;
    }

    public double getThornLength() {
        return thornLength;
    }

    public void setThornLength(double thornLength) {
        this.thornLength = thornLength;
    }

    @Override
    public boolean equals(Plant plant) {
        return false;
    }

    @Override
    public String toString() {
        return "PropertiesForRoses{" +
                "color=" + color +
                ", flowerSize=" + flowerSize +
                ", stemLength=" + stemLength +
                ", numberOfFlowers=" + numberOfFlowers +
                ", thornLength=" + thornLength +
                '}';
    }
}
