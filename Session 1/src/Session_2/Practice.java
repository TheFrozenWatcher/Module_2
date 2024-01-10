package Session_2;


import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
////        Practice 1
//        for (int i = 1; i <=100; i++)
//        {
//        System.out.print(i + ",");
//        if (i % 10 == 0) {
//            System.out.println();
//        }
//    }

//        Practice 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = Integer.parseInt(scanner.nextLine());
//        if (number < 2) {
//            System.out.println(number + " is not a prime");
//        } else {
//            int i = 2;
//            boolean check = true;
//            while (i < number) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//                i++;
//            }
//            if (check) {
//                System.out.println(number + " is a prime");
//            } else {
//                System.out.println(number + " is not a prime");
//
//            }
//
//        }

//        Practice 3
//        int a;
//        int b;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a: ");
//        a= input.nextInt();
//        System.out.println("Enter b: ");
//        b= input.nextInt();
//        a = Math.abs(a);
//        b = Math.abs(b);
//        if (a==0 || b ==0){
//            System.out.println("No greatest common factor.");
//        } while (a!=b){
//            if (a>b){
//                a=a-b;
//                System.out.println("a=" + a);
//            } else {
//                b=b-a;
//                System.out.println("b=" + b);
//            }
//        }
//        System.out.println("Greatest common factor: " + a);

////        Practice 4

//        double money = 1.0;
//        int month = (int) 1.0;
//        double interestRate = 1.0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter investment amount: ");
//        money = input.nextDouble();
//        System.out.println("Enter number of months: ");
//        month = input.nextInt();
//        System.out.println("Enter annual interest rate in percentage: ");
//        interestRate=input.nextDouble();
//        double totalInterest=0;
//        for (int i=0; i< month; i++){
//            totalInterest +=money*(interestRate/100)/12*month;
//        }
//        System.out.println("Total of interest: " + totalInterest);

////    Practice 5

        int choice = 1;
        Scanner input = new Scanner(System.in);
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exist");
            System.out.println("Enter your choice: ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 3:
                    System.out.println("3. Draw the rectangle");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}

