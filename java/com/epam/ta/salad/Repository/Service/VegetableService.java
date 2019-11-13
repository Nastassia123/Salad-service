package com.epam.ta.salad.Repository.Service;

import Entities.Vegetable;
import com.epam.ta.salad.Repository.RepositorySpecification.VegetableSpecification;
import exceptions.NullVegetableException;

import java.sql.SQLException;
import java.util.List;

public interface VegetableService extends BaseService<Vegetable> {
    Vegetable add(Vegetable vegetable) throws SQLException, ClassNotFoundException, NullVegetableException;

    Vegetable update(Vegetable vegetable) throws SQLException, NullVegetableException;

    Vegetable remove(Vegetable vegetable) throws SQLException;

   Vegetable getObjects(Vegetable vegetable) throws SQLException;

     Vegetable  getVegetablesFromFilter(List<Vegetable> vegetableList);

}
