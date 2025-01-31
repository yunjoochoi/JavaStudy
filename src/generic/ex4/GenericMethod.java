package generic.ex4;
/*
* 제네릭 메서드의 핵심은 메서드를 호출하는 시점에 타입 인자를 전달해서 타입을 지정하는 것
* */
public class GenericMethod {
    public static Object objMethod(Object object){
        System.out.println("object = " + object);
        return object;
    }

    public static <T> T genericMethod(T t){
        System.out.println("generic = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound = " + t);
        return t;
    }
}
