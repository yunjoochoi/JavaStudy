package generic.ex4;

import java.lang.runtime.ObjectMethods;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i=1;
        Object object = GenericMethod.objMethod(i);


        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integer=GenericMethod.<Integer>numberMethod(10);
        Double aDouble = GenericMethod.<Double>numberMethod(2.22);

    }
}
