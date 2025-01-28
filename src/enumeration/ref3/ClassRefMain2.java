package enumeration.ref3;


public class ClassRefMain2 {
    public static void main(String[] args) {
        int price=10000;

        Grade[] grades=Grade.values();
        for (Grade grade : grades) {
            print(grade,price);
        }
    }

    private static void print(Grade grade,int price){
        System.out.println(grade.name() +" = "+grade.discount(price));
    }
}
