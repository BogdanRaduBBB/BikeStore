package ro.itschool.repository;

import ro.itschool.pojo.SuperSport;

import java.util.ArrayList;
import java.util.List;

public class SuperSportRepository {

    public static SuperSport[] getAllSuperSports() {
        SuperSport[] superSports = new SuperSport[10];
        List<String> features =new ArrayList<String>();
        features.add("Traction control");
        features.add("ABS");
        features.add("Digital display");
        superSports[0] = new SuperSport(1, 4999, "600RR", "Honda", 2012, features);
        superSports[1] = new SuperSport(2, 4999, "R6", "Yamaha", 2013, features);
        superSports[2] = new SuperSport(3, 4999, "ZX6R", "Kawasaki", 2011, features);
        superSports[3] = new SuperSport(4, 4999, "GSXR-600", "Suzuki", 2010, features);
        superSports[4] = new SuperSport(5, 4999, "GSXR-600", "Suzuki", 2010, features);
        superSports[5] = new SuperSport(6, 4999, "GSXR-600", "Suzuki", 2010, features);
        return superSports;
    }
}