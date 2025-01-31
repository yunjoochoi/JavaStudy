package generic.ex3;

import generic.animal.Animal;
/*
* 1. 어떤 타입이 들어올 지 알 수 없기 때문에 T 를 어떤 타입이든 받을 수 있는 모든 객체의 최종 부모인 Object 타입으로 가정한다.
* 따라서 Object 가 제공하는 메서드만 호출할 수 있다.
* 2. Integer , Object 같은 동물과 전혀 관계 없는 타입을 타입 인자로 전달 할 수 있다는 점이다.
* 우리는 최소한 Animal 이나 그 자식을 타입 인자로 제한
* */
public class AnimalHospitalV2<T> {
    private T animal;
    public void set(T animal) {
        this.animal=animal;
    }
    public void checkup(){
        // T타입을 메서드 정의 시점에는 알 수 없으므로 오브젝트의 메서드만 사용가능
        animal.toString();
        animal.equals(null);
    }
    public Animal bigger(Animal target){
        // 컴파일 오류 return animal.getSize()>target.getSize()? animal:target;
        return null;
    }
}
