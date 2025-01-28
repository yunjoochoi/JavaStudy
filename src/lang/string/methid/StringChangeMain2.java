package lang.string.methid;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String str ="      Java World!   ";

        System.out.println("lowercase "+str.toLowerCase());
        System.out.println("uppercase "+str.toUpperCase());
        System.out.println("공백제거 trim "+str.trim());
        System.out.println("공백제거 strip "+str.strip()); //whilespace+유니코드공백


    }
}
