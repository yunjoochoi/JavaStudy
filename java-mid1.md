## 오브젝트 클래스
- 자바에서 모든 클래스의 최상위 부모 클래스는 Object 클래스
부모가 없으면 묵시적으로 오브젝트 클래스 extends : 묵시적 상속
Object는 모든 객체에 필요한 공통 기능 제공, 모든 객체를 담을 수 있음
- toString() :객체 정보 제공
- equals() :객체 같은지 비교
- getClass() :객체 클래스 정보 제공

	public static void main(String[] args) {
        Car car=new Car();
        Dog dog=new Dog();

        Object obj=car;
        action(car);
        action(dog);
    }
    public static void action(Object o){
        // o.sound(); 컴파일 오류 오브젝트는 사운드가 업음

        // 객체에 맞는 다운캐스팅 필요
        if(o instanceof Dog dog){
            dog.sound();
        } else if(o instanceof Car car){
            car.move();
        }
    }

- 오브젝트 배열
private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: "+objects.length);
    }
세상의 모든 객체를 담을 수 있으므로 변경 필요 없음 모든 객체를 참조할 수 있는 능력

- toString
패키지 포함한 객체의 이름과 객체의 참조값(해시코드, 16진수로) 반환
println을 사용하면 toString 사용 필요없이 바로 객체정보 출력 내부에서 자체적으로 투스트링 호출하기 때문

- 동일성과 동등성
동일: ==연산자 사용해서 참조가 같은지
동등: equals() 사용해서 논리적으로 동등한 객체인지
Object가 기본으로 제공하는 이퀄즈는 ==비교 제공함=>오버라이딩해야함
왜냐? 클래스마다 동등성이라는 개념이 다름 회원번호? 주민번호기준?

	UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity:"+(user1==user2));
        System.out.println("equality:"+(user1.equals(user2))); // UserV2 클래스에서 오버라이딩 한 후임

완벽한 이퀄스의 구현- 제너레이터 쓰기
동일성 비교가 항상 필요한 것은 아니니 필요한 경우에만 재정의하여 사용한다. 
