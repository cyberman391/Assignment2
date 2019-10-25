package com.example.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class fakedatabase {

    public static Order getOrderById(int orderID){
        return orders.get(orderID);
    }

    public static ArrayList<Order>getAllOrders(){
        return new ArrayList<Order>((List) Arrays.asList(orders.values().toArray()));
    }

    private static final HashMap<Integer, Order> orders = new HashMap<>();

    static  {
        orders.put(1, new Order(
                1,
                "Burger",
                R.drawable.order1,
                "$9",
                9,
                "An ordinary burger"
        ));
        orders.put(2, new Order(
                2,
                "Cheese Burger",
                R.drawable.order2,
                "$10",
                10,
                "A burger filled with cheese"
        ));
        orders.put(3, new Order(
                3,
                "Beef burger",
                R.drawable.order3,
                "$10",
                10,
                "A burger with delicious beef"
        ));
        orders.put(4, new Order(
                4,
                "Bacon King",
                R.drawable.order4,
                "$13",
                13,
                "A burger with extraordinary amounts of bacon"
        ));
        orders.put(5, new Order(
                5,
                "Double Cheese Burger",
                R.drawable.order5,
                "$10",
                10,
                "A burger filled with twice the amount of cheese"
        ));
        orders.put(6, new Order(
                6,
                "Double Bacon King Burger",
                R.drawable.order6,
                "$15",
                15,
                "Twice the amount of bacons"
        ));
        orders.put(7, new Order(
                7,
                "Beyond Meat Borger",
                R.drawable.order7,
                "$12",
                12,
                "A burger filled with vegan friendly meat"

        ));
        orders.put(8, new Order(
                8,
                "Triple Beef Burger",
                R.drawable.order8,
                "$15",
                15,
                "A burger with extraordinary amounts of beef!"
        ));
        orders.put(9, new Order(
                9,
                "Thick Chips",
                R.drawable.order9,
                "$5",
                5,
                "Chips to accompany your meal!"

        ));
        orders.put(10, new Order(
                10,
                "Mozarella Sticks",
                R.drawable.order10,
                "$5",
                5,
                "Delicious sticks with mozarella!"
        ));
        orders.put(11, new Order(
                11,
                "Onion Rings",
                R.drawable.order11,
                "$3",
                3,
                "Ordinary onion rings"
        ));
        orders.put(12, new Order(
                12,
                "Lemonade",
                R.drawable.order12,
                "$2",
                2,
                "Refresh yourself with lemonade!"

        ));
        orders.put(13, new Order(
                13,
                "Diet Soda",
                R.drawable.order13,
                "$3",
                3,
                "Enjoy our diet soda to safeguard your calories!"
        ));
        orders.put(14, new Order(
                14,
                "Vitamin Water",
                R.drawable.order14,
                "$4",
                4,
                "Water to refresh your day!"
        ));
        orders.put(15, new Order(
                15,
                "Juice",
                R.drawable.order15,
                "$3",
                3,
                "Enjoy our special juice!"
        ));
    }
}
