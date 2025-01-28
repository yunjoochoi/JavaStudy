package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        // String과의 차이점: 메서드 사용후 재할당 안해도 변환이 유지된다!
        // 이유: StringBuilder는 가변객체이기떄문(메모리사용줄이고 성능향상)-사이드이펙트주의
        // 스트링 바꿔야할때 많을떄 이거 쓰다가 마지막에 스트링으로 바꿔주면 더 효율적이다
        sb.append("A").append("B").append("C").append("D").insert(4,"Java").delete(4,8).reverse();
        System.out.println("sb= "+sb); //sb= DCBA

        // to String
        String string=sb.toString();
        System.out.println(string);
    }
}
