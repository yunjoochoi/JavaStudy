package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

//와일드카드는 이미 만들어진 제네릭 타입을 활 용할 때 사용
public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<Object>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<Cat>();

        dogBox.set(new Dog("멍멍이",100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox); //타입 인자가 정해진 제네릭 타입을 전달 받아서 활용할 때 사용

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    }
}
