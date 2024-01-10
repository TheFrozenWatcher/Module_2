package Session_1;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

////        Ex 1
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Hello: " + name);


//        //Ex2
//        System.out.print("Nhập giá trị USD: ");
//        float USD=Float.parseFloat(scanner.nextLine());
//        System.out.print("Nhập tỷ giá quy đổi: ");
//        float exchangeRate=Float.parseFloat(scanner.nextLine());
//        float VND = USD*exchangeRate;
//        System.out.print("Giá trị VND là "+ VND);

//        Ex 3
//
//        // Bước 1: Nhập số cần đọc
//        System.out.print("Nhập số cần đọc (0-999): ");
//        int number = scanner.nextInt();
//
//        // Bước 2: Đọc số có một chữ số
//        if (number >= 0 && number < 10) {
//            printSingleDigit(number);
//        }
//        // Bước 3: Đọc số có hai chữ số nhỏ hơn 20
//        else if (number >= 10 && number < 20) {
//            printTwoDigitsLessThan20(number);
//        }
//        // Bước 4: Đọc số có hai chữ số lớn hơn hoặc bằng 20
//        else if (number >= 20 && number < 100) {
//            printTwoDigits(number);
//        }
//        // Bước 5: Đọc số có ba chữ số
//        else if (number >= 100 && number <= 999) {
//            printThreeDigits(number);
//        }
//        // Trường hợp số cần đọc vượt quá khả năng
//        else {
//            System.out.println("Out of ability");
//        }
//
//        scanner.close();
//    }
//
//    // Phương thức đọc số có một chữ số
//    private static void printSingleDigit(int num) {
//        switch (num) {
//            case 0:
//                System.out.print("Zero");
//                break;
//            case 1:
//                System.out.print("One");
//                break;
//            case 2:
//                System.out.print("Two");
//                break;
//            case 3:
//                System.out.print("Three");
//                break;
//            case 4:
//                System.out.print("Four");
//                break;
//            case 5:
//                System.out.print("Five");
//                break;
//            case 6:
//                System.out.print("Six");
//                break;
//            case 7:
//                System.out.print("Seven");
//                break;
//            case 8:
//                System.out.print("Eight");
//                break;
//            case 9:
//                System.out.print("Nine");
//                break;
//        }
//    }
//
//    // Phương thức đọc số có hai chữ số nhỏ hơn 20
//    private static void printTwoDigitsLessThan20(int num) {
//        switch (num) {
//            case 10:
//                System.out.print("Ten");
//                break;
//            case 11:
//                System.out.print("Eleven");
//                break;
//            case 12:
//                System.out.print("Twelve");
//                break;
//            case 13:
//                System.out.print("Thirteen");
//                break;
//            case 14:
//                System.out.print("Fourteen");
//                break;
//            case 15:
//                System.out.print("Fifteen");
//                break;
//            case 16:
//                System.out.print("Sixteen");
//                break;
//            case 17:
//                System.out.print("Seventeen");
//                break;
//            case 18:
//                System.out.print("Eighteen");
//                break;
//            case 19:
//                System.out.print("Nineteen");
//                break;
//        }
//    }
//
//    // Phương thức đọc số có hai chữ số lớn hơn hoặc bằng 20
//    private static void printTwoDigits(int num) {
//        int tens = num / 10;
//        int ones = num % 10;
//
//        switch (tens) {
//            case 2:
//                System.out.print("Twenty");
//                break;
//            case 3:
//                System.out.print("Thirty");
//                break;
//            case 4:
//                System.out.print("Forty");
//                break;
//            case 5:
//                System.out.print("Fifty");
//                break;
//            case 6:
//                System.out.print("Sixty");
//                break;
//            case 7:
//                System.out.print("Seventy");
//                break;
//            case 8:
//                System.out.print("Eighty");
//                break;
//            case 9:
//                System.out.print("Ninety");
//                break;
//        }
//
//        if (ones > 0) {
//            System.out.print(" ");
//            printSingleDigit(ones);
//        }
//    }
//
//    // Phương thức đọc số có ba chữ số
//    private static void printThreeDigits(int num) {
//        int hundreds = num / 100;
//        int remainder = num % 100;
//
//        printSingleDigit(hundreds);
//        System.out.print(" Hundred");
//
//        if (remainder > 0) {
//            System.out.print(" and ");
//            if (remainder < 10) {
//                printSingleDigit(remainder);
//            } else if (remainder < 20) {
//                printTwoDigitsLessThan20(remainder);
//            } else {
//                printTwoDigits(remainder);
//            }
//        }
//


