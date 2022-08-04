public class PCProblem {
    public static void main(String[] args) {
        Resource r = new Resource();//single resource
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);
        p.start();
        c.start();
    }
}
class Resource{
    int item = 0;
    boolean isProduced = false;
    synchronized void produceItem(){
        if(! isProduced){
            ++item;
            System.out.println(item+" Item is produced");
            isProduced = true;
        }
        try{
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        notify();
    }
    synchronized void consumeItem(){
        if(isProduced){
            System.out.println(item+" Item is consumed");
            isProduced = false;
            notify();
        }
        try{
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Producer extends Thread{
    Resource r;
    Producer(Resource r){
        this.r = r;
    }
    @Override
    public void run(){
        while(true){
            r.produceItem();
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread{
    Resource r;
    Consumer(Resource r){
        this.r = r;
    }
    @Override
    public void run(){
        while(true){
            r.consumeItem();
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
