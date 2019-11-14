package com.epam.ta.salad.Repository.SQLService;

import Entities.Vegetable;
import com.epam.ta.parking.util.NullCheckUtil;
import com.epam.ta.salad.Repository.SQLRepository.VegetableRepositoryImpl;
import com.epam.ta.salad.Repository.Service.VegetableService;
import static com.epam.ta.salad.Repository.util.VegetableFieldsValidator.*;
import exceptions.NullVegetableException;


import java.sql.SQLException;
import java.util.List;



public class VegetableServiceImpl implements VegetableService {



    private final VegetableRepositoryImpl vegetableRepositoryImpl;

    public VegetableServiceImpl(VegetableRepositoryImpl vegetableRepositoryImpl) {
        this.vegetableRepositoryImpl = vegetableRepositoryImpl;
    }

    @Override
    public Vegetable add(Vegetable vegetable) throws SQLException, ClassNotFoundException, NullVegetableException {
        Vegetable addVegetable = null;
        if (null != vegetable) {
            if (!NullCheckUtil.notNullCheck(vegetable.getName()) & (!NullCheckUtil.notNullCheck(vegetable.getId(),
                    (int) vegetable.getWeight(), (int) vegetable.getCalories()) & validateId(vegetable.getId()) &
                    validateWeight(vegetable.getWeight()) & validateCalories(vegetable.getCalories()) & validateNames(vegetable.getName()))) {
                throw new NullVegetableException("Vegetable contains null data");
            }

            try {
                VegetableRepositoryImpl vegetableRepositoryImpl = new VegetableRepositoryImpl();
                vegetableRepositoryImpl.add(vegetable);
                addVegetable = vegetable;
            } catch (SQLException e) {
                System.out.println("Unable to add a vegetable");
            }
        }
        return addVegetable;
    }

    @Override
    public Vegetable update(Vegetable vegetable) throws SQLException, NullVegetableException {
        Vegetable editedVegetable = vegetable;


        if (null != vegetable) {
            if (!NullCheckUtil.notNullCheck(vegetable.getName()) & (!NullCheckUtil.notNullCheck(vegetable.getId(),
                    (int) vegetable.getWeight(), (int) vegetable.getCalories())) & validateId(vegetable.getId()) &
            validateWeight(vegetable.getWeight()) & validateCalories(vegetable.getCalories()) & validateNames(vegetable.getName()))  {
                throw new NullVegetableException("Vegetable contains null data");
            }
            try {
                vegetableRepositoryImpl.update(editedVegetable);


            } catch (SQLException e) {
                System.out.println("Unable to update a vegetable");
            }
        }
        return editedVegetable;
    }


    public Vegetable remove(Vegetable vegetable) throws SQLException {
        try {
            this.vegetableRepositoryImpl.remove(this.getObjects(vegetable));

        } catch (Exception e) {
            System.out.println("Unable to remove object");
        }
        return vegetable;
    }

    @Override
    public Vegetable getObjects(Vegetable vegetable) throws SQLException {
        return null;
    }

    @Override
    public Vegetable getVegetablesFromFilter(List<Vegetable> vegetableList) {
        return null;
    }


}
