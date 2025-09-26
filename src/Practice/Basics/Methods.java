package Practice.Basics;

public class Methods {
    public static void main(String[] args) {


        /* 1.Define two methods to print the maximum
        and the minimum number respectively among three numbers entered by the user. */

//       int Max= max(12,13,14);
//        System.out.println(Max);
//
//        int Min= min(23,24,45);
//        System.out.println(Min);
//
//    }
//
//    static int max(int a, int b, int c){
//        int max = Math.max(a, Math.max(b,c));
//        return max;
//    }
//
//    static int min(int a, int b, int c){
//        int min = Math.min(a , Math.min(b,c));
//        return min;
//    }


        // 2.Define a program to find out whether a given number is even or odd.


//        if (iseven(12)==true){
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd number");
//        }
//
//
//    }
//
//
//
//  static boolean iseven(int a){
//        return a % 2==0 ;
//  }




  /* 3.A person is eligible to vote if his/her age is greater than or equal to 18.
         Define a method to find out if he/she is eligible to vote. */

//
//       isEligable(18);
//
//
//
//    }
//
//
//    static void isEligable (int age){
//        if (age>=18) {
//            System.out.println("Eligable to vote.");
//
//        } else {
//            System.out.println("Not eligable to vote.");
//        }
//    }


        // 4.Addition of two numbers in Java using method


//        System.out.println(sum(23.76,63.99));
//
//
//    }
//
//
//    static double sum(double a, double b){
//        double sum = a+b;
//        return sum;
//    }


        // 5.Define a method that returns the product of two numbers entered by user.

//        System.out.println(product(24.88,87.745));
//
//    }
//
//    private static double product( double a, double b) {
//        double product = a*b;
//        return product;
//    }





  /* 6.Write a program to print the circumference
        and area of a circle of radius entered by user by defining your own method. */

//       Scanner in = new Scanner(System.in);
//        System.out.print("Enter the radius of circle: ");
//        double radius=in.nextDouble();
//
//        System.out.println("area is " + area(radius));
//        System.out.println("Circumference is "+ circum(radius));
//
//    }
//
//    private static double circum(double radius) {
//        double circum = 2*Math.PI*radius;
//        return circum;
//    }
//
//    static double area(double radius) {
//        double area = Math.PI*radius*radius;
//        return  area;
//    }
//


        // 6.Define a method to find out if a number is prime or not.


//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        isprime(num);
//
//    }
//
//     static void isprime(int num) {
//    // Handle special cases
//    if (num <= 1) {
//        System.out.println(num + " is not a prime number. Please enter a number greater than 1.");
//        return;
//    }
//
//    // Check for factors
//    for (int i = 2; i * i <= num; i++) {
//        if (num % i == 0) {
//            System.out.println(num + " is not a prime number.");
//            return; // Exit the method since we now know it's not prime
//        }
//
//    }
//
//    // If we complete the loop without finding factors
//    System.out.println(num + " is a prime number.");
//}



   /* Write a program that will ask the user to enter his/her marks (out of 100).
   Define a method that will display grades according to the marks entered as below:
    */

//


        //7.Write a program to print the factorial of a number by defining a method named 'Factorial'.

//        factorial( 5);
//
//
//    }
//
//    private static void factorial(int number ) {
//        int fact= 1;
//        while (number>0){
//            fact = fact*number;
//          number--;
//        }
//        System.out.println(fact);
//
//    }


        // 10.Write a function to find if a number is a palindrome or not. Take number as parameter.

//  Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//
//        palindrome(num);
//
//
//
//    }
//
//    private static void palindrome(int num) {
//
//        int originalNum = num;
//        int reverseNum=0;
//        while (num>0){
//
//            int lastDigit = num%10;
//            reverseNum = reverseNum*10 + lastDigit;
//
//            num = num/10;
//
//        }
//        if (reverseNum==originalNum){
//            System.out.println("Its a palindrome number");
//        } else {
//            System.out.println("Its not a palindrome number");
//        }
//
//    }


        // 12.Write a function to check if a given triplet is a Pythagorean triplet or not.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter first number:");
//        int num1 = in.nextInt();
//        System.out.print("Enter second number:");
//        int num2 = in.nextInt();
//        System.out.print("Enter first number:");
//        int num3 = in.nextInt();
//        pythTriplet(num1,num2, num3);
//
//
//
//    }
//
//    private static void pythTriplet(int num1, int num2, int num3) {
//        int sum = num1*num1 + num2*num2;
//
//        if (sum==num3*num3){
//            System.out.println("Its a phythagorean number");
//        }
//        else {
//            System.out.println("Its not a phythagorean number");
//        }
//    }


    }



    }
