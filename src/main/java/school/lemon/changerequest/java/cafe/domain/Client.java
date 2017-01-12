package school.lemon.changerequest.java.cafe.domain;

import java.util.Random;

public class Client {

    public static final int LOWEST_TEMPERATURE = 30;
    public static final int HIGHEST_TEMPERATURE = 80;

    private final Random random = new Random();

    public void drinkCoffee(Drink drink) throws ClientException {
        if (drink.getDrinkType() != DrinkType.COFFEE)
            throw new ClientException(String.format("You wont %s ? are you sure ", drink.getDrinkType()));

        else if (drink.getTemperature() < LOWEST_TEMPERATURE)
            throw new ClientException(String.format("Looks like it's too cold... %d", drink.getTemperature()));

        else if (drink.getTemperature() > HIGHEST_TEMPERATURE)
            throw new ClientException(String.format("Looks like it's too hot... %d", drink.getTemperature()));

        else if (random.nextInt(100) < 10) throw new ClientException(String.format("I don't like your Cafe!"));

        else {
            throw new ClientException(String.format("Delicious, thank you."));
        }
    }


    public static class ClientException extends Exception {
        public ClientException() {
        }

        public ClientException(String message) {
            super(message);
        }

        public ClientException(String message, Throwable cause) {
            super(message, cause);
        }

        public ClientException(Throwable cause) {
            super(cause);
        }

        public ClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }

}