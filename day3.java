package collegeprogram_for_problemsolving;

import java.util.Scanner;
// SUM=1!+2!+3!+.....n!

public class day3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n=in.nextInt();
        int sum=0,fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            sum+=fact;
        }
        System.out.println("The sum of series is "+sum);
    }
}



//SUM=1!/1+2!/2+3!/3+4!/4+......N!/N

public class day3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n=in.nextInt();
        int sum=0,fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            sum+=(fact/i);
        }
        System.out.println("The sum of series is "+sum);
    }
}



// SUM=(1*2*3)+(2*3*4)+(3*4*5)+.........+N*(N+1)*(N+2)

public class day3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n=in.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=(i*(i+1)*(i+2));
        }
        System.out.println("The sum of series is "+sum);
    }
}



// // SUM=  1+x+x*2/2!+x*3/3!+....

public class day3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sum  till");
        int n=in.nextInt();
        System.out.println("Value of X is");
        float x=in.nextFloat();
        float sum=1;
        int fact =1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        for(int i=1;i<=n;i++){
            sum=sum+(x*n)/fact;
        }
        System.out.println("Sum of given series is "+sum);
    }
}





//SUM= 1+x+x^2/2!+x^3/3!+.......


import java.util.*;
public class day3{
    public static void main(String[] args) {
        int n;
        float x,sum=0,fact=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number ");
        n=in.nextInt();
        x=in.nextFloat();
        for(int i=0;i<=n;i++){
            fact=fact*i;
            sum+=(Math.pow(x,i))/fact;
        }
    }
}



//SUM= 1-x+x^2/2!+x^3/3!+.......


import java.util.*;
public class day3{
    public static void main(String[] args) {
        int n;
        float x,sum=0,fact=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number ");
        n=in.nextInt();
        x=in.nextFloat();
        for(int i=1;i<n;i++){
            fact=fact*i;
            sum+=Math.pow(-1,i)*Math.pow(x,i)/fact;
        }
        System.out.println(sum+1);   
    }
}



//  SUM=x-x^3/3!+x^5/5!+.....

public class day3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms for sum ");
        int n=in.nextInt();
        int pow=2*n-1;
        System.out.println("Enter the value of x ");
        float x=in.nextFloat();
        float sum=0,fact=1,D=1,i,j;
        for(i=1;i<=pow;i++){
            fact=fact*i;
            sum+=D*Math.pow(x,i)/fact;
            D=-D;
        }
        System.out.println("Sum of series is:"+sum);
    }
}




// GEEKS FOR GEEKS PATTERN


public class day3{
    public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    for(int i=1;i<=N;i++){
        for(int j=i;j>=1;j--){
            System.out.print("*");
        }
        System.out.print("  ");
 }
}
}



// Sum= 1-x^2/2!+x^4/4!-x^6/6!+..........


public class day3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms for sum:");
        int n=in.nextInt();
        System.out.println("Enter the value of x:");
        int x=in.nextInt();
        int p=2*(n-1);
        float fact=1,sum=1,D=-1;
        for(int i=2;i<=p;i++){
            fact=fact*i;
            sum+=D*Math.pow(x,i)/fact;
            D=-D;
        }
        System.out.println("Sum of series is : "+sum);
    }
}




// Sum=1/1!-2/3!+3/5!-4/7!+.......

public class day3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms for sum:");
        int n=in.nextInt();
        float fact=1,sum=0,i,m,D=1;
        for(i=1;i<=n;i++){
           fact*=((2*i)-1);
           sum+=(D*i)/fact;
           D=-D;
        }
        System.out.println("Sum of series is : "+ sum);

    }
}


// Geeks for Geeks pattern question (GEEKS)


// public class day3{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the String");
//         String s=in.next();
//         int l=s.length();
//         System.out.println("Output is :");
//         for(int i=0;i<=l-1;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(".");
//             }
//             for(int j=i;j<=l-1;j++){
//                 System.out.print(s.charAt(j));
//             }
//             System.out.println();
//         }
//     }
// }





