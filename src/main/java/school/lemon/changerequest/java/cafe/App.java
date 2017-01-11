package school.lemon.changerequest.java.cafe;

import school.lemon.changerequest.java.cafe.domain.Cafe;
import school.lemon.changerequest.java.cafe.domain.Client;
import school.lemon.changerequest.java.cafe.exceptions.ClientException;

public class App {




    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        for (int i = 0; i < 1000; ++i) {
            try {
                cafe.serve(new Client());
            } catch (ClientException ex) {
                System.out.println("run ex "+ ex.getMessage());
            }
        }
    }

}
