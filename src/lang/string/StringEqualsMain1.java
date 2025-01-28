package lang.string;

public class StringEqualsMain1 {
    public static void main(String[] args) {


        String a="hello";
        String b="hello";

        System.out.println(a==b);
        System.out.println(a.equals(b));


        a=new String("hello");
        b=new String("hello");

        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
