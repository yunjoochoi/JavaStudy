package lang.object.poly;

import static java.nio.file.Files.size;

public class ObjectPolyExam2 {
    public static void main(String[] args) {
        Car car=new Car();
        Dog dog=new Dog();
        Object object = new Object(); //Object 인스턴스도 만들 수 있다

        Object[] objects={dog,car,object};
        size(objects);


    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: "+objects.length);
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
