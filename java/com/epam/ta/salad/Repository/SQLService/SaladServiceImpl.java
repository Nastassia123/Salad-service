package com.epam.ta.salad.Repository.SQLService;

import Entities.Salad;
import Entities.Vegetable;
import com.epam.ta.parking.util.NullCheckUtil;
import com.epam.ta.salad.Repository.Repository.SaladRepository;
import com.epam.ta.salad.Repository.RepositorySpecification.VegetableSpecification;
import com.epam.ta.salad.Repository.SQLRepository.VegetableRepositoryImpl;
import com.epam.ta.salad.Repository.Service.SaladService;
import exceptions.NullVegetableException;

import java.sql.SQLException;
import java.util.List;

public class SaladServiceImpl implements SaladService {
    @Override
    public Salad add(Salad salad) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Salad update(Salad salad) throws SQLException {
        return null;
    }

    @Override
    public Salad remove(Salad salad) throws SQLException {
        return null;
    }

    @Override
    public List<Vegetable> getObjects(Salad salad) throws SQLException, NullVegetableException {
        List<Vegetable> saladofVegetables = null;
        if (null != salad) {
            if (!NullCheckUtil.notNullCheck(String.valueOf((salad.getSalad())))){
                throw new NullVegetableException("Salad is empty");
            }
            try {
                VegetableRepositoryImpl vegetableRepositoryImpl = new VegetableRepositoryImpl();
                VegetableSpecification specification = new VegetableSpecification();
               saladofVegetables = vegetableRepositoryImpl.getObjects(specification);

            }
            catch (SQLException e) {
                System.out.println("Unable to read vegetables from Salad");
            }
        }
        return saladofVegetables;
    }
    }

