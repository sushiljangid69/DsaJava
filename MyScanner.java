import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = scn.nextLine();
//        System.out.println("Enter a number");
//        int a = scn.nextInt();
//        System.out.println("Enter second number");
//        int b = scn.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{

            System.out.println("Enter 1st number");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter your name");
            String name = String.valueOf(br.readLine());
            System.out.println("Enter 2nd number");
            int b = Integer.parseInt(br.readLine());
            System.out.println(a);
            System.out.println(name);
            System.out.println(b);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
