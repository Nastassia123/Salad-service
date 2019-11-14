package com.epam.ta.salad.Repository.SQLRepository;

import Entities.Salad;
import Entities.Vegetable;
import com.epam.ta.salad.Repository.Connection.SQLConnection;
import com.epam.ta.salad.Repository.ElementsMappers.VegetableMapper;
import com.epam.ta.salad.Repository.Repository.VegetableRepository;
import com.epam.ta.salad.Repository.RepositorySpecification.VegetableSpecification;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class VegetableRepositoryImpl implements VegetableRepository {
    private List<String> generatedColumns = new ArrayList();
    private static final String QUERY_FOR_ADD_REQUEST = "INSERT INTO vegetable VALUES(?, ?, ?, ?, ?)";
    private static final String QUERY_FOR_UPDATE_REQUEST = "UPDATE vegetable set name = ? WHERE id = ?";
    private static final String QUERY_FOR_REMOVE_REQUEST = "DELETE from vegetable WHERE name= ?";

    public int add(Vegetable vegetable) throws SQLException{
        generatedColumns.add("BATCHID");
        PreparedStatement vegetablePreparedStatement = new SQLConnection().SQLConnection()
         .prepareStatement(QUERY_FOR_ADD_REQUEST, new String[]{generatedColumns.get(1)});
        vegetablePreparedStatement.setInt(1,  vegetable.getId());
        vegetablePreparedStatement.setDouble(1,  vegetable.getWeight());
        vegetablePreparedStatement.setString(1,  vegetable.getName());
        vegetablePreparedStatement.setDouble(1,  vegetable.getCalories());
        vegetablePreparedStatement.executeQuery();
       ResultSet vegetablePreparedStatementGeneratedKeys = vegetablePreparedStatement.getGeneratedKeys();
        int z = 0;
        if (vegetablePreparedStatementGeneratedKeys.next()){
             z = vegetablePreparedStatementGeneratedKeys.findColumn("id");
        }
        return z;
    }

    public int update(Vegetable vegetable) throws SQLException {
        PreparedStatement statement = new SQLConnection().SQLConnection().prepareStatement(QUERY_FOR_UPDATE_REQUEST);
        statement.setString(1, "Pomidorro");
        statement.setInt(2, 1);
        int i = statement.executeUpdate();
        return i;
    }

    public int remove(Vegetable vegetable) throws SQLException {
        PreparedStatement statement = new SQLConnection().SQLConnection().prepareStatement(QUERY_FOR_UPDATE_REQUEST);
        statement.setString(1, "Pomidorro");
        statement.setInt(2, 1);
        int i = statement.executeUpdate();
        return i;
    }



        public List<Vegetable> getObjects(Salad salad) throws SQLException {
        return null;
    }

    public List<Vegetable> getObjects(VegetableSpecification vegetableSpecification) throws SQLException {
        PreparedStatement statement = new SQLConnection().SQLConnection().prepareStatement(vegetableSpecification.returnQueueOfEntity());
        ResultSet rs = statement.executeQuery();
        return(new VegetableMapper().readVegetablesToList(rs));
    }
}
