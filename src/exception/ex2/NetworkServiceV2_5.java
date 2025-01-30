package exception.ex2;


public class NetworkServiceV2_5 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address="http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try{
            client.connect();
            client.send(data);

        } catch(NetworkClientExceptionV2 e){
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            //반드시 호출해야 하는 마무리 흐름
            //심지어 try , catch 안에서 잡을 수 없는 예외가 발생해도 finally 는 반드시 호출-- RuntimeException 생겨도 자원해제한다
            client.disconnect();

        }

    }

}
