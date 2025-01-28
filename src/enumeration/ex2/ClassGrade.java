package enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC =new ClassGrade();
    public static final ClassGrade GOLD =new ClassGrade();
    public static final ClassGrade DIAMOND =new ClassGrade();

    // 나는 접근 가능 (클래스내부니까)
    private ClassGrade(){

    }
}
