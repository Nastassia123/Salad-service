package SaladOperatios;

import Entities.Vegetable;

import java.util.List;

public class SaladCaloriesCalculator {

    public double calculateCalories(List<Vegetable> saladlist) {

        double caloriescounter = 0;
        for (Vegetable vegetableFromSalad :
                saladlist) {
            double caloriesCounter = saladlist.stream().map(x -> x.getCalories()).count();
            //calories += vegetableFromSalad.getCalories() * vegetableFromSalad.getWeight() / 100;
        }
        return caloriescounter;
    }
}



