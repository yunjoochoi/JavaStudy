package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("dogdog", 100);
        Cat cat = new Cat("catcat", 200);
        
        dogHospital.set(dog );
        catHospital.set(cat);
        
        Dog biggerDog=dogHospital.bigger(new Dog("doggy",300));
        System.out.println("biggerDog = " + biggerDog);
    }
}
