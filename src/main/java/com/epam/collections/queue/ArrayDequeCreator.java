package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Initialize deque with first two cards from each player's queue
        deque.add(firstQueue.poll());
        deque.add(firstQueue.poll());
        deque.add(secondQueue.poll());
        deque.add(secondQueue.poll());

        // Continue the game until both queues are empty
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            // First player's move
            firstQueue.add(deque.poll());
            deque.add(firstQueue.poll());
            deque.add(firstQueue.poll());

            // Second player's move
            secondQueue.add(deque.poll());
            deque.add(secondQueue.poll());
            deque.add(secondQueue.poll());
        }

        return deque;
    }
}
