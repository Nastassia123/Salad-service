package com.epam.ta.salad.Repository.util;

import com.epam.ta.parking.util.NullCheckUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VegetableFieldsValidator {

    private final static String REG_ID_EXPRESSION = "[0-9]{1,5}";
    private final static String REG_WEIGHT_EXPRESSION = "^-?\\d*\\.\\d+$" + "|" + "^-?\\d+$";
    private final static String REG_NAME_EXPRESSION = "[a-zA-Z]{1,20}";
    private final static String REG_CALORIES_EXPRESSION = "^-?\\d*\\.\\d+$" + "|" + "^-?\\d+$";

    public static boolean validateId(Integer vegetableId) {

        Matcher idMatcher = null;
        if (NullCheckUtil.notNullCheck(vegetableId)) {
            idMatcher = Pattern.compile(REG_ID_EXPRESSION).matcher(String.valueOf(vegetableId));
            if (idMatcher.matches()) {
                return true;
            }
        }
        return false;
    }

    public static boolean validateWeight(Double vegetableWeight) {

        Matcher weightMatcher = null;
        if (NullCheckUtil.notNullCheck((int) (vegetableWeight.intValue()))) {
            weightMatcher = Pattern.compile(REG_WEIGHT_EXPRESSION).matcher(String.valueOf(vegetableWeight));
            if (weightMatcher.matches()) {
                return true;
            }
        }
        return false;
    }


    public static boolean validateCalories(Double vegetableCalories) {

        Matcher weightMatcher = null;
        if (NullCheckUtil.notNullCheck((int) (vegetableCalories.intValue()))) {
            weightMatcher = Pattern.compile(REG_CALORIES_EXPRESSION).matcher(String.valueOf(vegetableCalories));
            if (weightMatcher.matches()) {
                return true;
            }
        }
        return false;
    }


    public static boolean validateNames(String vegetableName) {

        Matcher weightMatcher = null;
        if (NullCheckUtil.notNullCheck(vegetableName)) {
            weightMatcher = Pattern.compile(REG_NAME_EXPRESSION).matcher(String.valueOf(vegetableName));
            if (weightMatcher.matches()) {
                return true;
            }
        }
        return false;
    }

}
