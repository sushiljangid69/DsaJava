import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;
public class ThreadProblem2 {
    static RandomAccessFile rf;
    static String s1 = "Hello this is Sushil Jangid";
    static String s2 = "He is a teacher and a developer";

    public static void main(String[] args) {

        try{
            rf = new RandomAccessFile(new File("E://abc.txt"),"rw");
        }catch(IOException e){
            e.printStackTrace();
        }


        Thread t1 = new Thread(){
            @Override
            public void run(){
                write(s1);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                write(s2);
            }
        };

        t1.start();
        t2.start();

    }
    static void write(String s){
        System.out.println("Out");

            try{
                rf.writeBytes(s);
            }catch(IOException e){
                e.printStackTrace();
            }

    }
}

