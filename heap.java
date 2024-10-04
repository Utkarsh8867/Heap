import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;
/**
 * heap
 */
public class heap {
    static class Student  {
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        // @Override
        // public int comapreTo (Student s2){
        //     return this.rank - s2.rank;
        // }
    }
 public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    pq.add(1);
    pq.add(8);
    pq.add(9);
    pq.add(6);
    pq.add(2);
    pq.add(3);
    while(!pq.isEmpty()){
        System.out.println(pq.peek());
        pq.remove();
    }
 }
    
}