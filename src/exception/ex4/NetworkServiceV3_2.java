package exception.ex4;


import exception.ex4.exception.*;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address="http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try{
            client.connect();
            client.send(data);
        } catch(ConnectExceptionV3 e){
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e){
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e){
            // 런타임 익셉션 등등
            System.out.println("[알 수 없는 오류] 메시지: "+e.getMessage());
        }
        finally {
            //반드시 호출해야 하는 마무리 흐름
            //심지어 try , catch 안에서 잡을 수 없는 예외가 발생해도 finally 는 반드시 호출-- RuntimeException 생겨도 자원해제한다
            client.disconnect();

        }

    }

}
