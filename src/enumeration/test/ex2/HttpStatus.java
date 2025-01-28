package enumeration.test.ex2;

public enum HttpStatus {
    OK(200,"OK"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404,"Not Found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
    public boolean isSuccess(){
        return ( code>=200 && code<=299);
    }
    public static HttpStatus findByCode(int input){
        for (HttpStatus value : HttpStatus.values()) { // 그냥 values()만 써도 알아들음
            if(value.getCode()==input){
                return value;
            }
        }
        return null;
    }
}
