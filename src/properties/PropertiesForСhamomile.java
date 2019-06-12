package properties;

import enums.ColorEnum;
import enums.SizeEnum;

import java.util.Objects;

public class PropertiesForСhamomile implements IProperties  {
    private ColorEnum color;
    private SizeEnum flowerSize;
    private double stemLength;
    private int numberOfFlowers;

    public PropertiesForСhamomile(ColorEnum color, SizeEnum flowerSize, double stemLength, int numberOfFlowers) {
        this.color=color;
        this.flowerSize = flowerSize;
        this.stemLength = stemLength;
        this.numberOfFlowers = numberOfFlowers;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertiesForСhamomile that = (PropertiesForСhamomile) o;
        return Double.compare(that.stemLength, stemLength) == 0 &&
                numberOfFlowers == that.numberOfFlowers &&
                color == that.color &&
                flowerSize == that.flowerSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerSize, stemLength);
    }

    @Override
    public String toString() {
        return "PropertiesForСhamomile{" +
                "color=" + color +
                ", flowerSize=" + flowerSize +
                ", stemLength=" + stemLength +
                ", numberOfFlowers=" + numberOfFlowers +
                '}';
    }
}
