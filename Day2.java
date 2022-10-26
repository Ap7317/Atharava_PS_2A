import java.util.Scanner;
import java.util.*;

// Q1.

// public class Day2{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int k=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+i-1);
//             }
//             System.out.println();
//         }
//     }
// }




// Q2.

// public class Day2{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+j-1+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// Q3.

// public class Day2{
//     public static void main(String[] args) {
//         for(char i='A';i<='C';i++){
//             for(char j='A';j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }




// Q4.


// public class Day2{
//     public static void main(String[] args) {
//         for(char i='A';i<='D';i++){
//             char k=i;
//             for(char j='A';j<=i;j++){
//                 System.out.print((char)(i+j-'A'));
//             }
//             System.out.println();
//         }
//     }
// }




// Q5.


// public class Day2{
//     public static void main(String[] args) {
//         for(char i='E';i>='A';i--){
//             for(char j=i;j<='E';j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }





// Q6.


// public class Day2{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=i;k<=2*i-1;k++){
//                 System.out.print(k);
//             }
//             if(i>=2){
//                for(int m=2*(i-1);m>=i;m--){
//                 System.out.print(m);
//                }
//             }
//             System.out.println();
//         }
//     }
// }




// Q7.


// public class Day2{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=i;k>=1;k--){
//                 System.out.print(k);
//             }
//             if(i>=2){
//                 for(int m=2;m<=i;m++){
//                     System.out.print(m);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }




// Q8.


// public class Day2{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }




// Q9.


// public class Day2{
//     public static void main(String[] args) {
//         for(int i=1;i<=3;i++){
//             for(int j=1;j<=3-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=2;i>=1;i--){
//             for(int j=1;j<=3-i;j++){
//                  System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }





// Q10.


// public class Day2{
//     public static void main(String[] args) {
//         for(int i=3;i>=1;i--){
//             for(int j=1;j<=3-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=2;i<=3;i++){
//             for(int j=1;j<=3-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




// Q11.

// public class Day2{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             for(int k=1;k<=2*(5-i);k++){
//                 System.out.print(" ");
//             }
//             for(int m=i;m>=1;m--){
//             System.out.print(m);
//             }
//             System.out.println();
//         }
//     }
// }




// Q12.


// public class Day2{
//     public static void main(String[] args) {
//         for(int i=6;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                System.out.print(j);
//             }
//             for(int k=1;k<=6-i;k++){
//                 System.out.print(" ");
//             }
//             if(i==6){
//                 for(int m=5;m>=1;m--){
//                     System.out.print(m);
//                 }
//             }
//             else{
//                 for(int n=1;n<=5-i;n++){
//                     System.out.print(" ");
//                 }
//                 for(int l=i;l>=1;l--){
//                     System.out.print(l);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }




// Q13.

// public class Day2{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int size=n*2-1;
//         int s=0,e=size-1;
//         for(int i=s;i<=e;i++){
//             for(int j=s;j<=e;j++){
//                 if(i==s || i==e || j==s || j==e){
//                     System.out.print(n);
//                 }
//             }
//             System.out.println();
//         }
//         s++;
//         e--;
//         n--;
//     }
// }







// Q14.

// public class Day2{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1 || i==n){
//                     System.out.print("*");
//                 }
//                 else if(i+j==n+1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// Q18.

// public class Day2{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         String s=in.next();
//         int l=s.length();
//         for(int i=0;i<=l-1;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(".");
//             }
//             for(int k=i;k<=l-1;k++){
//             System.out.print(s.charAt(k));
//             }
//             System.out.println();
//         }
//     }
// }




public class Day2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] s=new String[n];
        for(int i=1;i<=n;i++){
            s[i]=in.nextLine();
        }
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            System.out.print(s[i]);
        }
    }
}