package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iteration=1_000_000_000; // 그냥 구분자
        long startTime,endTime;

        long sumPrimitive=0;
        startTime=System.currentTimeMillis();
        for(int i=0;i<iteration;i++){
            sumPrimitive+=i;
        }
        endTime=System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("(endTime-startTime) = " + (endTime-startTime));


        // 래퍼 클래스 Long 사용

        Long longsumPrimitive=0L;
        startTime=System.currentTimeMillis();
        for(int i=0;i<iteration;i++){
            longsumPrimitive+=i;
        }
        endTime=System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("Long: (endTime-startTime) = " + (endTime-startTime));
    }
}
