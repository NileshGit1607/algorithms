package practice.algo.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindRunningMedianStream {

    private PriorityQueue<Integer> upperHalf = new PriorityQueue<>();
    private PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return -1 * o1.compareTo(o2);
        }
    });

    public void put(Integer number) {
        if (lowerHalf.size() == 0 || number < lowerHalf.peek()) {
            lowerHalf.add(number);
        } else {
            upperHalf.add(number);
        }
        // RE BALANCE IF THE SIZE OF LEFT AND RIGHT HALF IS GREATER OR EQUAL TO 2
        rebalance();
    }

    private void rebalance() {
        int lowerSize = lowerHalf.size();
        int upperSize = upperHalf.size();
        if (lowerSize == upperSize || Math.abs(lowerSize - upperSize) < 2) {
            return;
        }
        PriorityQueue<Integer> smallerHeap = getSmallerHeap();
        PriorityQueue<Integer> higherHeap = getHigherHeap();
        // MOVE HIGHER TO SMALLER HEAP TO REBALANCE SIZE
        smallerHeap.add(higherHeap.poll());
    }

    public double getMedian() {
        if (lowerHalf.size() != upperHalf.size()) {
            return getHigherHeap().peek();
        } else {
            return (double) (lowerHalf.peek() + upperHalf.peek()) / 2;
        }
    }

    private PriorityQueue<Integer> getHigherHeap() {
        return lowerHalf.size() > upperHalf.size() ? lowerHalf : upperHalf;
    }

    private PriorityQueue<Integer> getSmallerHeap() {
        return lowerHalf.size() < upperHalf.size() ? lowerHalf : upperHalf;
    }

    public static void main(String[] args) {
        FindRunningMedianStream machine = new FindRunningMedianStream();
        int[] stream = {1, 8, 7, 4, 34, 6, 9};
        //int[] stream = {1, 2, 2, 2, 2};
        for (Integer i : stream) {
            machine.put(i);
            System.out.println(machine.getMedian());
        }
    }

}
