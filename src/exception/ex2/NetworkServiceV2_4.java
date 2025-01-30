package exception.ex2;


public class NetworkServiceV2_4 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address="http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try{
            client.connect();
            client.send(data);

        } catch(NetworkClientExceptionV2 e){
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
        client.disconnect();

    }

}
