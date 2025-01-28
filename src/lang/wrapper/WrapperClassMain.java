package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer i = new Integer(10); //미레에 삭제 예정 대신 valueOf사용
        Integer iobj=Integer.valueOf(10); //-128-127 자주 사용하는 숫자값 재사용(문자열 풀같이 성능 최적화) 물론 불변
        Long l=Long.valueOf(1002);
        Double d=Double.valueOf(10.2);
        System.out.println("i = " + i);
        System.out.println("iobj = " + iobj);
        int ii=i.intValue(); //값 꺼내기
        System.out.println("ii = " + ii);
        long longValue=l.longValue();




    }
}
