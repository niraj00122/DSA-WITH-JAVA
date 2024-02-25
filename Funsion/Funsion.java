package Funsion;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.function.ObjDoubleConsumer;

public class Funsion {
    //FUNSION REAAY
//     public static int  printHelloWORLD(){
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         return 2;

//     }
//     //sum calculate 

//     public static int  calulatesum( int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     // copy call by  value 
//     public static  void swap(){
//         //orijnal reframnce 
//         int a=10;
//          int b=5;
//          int temp=a;
//          a=b;
//          b=temp;
//          System.out.println("a="+a);
//          System.out.println("b="+b);

//     }

//     //find product a&b;
//     // public static int multi(int a, int b){
//     //     int product =a*b;
//     //     return product;
//     // }

//     //facroial number calculate 
//     public static int factorial(int n){
//         int f=1;
//         for(int i=1;i<=n; i++){
//             f=f*i;
//         }
//         return f;
         

//     }
     
//   //bionomial function
//    public static int bionomial(int n ,int r){
//      int fact_n= factorial(n);
//      int fact_r= factorial(r);
//      int fact_mnr=factorial(n-r);
//      int bionomial=fact_n /(fact_r*fact_mnr);
//      return bionomial;
//    }

   //funstion overloding
//    public static int sum(int a,int b){
//     return a+b;
//    }
//    public static int sum(int a, int b, int c){
//     return a+b+c;
//    }

   //funsion ushing DATA TYPE
//    public static int sum(int a,int b){
//     return a+b;
//    }
//    public static float sum(float a, float b ,float c){
//     return a+b+c;
//    }

//prime number 
 public static boolean  isprime(int n){
     boolean isprime=true;
   for(int i=2; i<=n;i++){
         if (n%i==0) { //complity devide 
            isprime=false;
            break;
            
        }
   }
   return isprime;
}

//10 prime number print 
// public static void printprimenumber(int n){
//    //loop declar prime number 
//    for(int i=5; i<=n; i++){
//     if (isprime(i)){
        
//     }
//     System.out.print(i+" ");  //true print 
//    }
//    System.out.println();
// }

//binerynumber
// public  static void bintodec(int binum){
//     int mynumber=binum;
//   int pow=0;
//      int dec=0;
//     while (binum>0) {
//         int lastdigit=binum%10;
//        dec=dec+(lastdigit*(int)Math.pow(2, pow));
//         pow++;
//         binum=binum/10;
        
//     }
//     System.out.println("decimal of "+mynumber+"="+dec);

// }


///decima to binery 
public static void decbin(int n){
    int mydec=n;
     int pow=0;
    int binerynumber=0;
    while (n>0) {
        int rem=n%2;
        binerynumber=binerynumber+(rem*(int)Math.pow(10, pow));
        pow++;
        n=n/2;
    }
    System.out.println("decimal to bininery from"+mydec+" + = "+binerynumber);

}
    public static void main(String[] args) {
        // printHelloWORLD();
        // Scanner sc= new Scanner(System.in);
        // int a=sc.nextInt();
        // int b= sc.nextInt();
        // int sum=a+b;
        // System.out.println("sum is " +sum);
        // calulatesum(a,b);
        

        //swap ka code 
        //swap();
        

        //prodct
    //     int a=3;
    //     int b=5;
    //     int prodct=multi(a, b);
    //     System.out.println("a*b="+prodct);
    //     int prodcts= multi(10,20);
    //    System.out.println( "a*b"+prodcts);


    //factorial number calculate 
//   System.out.println(factorial(5));


//bionolal factorial 
// System.out.println(bionomial(5, 2));

//funstion overlofing
// System.out.println(sum(3, 3));
// System.out.println(sum(1, 3, 5));
//     }


//funstion overloding data type 
// System.out.println(sum(2, 5));
// System.out.println(sum(2.5f, 3.5f, 4.6f));
//     }

//is prime number 
// System.out.println(isprime(12));

// 10 prime number 
// printprimenumber(30);
// bintodec(101);
decbin(7);
}
}