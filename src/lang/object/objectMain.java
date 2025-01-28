package lang.object;

public class objectMain {
    public static void main(String[] args) {
        Child child=new Child();
        child.childMethod();
        child.parentMethod();
        // toString()은 오브젝트 클래스의 메서드-객체 정보 제공
        String string = child.toString();
        System.out.println(string);
    }
}
