package exception.ex5;


import exception.ex5.exception.ConnectExceptionV4;
import exception.ex5.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args)  {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("전송할 문자를 입력하세요: ");
            String data=scanner.nextLine();
            if(data.equals("exit")){
                break;
            }
            try{
                networkService.sendMessage(data);
            } catch (Exception e){
                exceptionHandler(e);

            }
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);

        if(e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류] 전송 데이터: " +sendEx.getSendData());
        }
    }
}
