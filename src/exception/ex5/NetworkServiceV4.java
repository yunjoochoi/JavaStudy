package exception.ex5;


public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address="http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data);

        try{
            client.connect();
            client.send(data);
        }
        finally {
            //반드시 호출해야 하는 마무리 흐름
            //심지어 try , catch 안에서 잡을 수 없는 예외가 발생해도 finally 는 반드시 호출-- RuntimeException 생겨도 자원해제한다
            client.disconnect();

        }

    }

}
