package com.engeto.ja.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class ListOfOrders { List<Orders> ordersList = new ArrayList<>();
    public void addOrder(Orders orders) {ordersList.add(orders);
    }
    public void removeOrder(int index) {ordersList.remove(index);
    }

}
