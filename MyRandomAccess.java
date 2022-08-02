import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;
public class MyRandomAccess {
    public static void main(String[] args) {
        String text = "";
        String[] texts = {};
        try(RandomAccessFile r = new RandomAccessFile(new File("E://abc.txt"),"rw")){
            text = r.readLine();
            texts = text.split(" ");
            for(int i=0;i<texts.length;i++){
                if(texts[i].equals("Ram")){
                    texts[i] = "Ravan";
                }
            }
            r.writeBytes(Arrays.toString(texts));
        }catch(IOException e){

        }





    }
}
/*
public static void main(String[] args)  {
        File file = new File("E://abc.txt");

        try {
            if(! file.exists()){
                file.createNewFile();
            }
            RandomAccessFile raf = new RandomAccessFile(file, "r");

            //reading data from the file
            System.out.println(raf.getFilePointer());
            String msg = raf.readLine();
            System.out.println(msg);



        }catch(FileNotFoundException e1){
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }
 */
