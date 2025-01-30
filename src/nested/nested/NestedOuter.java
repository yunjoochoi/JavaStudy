package nested.nested;

public class NestedOuter {
    private static int outClassValue=3;
    private int outInstanceValue=2;

    static class nested{ // 전혀 다른 클래스를 안에 넣어둔 것일 뿐이다.
        private int nestedInstanceValue=1;
        public void print(){
            System.out.println("nestedInstanceValue: "+nestedInstanceValue); //자신 멤버 접근
            //바깥클래스의 인스턴스 멤버에 접근 - 불가능(스태틱클래스라서)
            // System.out.println(outInstanceValue);
            // 바깥클래스의 클래스 멤버에 접근
            System.out.println("outClassValue: "+outClassValue);

        }
    }
}
