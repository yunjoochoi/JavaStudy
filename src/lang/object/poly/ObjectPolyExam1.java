package lang.object.poly;

public class ObjectPolyExam1 {
    public static void main(String[] args) {
        Car car=new Car();
        Dog dog=new Dog();

        Object obj=car;
        action(car);
        action(dog);
    }
    public static void action(Object o){
        // o.sound(); 컴파일 오류 오브젝트는 사운드가 업음

        // 객체에 맞는 다운캐스팅 필요
        if(o instanceof Dog dog){
            dog.sound();
        } else if(o instanceof Car car){
            car.move();
        }
    }
}
