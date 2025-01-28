package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1=Integer.valueOf(10);
        Integer i2=Integer.valueOf("10");//문자열 변환 후 래퍼타입 반환
        int inte=Integer.parseInt("100"); //문자열 변환후 기본형 반환

        int compareResult=i1.compareTo(20);
        System.out.println("compareResult"+compareResult);

        //산술연산
        int sum1=Integer.sum(10,i1);
        System.out.println("sum1 = " + sum1);
        int max=Integer.max(10,100);
        System.out.println("max = " + max);

    }
}
