public class ThreadProblem1 {
    public static void main(String[] args) {
        Table table = new Table(15);
        Thread t1 = new Thread(){
            @Override
            public void run(){
                System.out.println("Thread 1");

                table.printTable();
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                for(int i=1;i<11;i++){
                    System.out.println("*");
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                System.out.println("Thread 2");
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                table.printTable();
                for(int i=1;i<11;i++){
                    System.out.println("#");
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class Table{
    int n;
    Table(int n){
        this.n = n;
    }
    synchronized void printTable(){
        for(int i=1;i<11;i++){
            System.out.printf("%d x %d = %d%n",n,i,n*i);
        }
    }
}