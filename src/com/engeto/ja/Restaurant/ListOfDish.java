package com.engeto.ja.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class ListOfDish {
     public List<Dish> dishList = new ArrayList<>();

    public void addDish(Dish dish) {dishList.add(dish);
    }
    public void removeDish(int index) {dishList.remove(index);
    }
}
