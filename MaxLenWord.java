import java.util.*;
import java.io.*;

class MaxLenWord {

    public static String LongestWord(String sen) {
        String[] words = sen.split("\\s");
        SortedSet<Integer> set = new TreeSet<>();

        for(String w:words){
            set.add(w.length());
        }
        System.out.println();
        return sen;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
