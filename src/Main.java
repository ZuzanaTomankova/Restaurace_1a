import com.engeto.ja.Restaurant.Dish;
import com.engeto.ja.Restaurant.Orders;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {


        Dish dish1 = null;
        Dish dish2 = null;
        Dish dish3 = null;
        Dish dish4 = null;
        try {

            dish1 = new Dish(1, "Kuřecí řízek obalovaný 150 g", BigDecimal.valueOf(200), 20);
            dish2 = new Dish(2, "Hranolky 150 g", BigDecimal.valueOf(100), 10);
            dish3 = new Dish(3, "Pstruh na víně 200 g", BigDecimal.valueOf(250), 20);
            dish4 = new Dish(4, "Kofola 0,5 l", BigDecimal.valueOf(30), 2);
            List<Dish> dishList = new ArrayList<>();
            dishList.add(dish1);
            dishList.add(dish2);
            dishList.add(dish3);
            dishList.add(dish4);

            System.out.println(dishList);
        } catch (Exception e) {
            System.err.println("Nastala chyba při zadávání doby přípravy." + e.getLocalizedMessage());
        }


        List<Orders> ordersList = new ArrayList<>();
        ordersList.add(new Orders(15, dish1, 2, LocalTime.of( 8, 45), LocalTime.of( 9, 0), false, false));
        ordersList.add(new Orders(15, dish2, 2, LocalTime.of( 8, 45), LocalTime.of(9, 0), false, false));
        ordersList.add(new Orders(15, dish4, 2, LocalTime.of(8, 45), LocalTime.of( 9, 0), true, false));
        ordersList.add(new Orders(2, dish3, 2, LocalTime.of( 9, 45), LocalTime.of(10, 0), false, false));
        ordersList.add(new Orders(2, dish2, 2, LocalTime.of( 9, 45), LocalTime.of(10, 0), false, false));
        ordersList.add(new Orders(2, dish4, 2, LocalTime.of( 9, 45), LocalTime.of(10, 0), false, false));
        System.out.println(ordersList);




    }



    }

