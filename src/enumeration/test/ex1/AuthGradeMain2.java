package enumeration.test.ex1;


import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("당신의 등급을 입력하시오"+ Arrays.toString(AuthGrade.values())+": ");
        String level=scanner.nextLine();
        AuthGrade grade=AuthGrade.valueOf(level.toUpperCase());

        System.out.println("당신의 등급은 "+grade.getDescription()+"입니다.");
        grade.menuPrint();




    }

}
