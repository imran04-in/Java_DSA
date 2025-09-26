package Practice.Basics;

public class ConditionsLoops {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the sum of all numbers
//        Scanner in = new Scanner(System.in);
//        int sum = 0;
//        while (true) {
//            System.out.print("Enter integer numbers (0 to stop): ");
//            int num = in.nextInt(); // Read the next input
//            if (num == 0) {         // Break the loop if input is 0
//                break;
//            }
//            sum += num;             // Add the number to the sum
//        }
//        System.out.println("Sum of numbers: " + sum); // Print the sum

 // Take integer inputs till the user enters 0 and print the largest number from all.

//        Scanner in = new Scanner(System.in);
//        int max = 0;
//
//        while (true){
//            System.out.print("Enter integer number (0 to Stop): ");
//            int num = in.nextInt();
//
//            if (num==0){
//                break;
//            }
//
//            max=Math.max(max,num);
//        }
//        System.out.println(max);





// Input a number and print all the factors of that number (use loops).


//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num= in.nextInt();
//        System.out.println("Factors are:");
//        for (int i=1; i<=num; i++){
//            if (num%i==0){
//                System.out.println(i);
//            }
//        }


        // Subtract the product and sum of an integer
//        Scanner in =new Scanner(System.in);
//
//        System.out.print("Enter a positive integer: ");
//        int num = in.nextInt();
//
//        // Initialize sum and product variables
//        int sum = 0;
//        int product = 1;
//
//        while (num > 0) {
//            int digit = num % 10; // Extract the last digit
//            sum += digit;         // Add to the sum
//            product *= digit;     // Multiply to the product
//            num /= 10;            // Remove the last digit
//        }
//
//        // Calculate the result
//        int result = product - sum;
//
//        // Output the result
//        System.out.println("The result (product - sum) is: " + result);


        //Factorial Program In Java

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        int factroial = 1;
//
//        if (num==0){
//            System.out.println("factorial of 0 is: "+factroial);
//
//        } else {
////        while (num>0){
////            factroial*=num;
////            num--;
////        }
////        System.out.println("factroial is: "+factroial);




        // Calculate Average Of N Numbers

//        Scanner in =new Scanner(System.in);
//        System.out.print("Enter how many number you want to calculate avarage: ");
//        int count= in.nextInt();
//        int division=count;
//        int sum=0;
////        while (count>0){
////            System.out.print("Enter the number :");
////            int num= in.nextInt();
////            sum +=num;
////            count--;
////
////        }
////       int avg=sum/division;
////        System.out.println("avarage is:"+avg);
//
//        for (int i=count;i>0;i--){
//            System.out.print("Enter the number :");
//             int num= in.nextInt();
//             sum +=num;
//
//        } int avg=sum/division;
//        System.out.println("avarage is:"+avg);




// Armstrong Number In Java

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter the number: ");
//        int num= in.nextInt();
//
//        int digit=0;
//        double sum=0;
//
//        //digit calculator
//        int temp =num;
//        while (temp>0){
//                digit++;
//                temp=temp/10;
//        }
//
//        //armstrong number calculation
//            temp =num;
//        while (temp>0){
//                int lastdigit=temp%10;
//                sum+=Math.pow(lastdigit,digit);
//                temp=temp/10;
//
//        }
//        if (sum==num){
//                System.out.println("armstrong number");
//        } else {
//                System.out.println("not a armstrong number");
//        }







   //Find Ncr & Npr

//            Scanner in = new Scanner(System.in);
//            System.out.print("enter 1 for ncr and 2 for npr: ");
//            int choice= in.nextInt();
//
//            if (choice==1){
//                    //ncr program
//                    System.out.print("enter the number you want to calculate ncr from:");
//                    int num1= in.nextInt();
//                    System.out.print("enter the number you want calculate ncr: ");
//                    int num2= in.nextInt();
//
//
//                    int num1fact=1;
//
//                    int temp =num1;
//                    while (temp>0){
//                            num1fact*=temp;
//                            temp--;
//                    }
//
//                    int num2fact=1;
//
//                    temp =num2;
//                    while (temp>0){
//                            num2fact*=temp;
//                            temp--;
//                    }
//
//                    int num3=num1-num2;
//
//                    int num3fact =1;
//                    while (num3>0){
//                            num3fact *=num3;
//                            num3--;
//                    }
//                    int ncr=num1fact/(num2fact*num3fact);
//                    System.out.println(num2+" ncr "+num1+" is:"+ncr);
//
//            }
//            else if (choice==2) {
//                    //npr program
//
//                    System.out.print("enter the number you want to calculate npr from:");
//                    int num1= in.nextInt();
//                    System.out.print("enter the number you want calculate npr: ");
//                    int num2= in.nextInt();
//
//
//                    int num1fact=1;
//
//                    int temp =num1;
//                    while (temp>0){
//                            num1fact*=temp;
//                            temp--;
//                    }
//
//
//
//                    int num3=num1-num2;
//
//                    int num3fact =1;
//                    while (num3>0){
//                            num3fact *=num3;
//                            num3--;
//                    }
//                    int npr=num1fact/num3fact;
//                    System.out.println(num2+" ncp "+num1+" is:"+npr);
//
//
//            } else {
//                    System.out.println("Enter a valid choice");
//            }




  //Find if a number is palindrome or not

//            Scanner in= new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num= in.nextInt();
//
//        int originalNumber=num;
//        int reversedNumber=0;
//
//        while (num>0){
//            int digit=num%10;
//            reversedNumber =reversedNumber*10+digit;
//            num--;
//
//        }
//        if (reversedNumber == originalNumber) {
//            System.out.println("Number is a palindrome");
//
//        } else {
//            System.out.println("Number is not a palindrome");
//        }



   //Kunal is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.



//  String month= "August";
//
//  int startDate=1;
//  int outDays=0;
//
//  while (startDate<=31){
//
//
//      if (startDate%2==0){
//          outDays++;
//      }
//      startDate++;
//  }
//        System.out.println("Kunal can go "+outDays+" in august");
//

































    }
}