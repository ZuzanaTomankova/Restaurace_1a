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
        System.out.println("\n");
    }
    public static void notPaid (List<Orders>ordersList) {
        for (Orders orders : ordersList) {
            if (!orders.getItPaid())
            { System.out.println("Nezaplaceno: " + orders.getTableNumber()+" "+orders.getDish().getTitle());

            }
        }
        System.out.println("\n");
    }



     public static void sortedBasedOnTime (List<Orders>ordersList){
         Collections.sort(ordersList, Comparator.comparing(Orders::getOrderedTime));
         System.out.println("Setříděno podle času objednávky: \n"+ordersList);
     }

//    public static long getTotalTime( List<Orders>ordersList) {
//        long totalTime = 0;
//        for (Orders orders : ordersList) {
//            long minutesBetween = 0;
//            if (orders.getItPaid()) {
//                minutesBetween = ChronoUnit.MINUTES.between(orders.getOrderedTime(), orders.getFulfilmentTime());
//                totalTime +=minutesBetween;
//
//            }
//
//        }
//        return totalTime;
//    }
//
//    public static long getTotalListSize( List<Orders>ordersList) {
//        List<Orders> totalList = new ArrayList<>();
//        long listSize = 0;
//        for (Orders orders : ordersList) {
//            if (orders.getItPaid()) {
//                totalList.add(orders);
//            }
//            listSize = totalList.size();
//        }
//        return listSize;
//
//    }
//
    public static void getAverageTime(List<Orders>ordersList){
   long totalTime=0;
   long listSize;
   long minutesBetween;
  List<Orders> totalList = new ArrayList<>();
        for (Orders orders : ordersList) {
            if (orders.getItDelivered()==true) {
               minutesBetween = ChronoUnit.MINUTES.between(orders.getOrderedTime(), orders.getFulfilmentTime());
                totalTime +=minutesBetween;
                    totalList.add(orders);

            }

    }
        listSize = totalList.size();
        long averageTime;
        averageTime = listSize / totalTime;
        System.out.println("Prúměrná doba zpracování objednávky je:"+averageTime+" minut\n");
    }


    public static void listOfOrderedDish (List<Orders>ordersList){
        System.out.println("Seznam objednaných jídel: ");
        for (Orders orders : ordersList) {
        System.out.println(orders.getDish().getTitle());
    }
        System.out.println("\n");
    }
    public static String isPaidString (List<Orders>ordersList) {
        String paidString = null;
        for (Orders orders : ordersList) {
            paidString = "";

            if (orders.getItPaid()) {
                paidString = "Zaplaceno";
            }

        }
        return paidString;
    }

        public static void exportOfOrders (List < Orders > ordersList,int table) {
        for (Orders orders:ordersList)
                if (orders.getTableNumber() == table) {

                    System.out.println(orders.getDish().getIdentificationOfDish() + ". " + orders.getDish().getTitle() + " "
                            + orders.getAmount() + " (" + orders.getPartialPrice() + " Kč):  " + orders.getOrderedTime() + "-"
                            + orders.getFulfilmentTime() + "  " + isPaidString(ordersList));
                }

            System.out.println("\n");

        }

    public static void getTotalPriceForTable(List < Orders > ordersList,int table) {
        BigDecimal totalPrice = null;
        for (Orders orders : ordersList) {
            if (orders.getTableNumber() == table) {
                totalPrice = BigDecimal.ZERO;
                totalPrice = totalPrice.add(orders.getPartialPrice());
            }

        }
        System.out.println("Celková cena stolu č. "+table+" je "+totalPrice+"Kč\n");
    }


}







