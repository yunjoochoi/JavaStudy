package exception.ex4.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {
    private final String address;

    public ConnectExceptionV3(String address,String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
