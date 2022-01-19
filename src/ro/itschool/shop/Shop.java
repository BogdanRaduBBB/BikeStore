package ro.itschool.shop;

import ro.itschool.pojo.SuperSport;
import ro.itschool.service.SuperSportInterface;
import ro.itschool.service.SuperSportService;

public class Shop {

    private SuperSportInterface superSportService = new SuperSportService();

    public void getAllSuperSports() {
        for (SuperSport ss : superSportService.getAllSuperSports()) {
            if (ss != null)
                System.out.println(ss);

        }
    }

    public void buySuperSport(int id) {
        superSportService.buySuperSport(id);
    }

    public void buyBackSuperSport(SuperSport superSport) {
        superSportService.buyBackSuperSport(superSport);
    }
}
