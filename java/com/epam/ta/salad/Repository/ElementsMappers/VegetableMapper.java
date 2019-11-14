package com.epam.ta.salad.Repository.ElementsMappers;

import Entities.Vegetable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VegetableMapper {
    private final String idColumn = "id";
    private final String weightColumn = "weight";
    private final String nameColumn = "name";
    private final String caloriesColumn = "calories";

    public List<Vegetable> readVegetablesToList(ResultSet rs) throws SQLException {
        List<Vegetable> vegetableList = new ArrayList<Vegetable>();
        while (rs.next()) {
        int id = rs.getInt(idColumn);
        double weight = rs.getDouble(weightColumn);
        String name = rs.getString(nameColumn);
        double calories = rs.getDouble(caloriesColumn);

       vegetableList.add(new Vegetable(id, weight, name, calories) {
        });
    }
        return vegetableList;
}
}
