package properties;

import enums.ColorEnum;
import enums.SizeEnum;

import java.util.Objects;

public class PropertiesForRoses implements IProperties{
    private ColorEnum color;
    private SizeEnum flowerSize;
    private double stemLength;
    private int numberOfFlowers;
    private SizeEnum thornLength;

    public PropertiesForRoses(ColorEnum color, SizeEnum flowerSize, double stemLength, int numberOfFlowers, SizeEnum thornLength) {
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

    public SizeEnum getThornLength() {
        return thornLength;
    }

    public void setThornLength(SizeEnum thornLength) {
        this.thornLength = thornLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertiesForRoses that = (PropertiesForRoses) o;
        return Double.compare(that.stemLength, stemLength) == 0 &&
                numberOfFlowers == that.numberOfFlowers &&
                color == that.color &&
                flowerSize == that.flowerSize &&
                thornLength == that.thornLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, flowerSize, stemLength, numberOfFlowers, thornLength);
    }

    public String toString() {
        return  "color=" + color +
                ", flowerSize=" + flowerSize +
                ", stemLength=" + stemLength +
                ", numberOfFlowers=" + numberOfFlowers +
                ", thornLength=" + thornLength +
                '}';
    }
}
