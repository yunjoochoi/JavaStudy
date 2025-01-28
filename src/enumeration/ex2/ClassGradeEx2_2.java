package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {

        //문제 시나리오 2 - 개발자가 아예인스턴스 생성해서 넘긴다면? 제약 건 이유가 없어지고메서드를 완전 잘못쓰는것
        int price=10000;
        DiscountService discountService=new DiscountService();
        /*ClassGrade classGrade=new ClassGrade();
        int newdiscoint = discountService.discount(classGrade, price);
        System.out.println("newdiscoint  = " + newdiscoint );*/
        // 해결법: private 생성자 추가해서 생성차단
     }
}
