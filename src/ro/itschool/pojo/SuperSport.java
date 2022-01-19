package ro.itschool.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class SuperSport extends Motorcycle {
    private List<String> features;

    public SuperSport(int id, int price, String model, String manufacturer, int fabricationYear, List<String> features) {
        super(id, price, model, manufacturer, fabricationYear);
        this.features = features;
    }
    }
