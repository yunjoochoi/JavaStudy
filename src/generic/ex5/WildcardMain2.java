package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

// 와일드카드는 상한 뿐만 아니라 하한도 지정할 수 있ek (제네릭은 불가_)
public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //writeBox(dogBox); //하한이 Animal
        //writeBox(catBox); //하한이 Animal
        writeBox(animalBox);
        writeBox(objectBox);

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    static void writeBox(Box<? super Animal> box){// 하한 설정
        box.set(new Dog("멍멍이",100));
    }
}
