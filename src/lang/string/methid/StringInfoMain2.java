package lang.string.methid;

public class StringInfoMain2 {
    public static void main(String[] args) {
        String str1 = "Hello, java";
        String str2 = "Hello, Java";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("b".compareTo("a"));
        System.out.println("c".compareTo("a"));
        System.out.println(str1.endsWith("Hello"));
        String str ="Hello Java, Welcom to Java world!";
        System.out.println("문자열에 Java포함여부:   "+str.contains("Java"));
        System.out.println("Java;s first index"+str.indexOf("Java"));
        System.out.println("인덱스 10부터 자바인텍스 Java;s first index"+str.indexOf("Java",10 ));
        System.out.println("Java;s last index"+str.lastIndexOf("Java"));
    }
}