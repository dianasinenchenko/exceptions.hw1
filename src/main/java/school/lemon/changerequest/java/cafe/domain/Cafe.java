package school.lemon.changerequest.java.cafe.domain;

import school.lemon.changerequest.java.cafe.exceptions.ClientException;

import java.util.Random;

public class Cafe {

    private final Random random = new Random();

    public void serve(Client client) throws ClientException {
        try {
            client.drinkCoffee(generateCup());
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

    private Drink generateCup() {
        DrinkType[] drinkTypes = DrinkType.values();
        return new Drink(drinkTypes[random.nextInt(drinkTypes.length)], random.nextInt(100));
    }

}
