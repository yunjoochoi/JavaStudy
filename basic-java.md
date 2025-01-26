
- 패키지 계층 구조: 완전히 서로 다른 패키지므로 import 해서 써야함

- 접근제어자
private 같은 클래스 안에만 호출 허용
default 같은 패키지 안에만 호출 허용
protected 같은 패키지, 다른 패키지 상속 관계의 호출만 허용
plublic 어디서나 

접근제어자 클래스레벨
public(항상 파일명과 동일해야함), default만 사용가능
하나 자바 파일에 퍼블릭 클래스는 오직 하나
디폴트 클래스는 무한정 생성 가능

<br>

## 캡슐화
데이터는 무조건 다숨기기
기능도 다숨기기 정말 필요한 기능 아니면 엔진키고연료주입같이 사용자가 알필요없는 함수는 private
사용자가 사용하는 기능만 열어두기
기능은 기능 구현에 사용하는 속성에 가까이 있는게 좋다. - 그 클래스에 두기 

<br>

## static
자바 메모리 구조
메서드 영역: 공용 영역으로 쓸거/ 붕어빵 틀 / static 메서드, static변수(클래스이름으로접근,사용 위헤서 인스턴스생성필요없음)/ 상수 풀 등
스택영역: 메서드 호출 시마다 스택 프레임 쌓임 (지역변수 등)
인스턴스영역: 동적생성된객체 실제생성되는곳

스태틱 정적 변수는 프로그램 실행 시 딱한번 만들어지고 종료시점에 제거됨 

	System.out.println(data4.count); //권장안함- 힙에 들렸다 다시 스태택에감,또 인스턴스변수인지 스태틱변수인지 헷갈림
        // 클래스 통한 접근
        System.out.println(Data3.count);

스태틱 메서드: 그냥 붕어빵 틀에 존재하는 함수로, 사용하기 위해 인스턴스 생성도 필요없음. 
		클래스 내부 기능이나 멤버변수 사용 시 스태틱 붙은것만 사용 가능
		즉 정적 메서드는 인스턴스 변수, 인스턴스 메서드 사용 불가
		반대로 모든 곳에서 호출 가능
		스태틱에서도 참조값 넘겨주면 인스턴스의 변수나 함수를 접근 가능 스태틱은 인스턴스의 참조값(힙)의 정보가 없어서 접근 못하는 거임

 	//인스턴스르 통한 접근
        DecoData data3=new DecoData();
        data3.staticCall(); //불가능은 아님 but, 클래스 소속 메서드는 명시적으로 클래스 사용하여 접근
        // by class
        DecoData.staticCall(); //클래스 소속 메서드는 명시적으로 클래스 사용하여 접근(코드 이해성향상)

import static static2.DecoData.*; 이런식으로 클래스 이름 일일히 쓰기 불편하면 임포트해서 클래스명 생략해서 사용

**정적 메서드는 정적 메서드만 호출가능그래서 메인이 사용하는 메서든느 모두 스태틱이었던것이다

 <br>

## final
final int vlaue; //  한번만 초기화될수 있다 값 변경을 막음 
static final == 상수(중앙에서 관리, 고정된 값, 매직넘버없애서 코드가독성높임)


<br>

** 객체지향 프로그래밍의 대표적인 특징으로는 캡슐화, 상속, 다형성이 있다. 그중에 다형성은 객체지향의 꽃 ** 
## 상속
super: 오버라이딩 된 경우에 부모를 참조
(규칙)상속관계를 사용하려면 자식 클래스의 생성자에서 부모 클래스 생성자를 호출해야함(부모 기본 생성자인경우 생략가능)
초기화는 최상위 부모부터 이루어림= 자식생성자에서 부모생성자를 호출하기 때문
final이 class에 붙으면 상속이 불가하다는 의미 / 확장불가의미
메서드에 final 붙으면 오버라이딩 불가능하다는 의미


<br>

## 다형성
한 객체가 여러 타입의 객체로 취급될 수 있다.
1. 다형적 참조: 하나의 변수 타입(부모)으로 다양한 자식 인스턴스 참조 가능
   
        System.out.println("P->C");
        Parent ploy=new Child(); //업캐스팅
        ploy.parentMethod();
        // ploy.childMethod(); 불가능, 자식의 기능은 호출 불가
   
부모는 자식을 담을 수 있다. 반대는 불가

호출한 변수의 타입에 가서 참조-상속관계는 부모 방향으로 올라가서 찾는 것은 가능한데, 밑으로 가서 찾는것은 불가능 그래서 오류-패런트는 차일드에 대한 정보가 없음(extends없으니까)
=>해결법은 "캐스팅"
**다운캐스팅-문제생길가능성많음, 없는메소드(자식) 사용하려하면 오류 **
        
	Child child=(Child) poly;
        child.childMethod();

	Parent parent1=new Child();
        Child child1=(Child) parent1;
        child1.childMethod(); //문제 없음

        Parent parent2=new Parent();
        Child child2=(Child)parent2;
        child2.childMethod(); //오류 ClassCastException

	//일시적 다운캐스팅-해당 메서드 호출 순간에만 캐스팅
        ((Child) poly).childMethod();

