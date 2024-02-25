package pattren;

public class NewPattren {
    // public static void hellowractangle(int tolrow,int totcols){
    // //outerloop
    // for(int i=1;i<=tolrow; i++){
    // //inner loop
    // for(int j=1; j<=totcols; j++){
    // if(i==1 ||i==tolrow ||j==1 ||j==totcols){
    // System.out.print("*");
    // }else{
    // System.out.print(" ");
    // }

    // }
    // System.out.println();

    // }
    // }

    // public static void investmentharfpramid(int n){
    // //outer loop
    // for(int i=1; i<=n; i++){
    // //space
    // for(int j=1; j<=n-i; j++){
    // System.out.print(" ");
    // }
    // for(int j=1;j<=i; j++){
    // System.out.print("*");
    // }
    // System.out.println();

    // }

    // public static void investednuber(int n){
    // //outer loop
    // for(int i=1; i<=n; i++){
    // //inner loop
    // for(int j=1; j<=n-i+1; j++){
    // System.out.print(j);
    // }
    // System.out.println();
    // }

    // public static void floyedtranhle(int n){
    // int counter=1;
    // //outer loop
    // for(int i=1; i<=n; i++){
    // //inner loop
    // for(int j=1; j<=i; j++){
    // System.out.print(counter+" ");
    // counter++;
    // }
    // System.out.println();
    // }

    // }




    /// daimand pattren 
    // 1harf daimand
   // public static void daimand(int n) {
        // outerloop
//         for (int i = 1; i<=n; i++) {
//             /// space formate n-i formate
//             for (int j = 1; j<=(n-i); j++) {
//                 System.out.print(" ");
//             }
//             //star print 
//             for (int j=1; j<=(2*i)-1; j++) {
//                 System.out.print("*");

//             }
//             System.out.println();

//         }
//     //2nd harf daimand 
//   for(int i=n; i>=1; i--){
//         /// space formate n-i formate
//         for (int j = 1; j<=(n-i); j++) {
//             System.out.print(" ");
//         }
//         for (int j = 1; j<=(2*i)-1; j++) {
//             System.out.print("*");

//         }
//         System.out.println();

//     }
// }

//G patren 
// static void pattern(int line) 

//     { 
//         int i, j; 
//           for(i = 0; i < line; i++) 
//           { 
//               for(j = 0; j < line; j++)
//             { 
//                 if((j == 1 && i != 0 && i != line - 1) || 

//                 ((i == 0 || i == line - 1) && j > 1 && 

//                 j < line - 2) || (i == ((line - 1) / 2) &&  

//                 j > 2 && j < line - 1) || (j == line - 2 &&  

//                 i != 0 && i >= ((line - 1) / 2) && i != line - 1))

//                     System.out.print("*"); 

//                 else

//                     System.out.print( " "); 

      

//             } 

//             System.out.println(); 

//         } 

//     }



//number paramind 
// public static void numberpramid(int n){
//     //outer loop
//     for(int i=1; i<=n; i++){
//         //space  +inner loop and star print 
//          for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i; j++ ){
//             System.out.print(i +" ");
//         }
//         System.out.println( );
//     }

// }
public static void matricpayramid(int n){
    //outer loop
    
    for(int i=0; i<=n; i++){
        //inner loop[]
        for(int j=0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

}


    public static void main(String[] args){
        // hellowractangle(6, 5);
        // investmentharfpramid(5);
        // investednuber(5);
        // floyedtranhle(5);
        // daimand(4);

        // pattern(7);
        // numberpramid(5);
        matricpayramid(5);
    }
}