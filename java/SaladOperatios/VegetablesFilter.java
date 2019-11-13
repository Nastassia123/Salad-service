package SaladOperatios;

import Entities.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class VegetablesFilter {

    public List<Vegetable> findVegetableByParameters(List<Vegetable> salad, int filterForWeight, int filterForCalories){
       List<Vegetable> vegetableList = new ArrayList<Vegetable>();
        for (Vegetable vegetable:
                salad ) {
            if (vegetable.getWeight() == filterForWeight && vegetable.getCalories() == filterForCalories) {
               vegetableList.add(vegetable);
            }

        }
        return vegetableList;
    }
}


