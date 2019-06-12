package shop;

import products.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlowersStorage storage = new FlowersStorage();
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Flower Shop!");
        System.out.println("Choose please, what do you want to buy: ");
        System.out.println("Goods in our shop:");
        System.out.println("1 - Flowers, 2 - Vase/Pots, 3 - FlowerPots, 4 - Bouquet, 5 - Palms, 6 - exit");
        int choose = scanner.nextInt();
        System.out.println(choose);
        switch (choose) {
            case 1: {
                System.out.println("You can buy such flowers:");
                for (Product product :
                        storage.products
                ) {
                    if (product.getClass() == products.Flower.class) {
                        System.out.println(product.toString());
                    }

                }
                break;
            }
            case 2: {
                System.out.println("You can buy such Pots:");
                for (Product product :
                        storage.products
                ) {
                    if (product.getClass() == products.Pot.class) {
                        System.out.println(product.toString());
                    }

                }
                break;
            }
            case 3:{
                System.out.println("You can buy such FlowerPots:");
                for (Product product :
                        storage.products
                ) {
                    if (product.getClass() == products.Flowerpot.class) {
                        System.out.println(product.toString());
                    }

                }
                break;

            }
            case 5 :{
                System.out.println("You can buy such Palms:");
                for (Product product :
                        storage.products
                ) {
                    if (product.getClass() == products.Palm.class) {
                        System.out.println(product.toString());
                    };

                }
                System.out.println("Enter name of Palm you want to buy");
                String name=scanner.nextLine();
                
                break;

            }
        }


    }
}

