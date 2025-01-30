package exception.ex3;


public class NetworkServiceV1 {
    public void sendMessage(String data){
        String address="http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult= client.connect();
        if (isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: " +connectResult);
        } else{
            String sendResult=client.send(data);
            if(isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드: " +sendResult);
            }
        }
        client.disconnect();;
    }
    private boolean isError(String resultCode){
        return !resultCode.equals("success");
    }
}
