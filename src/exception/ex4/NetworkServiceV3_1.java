package exception.ex4;


import exception.ex4.exception.*;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address="http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try{
            client.connect();
            client.send(data);
        } catch(ConnectExceptionV3 e){
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendExceptionV3 e){
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
        }
        finally {
            //반드시 호출해야 하는 마무리 흐름
            //심지어 try , catch 안에서 잡을 수 없는 예외가 발생해도 finally 는 반드시 호출-- RuntimeException 생겨도 자원해제한다
            client.disconnect();

        }

    }

}
