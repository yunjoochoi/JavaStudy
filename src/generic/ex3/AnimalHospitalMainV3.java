package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        Dog dog = new Dog("dogdog", 100);
        Cat cat = new Cat("catcat", 300);
        
        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();
        //문제 1 - 개변원에 고양이
        // 타입 안전성있어서 불가 dogHospital.set(cat);
        // 문제 2 - 타입 변환 불필요
        dogHospital.set(dog);
        Dog biggerDog= dogHospital.bigger(new Dog("doggy",200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
