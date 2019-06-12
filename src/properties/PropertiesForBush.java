package properties;

import enums.ColorEnum;
import enums.SizeEnum;

import java.util.Objects;

public class PropertiesForBush implements IProperties {
    private ColorEnum color;
    private SizeEnum flowerSize;
    private int numberOfFlowers;

    public PropertiesForBush(ColorEnum color, SizeEnum flowerSize, int numberOfFlowers) {
        this.color = color;
        this.flowerSize = flowerSize;
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

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    public void setNumberOfFlowers(int numberOfFlowers) {
        this.numberOfFlowers = numberOfFlowers;
    }

    @Override
    public String toString() {
        return "PropertiesForBush{" +
                "color=" + color +
                ", flowerSize=" + flowerSize +
                ", numberOfFlowers=" + numberOfFlowers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertiesForBush that = (PropertiesForBush) o;
        return numberOfFlowers == that.numberOfFlowers &&
                color == that.color &&
                flowerSize == that.flowerSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, flowerSize, numberOfFlowers);
    }
}
