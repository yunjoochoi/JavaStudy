package lang.string.methid;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num=100;
        boolean bool=true;
        Object o=new Object();
        String str="Hello, Java!";

        //모두 스트링 타입으로 바꾸어줌
        String numString=String.valueOf(num);
        String boolString=String.valueOf(bool);
        String objectString=String.valueOf(o);
        System.out.println(numString+boolString+objectString);

        //문자+x ==문자
        String numString2=""+num;
        System.out.println(numString2);

        // toCharArr 메서드
        char[] strCharArr=str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 가능!");
        for (char c : strCharArr) {
            System.out.print(c);
        }

        // format method
        String format=String.format("%d, %b, %s",num,bool,str);
        System.out.println(format);

        String format2=String.format("숫자: %.2f", 10.31334);
        System.out.println(format2);

        //reg expression
        String regex="Hello, (World|Java)!";
        System.out.println("pattern exists? "+str.matches(regex));
    }
}
