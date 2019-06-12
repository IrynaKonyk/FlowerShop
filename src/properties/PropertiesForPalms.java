package properties;

import java.util.Objects;

public class PropertiesForPalms implements IProperties{
    private double length;
    private int age;
    private boolean hasFruits;

    public PropertiesForPalms(double length, int age, boolean hasFruits) {
        this.length = length;
        this.age = age;
        this.hasFruits = hasFruits;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasFruits() {
        return hasFruits;
    }

    public void setHasFruits(boolean hasFruits) {
        this.hasFruits = hasFruits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertiesForPalms that = (PropertiesForPalms) o;
        return Double.compare(that.length, length) == 0 &&
                age == that.age &&
                hasFruits == that.hasFruits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, age, hasFruits);
    }

    @Override
    public String toString() {
        return  "length=" + length +
                ", age=" + age +
                ", hasFruits=" + hasFruits +
                '}';
    }
}
