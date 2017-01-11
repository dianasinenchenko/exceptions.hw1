package school.lemon.changerequest.java.cafe.domain;

import school.lemon.changerequest.java.cafe.exceptions.ClientException;

import java.util.Random;

public class Client {

    public static final int LOWEST_TEMPERATURE = 30;
    public static final int HIGHEST_TEMPERATURE = 80;

    private final Random random = new Random();

    public void drinkCoffee(Drink drink) throws ClientException {
        if (drink.getDrinkType() != DrinkType.COFFEE) {
            throw new ClientException(
                    String.format("Tastes like a bla bla %d", drink.getDrinkType()));

        } else if (drink.getTemperature() < LOWEST_TEMPERATURE) {
            throw new ClientException(
                    String.format("Looks like it's too cold... "));

        } else if (drink.getTemperature() > HIGHEST_TEMPERATURE) {
            throw new ClientException(
                    String.format("Looks like it's too hot... "));

        } else if (random.nextInt(100) < 10) {
            throw new ClientException(
                    String.format("I don't like your Cafe!"));

        } else {
            throw new ClientException(
                    String.format("Delicious, thank you."));
                  }
    }

}
