package gov.ng.gifmis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Mercedes");

        Collections.sort(cars);

        for (String car : cars  ) {
            System.out.println(car);
        }
    }
}
