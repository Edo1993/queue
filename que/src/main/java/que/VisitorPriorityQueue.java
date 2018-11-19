package que;

import java.util.PriorityQueue;

/**
 * Реализовать очередь на почту, учитывать возраст покупателей:
 * если пенсионер, обслуживать без очереди.
 * Условно принимаем, что пенсионер > 60 лет.
 * @author Karina Zotkina
 * @version 1.0 05 Nov 2018
 */


public class VisitorPriorityQueue {

    private static final int AGE = 10;
    private static final int AGE1 = 73;
    private static final int AGE2 = 47;
    private static final int AGE3 = 25;
    private static final int AGE4 = 66;
    private static final int AGE5 = 35;
    private static final int AGE6 = 61;

    public static void main(final String[] args) {
        PriorityQueue<Visitor> visitorPriorityQueue = new PriorityQueue<>();
        visitorPriorityQueue.add(new Visitor("Петр", AGE));
        visitorPriorityQueue.add(new Visitor("Александр", AGE1));
        visitorPriorityQueue.add(new Visitor("Ирина", AGE2));
        visitorPriorityQueue.add(new Visitor("Василий", AGE3));
        visitorPriorityQueue.add(new Visitor("Евгения", AGE4));
        visitorPriorityQueue.add(new Visitor("Антон", AGE5));
        visitorPriorityQueue.add(new Visitor("Екатерина", AGE6));


        while (!visitorPriorityQueue.isEmpty()) {
            System.out.println(visitorPriorityQueue.remove());
        }
    }
}

