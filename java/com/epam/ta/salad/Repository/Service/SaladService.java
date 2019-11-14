package com.epam.ta.salad.Repository.Service;

import Entities.Salad;
import Entities.Vegetable;
import exceptions.NullVegetableException;

import java.sql.SQLException;
import java.util.List;

public interface SaladService extends BaseService<Salad>{

    Salad add(Salad salad) throws SQLException, ClassNotFoundException;

    Salad update(Salad salad) throws SQLException;

    Salad remove(Salad salad) throws SQLException;

    List<Vegetable> getObjects(Salad salad) throws SQLException, NullVegetableException;


}
