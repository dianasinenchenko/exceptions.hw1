package school.lemon.changerequest.java.cafe.domain;

import java.util.Random;

public class Cafe {

    private final Random random = new Random();

    public void serve(Client client) throws Client.ClientException, Client.ClientExceptionNotACoffee {
        try{
        client.drinkCoffee(generateCup());


        }
        catch (Client.ClientExceptionNotACoffee e){
            throw new Client.ClientExceptionNotACoffee(String.format(" %s Sorry but we do not have this drink make another selection %s", e.getMessage(), generateCup().getDrinkType()));
        }

    }

    private Drink generateCup() {
        DrinkType[] drinkTypes = DrinkType.values();
        return new Drink(drinkTypes[random.nextInt(drinkTypes.length)], random.nextInt(100));
    }

}