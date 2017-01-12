package school.lemon.changerequest.java.cafe.domain;

import java.util.Random;

public class Client {

    public static final int LOWEST_TEMPERATURE = 30;
    public static final int HIGHEST_TEMPERATURE = 80;

    private final Random random = new Random();

    public void drinkCoffee(Drink drink) throws ClientException, ClientExceptionNotACoffee, ClientExceptionTemperatureIsHot, ClientExceptionTemperatureIsCold {
        if (drink.getDrinkType() != DrinkType.COFFEE)
            throw new ClientExceptionNotACoffee(String.format("I wont %s  ", drink.getDrinkType()));

        else if (drink.getTemperature() < LOWEST_TEMPERATURE)
            throw new ClientExceptionTemperatureIsCold(String.format("Looks like it's too cold... %d", drink.getTemperature()));

        else if (drink.getTemperature() > HIGHEST_TEMPERATURE)
            throw new ClientExceptionTemperatureIsHot(String.format("Looks like it's too hot... %d", drink.getTemperature()));

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

    public static class ClientExceptionNotACoffee extends ClientException {

        public ClientExceptionNotACoffee() {
        }

        public ClientExceptionNotACoffee(String message) {
            super(message);
        }

        public ClientExceptionNotACoffee(String message, Throwable cause) {
            super(message, cause);
        }

        public ClientExceptionNotACoffee(Throwable cause) {
            super(cause);
        }

        public ClientExceptionNotACoffee(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }

    public static class ClientExceptionTemperatureIsHot extends ClientException {

        public ClientExceptionTemperatureIsHot() {
        }

        public ClientExceptionTemperatureIsHot(String message) {
            super(message);
        }

        public ClientExceptionTemperatureIsHot(String message, Throwable cause) {
            super(message, cause);
        }

        public ClientExceptionTemperatureIsHot(Throwable cause) {
            super(cause);
        }

        public ClientExceptionTemperatureIsHot(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }

    public static class ClientExceptionTemperatureIsCold extends ClientException {

        public ClientExceptionTemperatureIsCold() {
        }

        public ClientExceptionTemperatureIsCold(String message) {
            super(message);
        }

        public ClientExceptionTemperatureIsCold(String message, Throwable cause) {
            super(message, cause);
        }

        public ClientExceptionTemperatureIsCold(Throwable cause) {
            super(cause);
        }

        public ClientExceptionTemperatureIsCold(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}