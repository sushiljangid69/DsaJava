/**
 * Problem2: Tower of Hanoi Problem using Stack and Recursion
 */
import java.util.Stack;

public class Main {
    Stack<Integer> source;
    Stack<Integer> destination;
    Stack<Integer> auxiliary;

    /**
     *
     * @param size input the number of disks on the tower
     */
    public Main(int size){
        source = new Stack<>();
        destination = new Stack<>();
        auxiliary = new Stack<>();

        //inserting data into source
        for(int i=size;i>0;i--){
            source.push(i);
        }

        //tower of hanoi function call
        toh(size,source,auxiliary,destination);

        //printing the elements from the destination
        destination.forEach(System.out::println);
    }
    void toh(int size,Stack<Integer> source,Stack<Integer> auxiliary,Stack<Integer> destination){
        if(size == 1){
            //move disk from source to destination
            destination.push(source.pop());
        }else{
            toh(size-1,source,destination,auxiliary);
            destination.push(source.pop());
            toh(size-1,auxiliary,source,destination);
        }
    }
    public static void main(String[] args){
        new Main(5);
    }
}