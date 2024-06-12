package com.epam.collections.queue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreatorMain {
    public static void main(String[] args) {
        PriorityQueueCreator creator = new PriorityQueueCreator();

        List<String> firstList = Arrays.asList("Java", "PriorityQueue", "class");
        List<String> secondList = Arrays.asList("It", "is", "different", "from", "standard", "queues", "where", "FIFO");

        PriorityQueue<String> result = creator.createPriorityQueue(firstList, secondList);

        while (!result.isEmpty()) {
            System.out.println(result.poll());
        }
    }
}
