package com.epam.ta.salad.Repository.Service;

import Entities.Salad;
import exceptions.NullVegetableException;

import java.sql.SQLException;
import java.util.List;

public interface BaseService<T> {

    T add(T t) throws SQLException, ClassNotFoundException, NullVegetableException;

    T update(T t) throws SQLException, NullVegetableException;

    T remove(T t) throws SQLException;

     //<T> readObjects(Salad salad) throws SQLException;


}
