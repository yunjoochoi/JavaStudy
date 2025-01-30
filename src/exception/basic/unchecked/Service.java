package exception.basic.unchecked;


public class Service {
    Client client=new Client();

    public void callCatch(){
        try{
            client.call();
        } catch (MyUncheckedException e){
            System.out.println("예외 처리 Message: "+e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    public void callThrow(){
        client.call();
    }
}
