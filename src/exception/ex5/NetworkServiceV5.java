package exception.ex5;


public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address="http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) { // try 괄호 안에 사용할 자원을 명시
            client.initError(data);
            client.connect();
            client.send(data);
            //이 자원은 try 블럭이 끝나면 자동으로 AutoCloseable.close() 를 호출해서 자원을 해제
        }
        catch (Exception e){
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }

    }

}
