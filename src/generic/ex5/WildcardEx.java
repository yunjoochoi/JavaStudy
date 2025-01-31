package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    // 제네릭 메서드
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.get());
    }
    // 일반 메서드, 단순히 매개변수로 제네릭 타입을 받을 수 있는 것 뿐
    //제네릭 타입이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니라면, 더 단순한 와일드카드 사용을 권장
    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t=box.get();
        System.out.println("이름 = " +t.getName());
    }
    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t=box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }
    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal=box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

}
