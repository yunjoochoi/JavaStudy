package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // String클래스로 문자 생성 방법은 두가지
        String str1="hello"; //자동으로 new String안에 넣어줌
        String str2=new String("hello");

        System.out.println(str1);
        System.out.println(str2);
    }
}
