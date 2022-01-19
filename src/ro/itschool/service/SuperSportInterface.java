package ro.itschool.service;

import ro.itschool.pojo.Motorcycle;
import ro.itschool.pojo.SuperSport;

public interface SuperSportInterface {

    SuperSport[] getAllSuperSports();

    void buySuperSport(int id);

    void buyBackSuperSport(SuperSport superSport);
}
