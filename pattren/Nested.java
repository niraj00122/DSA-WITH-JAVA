package pattren;

public class Nested {
    public static void main(String[] args) {
        //outer loop
        // for(int line=1; line<=4; line++){
        //  //inner loop
        //  for(int star=1; star<=line; star++){
        //     System.out.print("*");
        //  }
        //  System.out.println();




        //inveted star print 
    //     int n=4;
    //     //outer loop
    //     for(int line =1;line<=n;line++ ){
    //         //inne loop
    //         for(int star=1; star<=n-line+1; star++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     }
    // }



//     int n=5;
//     //outrer loop
//     for(int line=1; line<=n;line++){
//         //inner loop
//         for(int number=1; number<=line; number++){
//             System.out.print(number);
//         }
//         System.out.println();
//     }
// }




 int n=4;
 char ch='A';
 //outer loop
 for(int line=1; line<=n;line++){
// // //     //inner loop
     for(int chars=1;chars<=line; chars++){
         System.out.print(ch);
        ch++;

     }
     System.out.println();
 }
     }

}