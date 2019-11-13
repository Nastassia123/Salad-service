package com.epam.ta.salad.Repository.Repository;

import Entities.Salad;
import Entities.Vegetable;

import java.sql.SQLException;
import java.util.List;

public interface SaladRepository extends VegetableRepository {


    int add(Salad salad) throws SQLException, ClassNotFoundException;

    int update(Salad salad) throws SQLException;

    int remove(Salad salad) throws SQLException;

    List<Vegetable> getObjects(Salad salad) throws SQLException;

}
