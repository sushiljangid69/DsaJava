/**
 * Problem1: Words Frequency count program using HashMap
 */
import java.util.HashMap;

public class WordFreqCount {
    static HashMap<String,Integer> hashMap;

    public static void count(String string){
        String[] words = string.split("\\s"); //splitting on spaces
        hashMap = new HashMap<>();

        //logic
        for(String w: words){
            if(hashMap.containsKey(w)){
                //key already exist
                hashMap.put(w,hashMap.get(w)+1);
            }else{
                hashMap.put(w,1);
            }
        }
    }
    public static void main(String[] args){
        count("Hello Ji Hello Ji Java Ji Hello Java Ji");
        //printing hashmap
        hashMap.forEach((k,v)-> System.out.printf("%s = %d%n",k,v));
    }
}
