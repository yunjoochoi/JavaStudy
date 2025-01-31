package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 100);

        // 타입 추론 사용!
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog bigger = AnimalMethod.getBigger(dog, new Dog("goo", 200));
        System.out.println("biggerDog = " +bigger);

    }
}
