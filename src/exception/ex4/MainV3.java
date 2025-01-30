package exception.ex4;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args)  {
        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("전송할 문자를 입력하세요: ");
            String data=scanner.nextLine();
            if(data.equals("exit")){
                break;
            }
            networkService.sendMessage(data);
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
