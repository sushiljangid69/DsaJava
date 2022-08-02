import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Multithreading {
    public static void main(String[] args){
        int i = 1;
        Runnable t1 = new Thread1("Sushil Jangid");
        Runnable t2 = new Thread2();
        Runnable t3 = new Thread3();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);
        thread1.setName("Thread A");
        thread1.start();
        thread2.setName("Thread B");
        thread2.start();
        thread3.setName("Thread C");
        thread3.start();

    }
}
class Thread1 implements Runnable{
    String data;
    Thread1(String data){
        this.data = data;
    }
    void setData(String data){
        this.data = data;
    }
    //write a file
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try(RandomAccessFile r = new RandomAccessFile(new File("E://abc.txt"),"rw")){
            r.writeBytes(data);
            System.out.println("Success in writing file");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
class Thread2 implements Runnable{
    //this will print counting
    static int i = 1;
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        while(true){
            System.out.println(i++);
            try {
                Thread.sleep(1000);
                if(i==5)
                    break;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Thread3 implements Runnable{
    String data;
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try(RandomAccessFile r = new RandomAccessFile(new File("F://abc.txt"),"rw")){
            data = r.readLine();
            System.out.println("Successfully read");
            System.out.println(data);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}