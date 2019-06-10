package properties;

import products.Plant;

public class PropertiesForTree implements IProperties{
    private double length;
    private int age;
    private boolean hasFruits;

    public PropertiesForTree(double length, int age, boolean hasFruits) {
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
    public boolean equals(Plant plant) {
        return false;
    }
}
