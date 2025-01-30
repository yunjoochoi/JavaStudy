package nested.anonymous.ex0;

public class Ex0MainRef {
    public static void hello(String str){
        System.out.println("프로그램 시작");
        System.out.println("hello"+str);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}
