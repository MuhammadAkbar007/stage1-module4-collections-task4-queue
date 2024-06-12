package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        // Initialize needed variables
        List<Integer> order = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        //fill queue with number of dishes
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            // Move everyDishNumberToEat - 1 elements from the front to the back of the queue
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                queue.add(queue.poll());
                System.out.println(queue);
            }
            // Remove the everyDishNumberToEat-th element and add it to the result
            order.add(queue.poll());
        }

        return order;
    }
}
