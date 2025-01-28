package lang.string.methid;

public class StringInfoMain {
    public static void main(String[] args) {
        String str="Hello, java";
        System.out.println("문자열의 길이: "+str.length());
        System.out.println("문자열의 비어있는지: "+str.isEmpty());
        System.out.println("문자열의 공밷있는지: "+str.isBlank());
        System.out.println("문자열의 길이: "+"                 ".isBlank());

        char a=str.charAt(4);
        System.out.println(a);
    }
}
