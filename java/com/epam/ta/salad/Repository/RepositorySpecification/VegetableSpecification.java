package com.epam.ta.salad.Repository.RepositorySpecification;

public class VegetableSpecification extends Specification {

    public final static String QUEUE_TO_SELECT_VEGETABLE = "select * from vegetable";

    public String returnQueueOfEntity() {
        return QUEUE_TO_SELECT_VEGETABLE;
    }
}
