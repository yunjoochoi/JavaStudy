package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("dogdog", 100);
        Cat cat = new Cat("catcat", 300);
        
        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();
        //문제 1 - 개변원에 고양이
        dogHospital.set(cat);
        // 문제 2 - 타입 변환 필요 :다운캐스팅
        dogHospital.set(dog);
        Dog biggerDog=(Dog)dogHospital.bigger(new Dog("doggy",200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
