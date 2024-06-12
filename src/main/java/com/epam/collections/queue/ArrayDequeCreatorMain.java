package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeCreatorMain {
    public static void main(String[] args) {

        Queue<Integer> firstQueue = new LinkedList<>(Arrays.asList(1, 5, 7, 6));
        Queue<Integer> secondQueue = new LinkedList<>(Arrays.asList(2, 5, 8, 3));

        ArrayDequeCreator creator = new ArrayDequeCreator();
        ArrayDeque<Integer> resultDeque = creator.createArrayDeque(firstQueue, secondQueue);

        // Print the elements in the resulting ArrayDeque
//        System.out.println(resultDeque);
    }
}
