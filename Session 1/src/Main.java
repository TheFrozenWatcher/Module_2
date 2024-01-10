import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        String name="ABC";
        StringBuilder nameBuilder=new StringBuilder(name);
        nameBuilder.append("- 24 tuổi");
        System.out.println(nameBuilder);
//        Đọc  dữ liệu nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String fullName= scanner.nextLine();
        System.out.print("\n nhập chiều cao");
//        float height=scanner.nextFloat();
        float height=Float.parseFloat(scanner.nextLine());
        System.out.printf("\nHello bạn %s, chiều cao của bạn là %.1f ",fullName,height);
        System.err.println("\nĐây là lỗi");
//        Lưu ý nuốt dòng: chuyển nhập số sang nhập chuỗi thì bị nuốt dòng

        String description=scanner.nextLine();
        System.out.println(description);
    }
}



