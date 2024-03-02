package com.engeto.ja.Restaurant;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RestaurantManager {


    public static void notDelivered (List<Orders>ordersList) {
        for (Orders orders : ordersList) {
            if (!orders.getItDelivered())
            { System.out.println("Nedodáno: " + orders.getTableNumber()+" "+orders.getDish().getTitle());

            }
        }

    }
    public static void notPaid (List<Orders>ordersList) {
        for (Orders orders : ordersList) {
            if (!orders.getItPaid())
            { System.out.println("Nezaplaceno: " + orders.getTableNumber()+" "+orders.getDish().getTitle());

            }
        }

    }



     public static void sortedBasedOnTime (List<Orders>ordersList){
         Collections.sort(ordersList, Comparator.comparing(Orders::getOrderedTime));
         System.out.println("Setříděno podle času objednávky: "+ordersList);
     }

    public static long getTotalTime( List<Orders>ordersList) {
        long totalTime = 0;
        for (Orders orders : ordersList) {
            long minutesBetween = 0;
            if (orders.getItPaid()) {
                minutesBetween = ChronoUnit.MINUTES.between(orders.getOrderedTime(), orders.getFulfilmentTime());
                totalTime = +minutesBetween;

            }

        }
        return totalTime;
    }

    public static long getTotalListSize( List<Orders>ordersList) {
        List<Orders> totalList = new ArrayList<>();
        long listSize = 0;
        for (Orders orders : ordersList) {
            if (orders.getItPaid()) {
                totalList.add(orders);
            }
            listSize = totalList.size();
        }
        return listSize;

    }

    public static long getAverageTime(){
        long averageTime = totalTime/listSize;
        return averageTime;
    }


    public void listOfOrderedDish (List<Orders>ordersList){
        for (Orders orders : ordersList) {
        System.out.println("Seznam objednaných jídel: "+orders.getDish().getTitle());
    }

    }
    public String isPaidString (List<Orders>ordersList) {
        for (Orders orders : ordersList) {
            String paidString = "";

            if (orders.getItPaid()) {
                paidString = "Zaplaceno";
            }

        }
        return "";
    }

        public void exportOfOrders (List < Orders > ordersList,int table) {
            for (Orders orders : ordersList) {
                if (orders.getTableNumber() == table) {

                    System.out.println(orders.getDish().getIdentificationOfDish() + ". " + orders.getDish().getTitle() + " "
                            + orders.getAmount() + " (" + orders.getPartialPrice() + " Kč):  " + orders.getOrderedTime() + "-"
                            + orders.getFulfilmentTime() + "  " + isPaidString(ordersList));
                }


            }
        }

    public BigDecimal getTotalPriceForTable(List < Orders > ordersList,int table){
        for (Orders orders : ordersList) {
            if (orders.getTableNumber()==table){
                BigDecimal totalPrice = BigDecimal.ZERO;
                totalPrice = totalPrice.add(orders.getPartialPrice());
            }
        }
        return getTotalPriceForTable(ordersList,table);
    }


}







