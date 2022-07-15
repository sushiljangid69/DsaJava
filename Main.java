/**
 * Problem1: Count the frequencies of words in the string
 */
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    Scanner scn;
    HashMap<String,Integer> hashMap;
    String string;
    String[] words;

    public Main(){
        scn = new Scanner(System.in);
        hashMap = new HashMap<>();

        System.out.println("Please Enter string:");
        string = scn.nextLine(); //taking string from the user
        words = string.split("\\s"); //splitting string on spaces

        //counting logic
        for(String w:words){
            if(hashMap.containsKey(w)){
                //key already exist
                hashMap.put(w,hashMap.get(w)+1);
            }else{
                hashMap.put(w,1);
            }
        }

        //now our hashmap contains the frequencies of words
        hashMap.forEach((k,v)-> System.out.printf("%s = %d%n",k,v));
    }
    public static void main(String[] args){
        new Main();
    }
}
