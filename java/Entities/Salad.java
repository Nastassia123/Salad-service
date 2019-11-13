package Entities;

import java.util.ArrayList;
import java.util.List;

public class Salad {

    private List<Vegetable> salad;



    public List<Vegetable> getSalad() {
        return salad;
    }

    public void setSalad(){
        this.salad = salad;

    }

    public Salad(List<Vegetable> salad){
        this.salad = salad;

    }
}
