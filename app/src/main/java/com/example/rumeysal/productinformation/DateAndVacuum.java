package com.example.rumeysal.productinformation;

/**
 * Created by rumeysal on 7/24/17.
 */

public class DateAndVacuum {

    private String date;
    private String VacuumValue;
    private  String GasValue;
    private  String PlasmaValue;

       //URUN bilgisi kısmınta tarih sorgularken gelen tarihi ve diğer değerleri arraylist e aktarmak için
    public DateAndVacuum(String date, String vacuumValue, String gasValue, String plasmaValue) {
        this.date = date;
        VacuumValue = vacuumValue;
        GasValue = gasValue;
        PlasmaValue = plasmaValue;
    }


    public String getGasValue() {
        return GasValue;
    }

    public String getPlasmaValue() {
        return PlasmaValue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVacuumValue() {
        return VacuumValue;
    }

    public void setVacuumValue(String vacuumValue) {
        VacuumValue = vacuumValue;
    }
}
