package out;

import java.util.Objects;
import java.util.Scanner;

public class HelloWorld1 {
   public static void main (String[] args){
       int age = 18;
       String name ="Arseni";
       System.out.println(name + " " + age);
       System.out.println();

       Task1();
       System.out.println();

       Task2();
       System.out.println();

       Task3();
       System.out.println();

       Task4();
       System.out.println();

       Task5();
       System.out.println();

       Taskx();
       System.out.println();

       Taskcalc();
       System.out.println();
   }

    public static void Task1(){
      int b =2;
      int c=3;
      int a = 4*(b+c-1)/2;
        System.out.println("Task 1");
        System.out.println(a);
    }
    public static void Task2() {
       int n = 34;
       int a=n/10;
       int b=n%10;
        System.out.println("Task 2");
        System.out.println("n="+n);
        System.out.println(a+b);
    }

    public static void Task3() {
        int n = 256;
        int a=(n/100);
        int b=(n/10)%10;
        int c=n%10;
        System.out.println("Task 3");
        System.out.println("n="+n);
        System.out.println(a+b+c);
    }

    public static void Task4() {
       double n = 13.8;
       int a= (int) (n/1);
        System.out.println("Task 4");
        System.out.println("n="+n);
        if (n<(a+0.5)){
        System.out.println(a);
    }
        else{
            System.out.println(a+1);
        }
    }

    public static void Task5() {
       int q = 26;
       int w = 3;
       int a = q/w;
       int b = q%w;
        System.out.println("Task 5");
        System.out.println("q="+q + ", w="+w);
        System.out.println(q+"/"+w+" = "+a+" и "+b+" в остатке");
    }

    public static void Taskx() {
        int a = 3;
        int b = 7;
        System.out.println("Task *");
        System.out.println("a="+a + ", b="+b);
        a = a * 10 + b;
        b=a/10;
        a=a%10;
        System.out.println(a);
        System.out.println(b);

    }

    public static void Taskcalc() {
        System.out.println("Task Calculator");

        System.out.println("Введите число, операцию и число");

           Scanner sc1 = new Scanner(System.in);
           int a = sc1.nextInt();

           Scanner sc = new Scanner(System.in);
           String operation = sc.next();

           Scanner sc2 = new Scanner(System.in);
           int b = sc2.nextInt();

           if (Objects.equals(operation, "*")){
               System.out.println(a*b);
}
           if (Objects.equals(operation, "/")){
               System.out.println(a/b);
           }
           if (Objects.equals(operation, "+")){
               System.out.println(a+b);
           }
           if (Objects.equals(operation, "-")){
            System.out.println(a-b);
           }
    }
}
