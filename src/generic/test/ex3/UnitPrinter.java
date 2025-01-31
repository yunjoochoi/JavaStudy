package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
    // Generic
    public static <T extends BioUnit> void printV1(Shuttle<T> s){
        T out = s.out();
        System.out.println("이름: " + out.getName()+"HP: "+out.getHp());
    }

    // Wildcard
    public static void printV2(Shuttle<?> shuttle){ // extends BioUnit없어도 돌아가는걸 보니 제너릭메서드와 일반메서드 차이를 느낄수있다
        BioUnit out = shuttle.out();
        System.out.println("이름: " + out.getName()+"HP: "+out.getHp());
    }
}
