import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.currentThread;

public class MyThread {
    public static void main(String[] args){
//        Timer timer = new Timer();
//        TimerTask t = new Thread1();
//        timer.schedule(t,1000,10000);
//        Thread t2 = new Thread2();
//        t2.start();
//        Thread t3 = new Thread3();
//        t3.start();
    }
}
//class Thread1 extends TimerTask {
//    public static int t = 0;
//    @Override
//    public void run(){
//        System.out.println(++t);
//
//    }
//}
//class Thread2 extends Thread{
//    @Override
//    public void run(){
//        //will write a file
//        File file = new File("E://abc.txt");
//        try(RandomAccessFile rf = new RandomAccessFile(file,"rw")){
//            rf.writeBytes("Timer started at "+ DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss").format(LocalDateTime.now()));
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//}
//class Thread3 extends Thread{
//    @Override
//    public void run(){
//        System.out.println("I am background thread running...");
//    }
//}