컴파일오류: 변수명 오타, 잘못된 클래스 이름 사용 등 프로그램 실행 전에 발생-안전하고 좋은 오류
런타임 오류: 프로그램 실행 도중 발생하는 오류, 매우 않좋음

	package ploy.basic;

	public class CastingMain5 {
	    	public static void main(String[] args) {
	        System.out.println("parent1");
	        Parent parent1=new Parent();
	
	        call(parent1);
	        System.out.println("parent2");
	
	        Parent parent2=new Child();
	        call(parent2);
	 	}
    	

    		private static void call(Parent parent){ 
       		 parent.parentMethod();
        	if(parent instanceof Child){ // Child로 생성된 인스턴스면
           	 System.out.println("Child instance OK");
           	 ((Child) parent).childMethod();
    	    }
       		 else{
            System.out.println("not Child instance");
        }
    	}
	}

2. 메서드 오버라이딩: 기존 기능을 하위 타입에서 새로운 기능으로 재정의
변수는 오버라이딩 X, 메서드는 오버라이딩 O
변수 val, 메소드 method를 각각 똑같이 가지고 있을때.

	// 부모 변수가 자식 인스턴스 참조(다형적 참조)
	
 	Parent poly=new Child();
        System.out.println("P->C");
        System.out.println("value = "+poly.val); // 변수는 오버라이딩 X
        poly.method(); // 메서드는 오버라이딩 O

타입이 parent니까 물론 Parent찾아 간다. 그래서 변수는 parent로 나옴
메서드도 parent의 메서드를 찾아 가지만 하위타입(Child)이 오버라이딩되어있다.(하위 타입일수록 우선권 가진다.)
하지만, 오버라이딩 된 메서드는 항상 우선권을 지닌다



새로운 부분이 추가되었을때 코드 변화 부분이 최소화하게 작성된 코드가 최고, 이를 다형성으로 구현

하나의 변경사항이 발생했을떄, 어디까지 변경사항이 퍼지나 = 샷건 효과 = 최소화시켜야



## 추상클래스
추상클래스: 동물(Animal)와 같이 부모 클래스는 제공하지만, 실제 생성되어선 안되는 클래스를 처리할때 사용
		즉, 실제 인스턴스가 존재X, 상속을 위해 존재(다형성)
		* 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야
		* 추상 메서드는 성속받은 자식메서드에서 반드시 수정해야
		제약이 있는 클래스일뿐 나머지는 모두 클래스와 같다.
  
	abstract class AbstractAnimal {
	    public abstract void sound();
	    public abstract void move();
	}
순수추상클래스: 다형성을 위한 부모 타입으로써 껍데기 역할만 하고 실행 로직 전혀 없다
			상속하는 클래스는 모든 메서드를 구현해야함

## 인터페이스
인터페이스:= 순수추상클래스 규격에 맞춰야 함=인터페이스 같음 / 순수추상클래스와 달리 원천적으로 일반 메서드 못씀
모든 메서드는public, abstract이다. 보통 둘다 생략해서 사용
인터페이스의 멤버 변수는 public, static, final이 모두 포함되엇다고 가정, 즉 생략가능(권장) 상수로 쓰임(static final이라서)

	public interface InterfaceAnimal {
	    void sound();
	    void move();
	}
*인터페이스 상속받을때: public class Dog implements InterfaceAnimal{}

인터페이스의 모든 메서드를 구현해야한다는 규약을 넣는 것(클래스)이다.

인터페이스는 다중 상속과 구현이 가능: 모든 메서드가 추상메서드라서(기능이없다) 상관이 없다.
어차피 차일드에서 재정의해야함

	InterfaceA a=new Child();
        a.methodA();
        a.commonMethod();
        // a.methodB(); 오류난다: InterfaceA 캐스팅된 클래스는 InterfaceA 안의 메서드밖에 모름

        InterfaceB b=new Child();
        b.methodB();
        b.commonMethod();
        // b.methodA(); 오류난다

<br>

## 좋은 객체 지향 프로그래밍이란?
다형성이 **가장**중요하다.
역할(인터페이스)과 구현(인터페이스 구현한 클래스)을 분리
다형성의 본질: 클라이언트(요청)-서버(응답)
클라이언트를 변경하지 않고 서버 구현 기능을 유연하게 변경가능
인터페이스를 변경하게되면 서버, 클라이언트 모두에게 큰 변화 즉 인터페이스를 안정적이게 설계하는게 매우 중요
디자인패턴<-다형성

OCP open closed principle (면접기출)
확장에는 열려있고 - 기능 추가 위해 기존 코드는 확장 가능
변경에는 닫혀있음 - 기존 코드는 수정되지 말아야 한다

새로운 자동차를 추가해도 driver에는 전혀 손댄게없음 
(디자인패턴)전략패턴: 알고리즘을 클라이언트의 수정 없이 쉽게 교체 가능
