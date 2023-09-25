package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Drink drink = new Drink();
        drink.name = "Mojito";
        drink.price = 13.0;
        drink.containsAlcohol = true;

        drink.ingredient1.name = "woda";
        drink.ingredient1.quantity = 150;

        drink.ingredient2.name = "sok cytrynowy";
        drink.ingredient2.quantity = 50;

        drink.ingredient3.name = "wódka";
        drink.ingredient3.quantity = 50;

        int capacity = drink.ingredient1.quantity + drink.ingredient2.quantity + drink.ingredient3.quantity;

        System.out.println("Drink: " + drink.name +
                            "\nCena: " + drink.price + "zł" +
                            "\nCzy zawiera alkohol? " + drink.containsAlcohol +
                            "\nSkładniki:\n" +
                            drink.ingredient1.name + "\n" +
                            drink.ingredient2.name + "\n" +
                            drink.ingredient3.name + "\n" +
                            "Pojemność: " + capacity + "ml");

    }
}
