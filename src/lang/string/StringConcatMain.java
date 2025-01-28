package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a="hello";
        String b=" Java";

        String result1=a.concat(b);
        String result2=a+b; //참조값은 더하기 불가! 근데 왜 가능?: 편의상 +연산 허용

        System.out.println(result1+result2);
    }
}
