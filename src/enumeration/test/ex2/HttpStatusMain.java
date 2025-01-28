package enumeration.test.ex2;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("HTTP code:");
        int httpinput=scanner.nextInt();
        scanner.nextLine();
        HttpStatus httpStatus=HttpStatus.findByCode(httpinput);
        if (httpStatus == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(httpStatus.getCode() + " " + httpStatus.getMessage()); System.out.println("isSuccess = " + httpStatus.isSuccess());
        }


    }
}
