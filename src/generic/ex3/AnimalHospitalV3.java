package generic.ex3;

import generic.animal.Animal;
/*
* 타입 매개변수에 입력될 수 있는 상한을 지정해서 문제를 해결
*/
public class AnimalHospitalV3<T extends Animal> {
    private T animal;
    public void set(T animal) {
        this.animal=animal;
    }
    public void checkup(){
        System.out.println("동물이름 = " + animal.getName());
        System.out.println("동물사이즈 = " + animal.getSize());
        animal.sound();
    }
    public T bigger(T target){
        return animal.getSize()>target.getSize()? animal:target;
    }
}
