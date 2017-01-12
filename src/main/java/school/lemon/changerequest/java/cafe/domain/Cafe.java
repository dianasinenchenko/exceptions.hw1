package school.lemon.changerequest.java.cafe.domain;

import java.util.Random;

public class Cafe {

    private final Random random = new Random();

    public void serve(Client client) throws Client.ClientException, Client.ClientExceptionNotACoffee {
        try {
            client.drinkCoffee(generateCup());
        } catch (Client.ClientExceptionNotACoffee exceptionNotACoffee) {
            throw new Client.ClientExceptionNotACoffee(String.format(" %s Sorry but we do not have this drink make another selection %s", exceptionNotACoffee.getMessage(), generateCup().getDrinkType()));
        } catch (Client.ClientExceptionTemperatureIsHot exceptionTemperatureIsHot) {
            throw new Client.ClientExceptionTemperatureIsHot(String.format("%s Sorry we fix this now %s ", exceptionTemperatureIsHot.getMessage(), exceptionTemperatureIsHot.getCause()));
        } catch (Client.ClientExceptionTemperatureIsCold exceptionTemperatureIsCold) {
            throw new Client.ClientExceptionTemperatureIsCold(String.format("%s Sorry we fix this now %s", exceptionTemperatureIsCold.getMessage(), exceptionTemperatureIsCold.getCause()));
        }

    }

    private Drink generateCup() {
        DrinkType[] drinkTypes = DrinkType.values();
        return new Drink(drinkTypes[random.nextInt(drinkTypes.length)], random.nextInt(100));
    }

}