////        Ex 4
//        System.out.print("Nhập chiều dài: ");
//        float width = Float.parseFloat(scanner.nextLine());
//        System.out.print("Nhập chiều rộng: ");
//        float height = Float.parseFloat(scanner.nextLine());
//        System.out.printf("Chu vi là "+ (height+width)*2);
//        System.out.printf("\nDiện tích là là "+ height*width);



//        Ex5
//        System.out.print("Nhập điểm Toán: ");
//        float Math = Float.parseFloat(scanner.nextLine());
//        System.out.print("Nhập điểm Văn: ");
//        float Literature = Float.parseFloat(scanner.nextLine());
//        System.out.print("Nhập điểm Lý: ");
//        float Physics = Float.parseFloat(scanner.nextLine());
//        System.out.print("Nhập điểm Hóa: ");
//        float Chemistry = Float.parseFloat(scanner.nextLine());
//        System.out.print("Nhập điểm Anh: ");
//        float English = Float.parseFloat(scanner.nextLine());
//        if (Math < 0 || Math > 10 || Literature < 0 || Literature > 10 || Chemistry < 0 || Chemistry > 10 || Physics < 0 || Physics > 10 || English < 0 || English > 10) {
//            System.out.print("Nhập sai điểm");
//        } else {
//            float score=(Math+Literature+Physics+English+Chemistry)/5;
//            System.out.println("Điểm trung bình là "+ score);
//            if (score >= 0 && score < 5) {
//                System.out.print("Học lực yếu");
//            } else if (score >= 5 && score < 6.5) {
//                System.out.print("Học lực trung bình");
//            } else if (score >= 6.5 && score < 8) {
//                System.out.print("Học lực khá");
//            } else if (score >= 8 && score < 9) {
//                System.out.print("Học lực giỏi");
//            } else if (score >= 9) {
//                System.out.print("Học lực xất sắc");
//            }
//        }
////        Ex 6
//        System.out.print("Nhập số: ");
//        float number = Float.parseFloat(scanner.nextLine());
//        String a=" chia hết cho cả 3 và 5";
//        String b=" chỉ chia hết cho 3";
//        String c=" chỉ chia hết cho 5";
//        String d=" không chia hết cho 3 , cũng không chia hết cho 5";
//        if (number%3==0&& number%5==0){
//            System.out.println(number+a);
//        } else if (number%3==0&& number%5!=0){
//            System.out.println(number+b);
//        } else if (number%3!=0&& number%5==0){
//            System.out.println(number+c);
//        } else if (number%3!=0&& number%5!=0){
//            System.out.println(number+d);
//        }

//        Ex 7
//        int key= Integer.parseInt(scanner.nextLine());
//        switch (key) {
//            case 1:
//                System.out.print("Số một");
//                break;
//            case 2:
//                System.out.print("Số hai");
//                break;
//            case 3:
//                System.out.print("Số ba");
//                break;
//            case 4:
//                System.out.print("Số bốn");
//                break;
//            case 5:
//                System.out.print("Số năm");
//                break;
//            case 6:
//                System.out.print("Số sáu");
//                break;
//            case 7:
//                System.out.print("Số bảy");
//                break;
//            case 8:
//                System.out.print("Số tám");
//                break;
//            case 9:
//                System.out.print("Số chín");
//                break;
//            default:
//                System.out.print("Số vừa nhập không hợp lệ!");
//                break;
//        }
    }
}
