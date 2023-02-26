package collections;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {

    private int borne;

    public Fibonacci(int borne) {
        this.borne = borne;
    }

    @Override
    public Iterator<Integer> iterator(){
        return new FiboIterator(borne);
    }

    public static void main(String[] args) {
        for(Integer i : new Fibonacci(20)) {
            System.out.println(i);
        }
    }
}