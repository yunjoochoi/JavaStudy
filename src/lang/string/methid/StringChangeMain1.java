package lang.string.methid;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str ="Hello, Java!, Welcome to Java world!";

        System.out.println("문자얄 7부터의 부분인덱스: "+str.substring(7));
        System.out.println("문자얄 7부터 12까지 부분인덱스: "+str.substring(7,12));
        System.out.println(str.concat("!!!"));

        System.out.println("자바를 월드로 대체 "+str.replace("Java","world"));
        System.out.println("첫번쨰 자바만 월드로 대체 "+str.replaceFirst("Java","World"));
    }
}
