package generic.ex3;

import generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal){
        this.animal=animal;
    }
    public void checkup(){
        System.out.println("동물이름 = " + animal.getName());
        System.out.println("동물사이즈 = " + animal.getSize());
        animal.sound();
    }
    public Dog bigger(Dog target){
        return animal.getSize()>target.getSize()? animal:target;
    }
}
