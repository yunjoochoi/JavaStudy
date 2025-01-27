## 1) 오브젝트 클래스
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

1. toString
  
패키지 포함한 객체의 이름과 객체의 참조값(해시코드, 16진수로) 반환

println을 사용하면 toString 사용 필요없이 바로 객체정보 출력 내부에서 자체적으로 투스트링 호출하기 때문

2. equals
```
동일성과 동등성
동일: ==연산자 사용해서 참조가 같은지
동등: equals() 사용해서 논리적으로 동등한 객체인지
```
Object가 기본으로 제공하는 이퀄즈는 ==비교 제공함=>오버라이딩해야함

왜냐? 클래스마다 동등성이라는 개념이 다름 회원번호? 주민번호기준?

        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity:"+(user1==user2));
        System.out.println("equality:"+(user1.equals(user2))); // UserV2 클래스에서 오버라이딩 한 후임

완벽한 이퀄스의 구현- 제너레이터 쓰기

동일성 비교가 항상 필요한 것은 아니니 필요한 경우에만 재정의하여 사용한다. 

<br><br>

## 2) 불변 객체

- 자바의 데이터 타입

기본형: int, double등 소문자로 된 애들. 하나의 값을 여러 변수에서 절대로 공유하지 않는다. (값 복사)

참조형: 하나의 값을 참조값 통해 여러 변수에서 공유 (주소 복사)


### 자바의 데이터 타입

기본형: int, double등 소문자로 된 애들. 하나의 값을 여러 변수에서 절대로 공유하지 않는다. (값 복사)

참조형: 하나의 값을 참조값 통해 여러 변수에서 공유 (주소 복사)

개발하다 보면 참조형 변수 특징떄문에 실수할 수 있다  


### 공유 참조와 사이드이펙트

사이드이펙트: 어떤 계산 외에 추가적인 부수 효과를 일으킴

> 코드
```
public static void main(String[] args) {
        Address address=new Address("서울");
        Address b=address;
        System.out.println(address);
        System.out.println(b);

        b.setValue("부산");
        System.out.println(address);
        System.out.println(b);
        }
```

> 결과
```
Address{value='서울'}
Address{value='서울'}
Address{value='부산'}
Address{value='부산'}
```
의도치 않은 변경 시행됨

=> 서로 다른 객체 참조하게 해서 공유를 안하면 됨 (new 생성)
하나의 객체를 공유하지 않도록 하면 된다.

객체의 공유를 막는 방법
- 기본형: 절대 값이 공유되지않음

- 불변객체: 객체 내부의 값이 변하지 않는 객체 클래스 멤버변수에 final 추가, setValue 제거
```
public static void main(String[] args) {
        ImmutableAddress address=new ImmutableAddress("서울");
        ImmutableAddress b=address; //참조값 대입을 막을 수 있는 방법은 업다.
        System.out.println(address);
        System.out.println(b);

        // b.setValue("부산");
        b=new ImmutableAddress("부산");//값 못바꾸니, 새로 생성해서 담아야 겠네?
        System.out.println(address);
        System.out.println(b);
    }

```
- 불변 객체에서 값 변경법 (setter는 어떻게?)
```
public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 mem1 = new MemberV2("mem1", address);
        MemberV2 mem2= new MemberV2("mem2", address);

        System.out.println("mem1: "+mem1);
        System.out.println("mem2: "+mem2);

        System.out.println("2의 주소 변경");
        mem2.setAddress(new ImmutableAddress("부산"));
        System.out.println("mem1: "+mem1);
        System.out.println("mem2: "+mem2);

    }


public ImmutableMyDate withMonth(int month){
        return new ImmutableMyDate(this.year,month,this.day);
    }

```
- 불변 객체에서 값을 면경하는 경우 set을 안쓰고 with~()로 작명한다.
- 자바에서 제공하는 많은 클래스들이 불변객체로 설계됨- String, Integer등등
캐시안전성, 멀티스레드 안정성, 엔티티의 값 타입



## string 클래스 기본 

### string 메서드
- length() : 문자열의 길이를 반환한다.
- charAt(int index) : 특정 인덱스의 문자를 반환한다.
- substring(int beginIndex, int endIndex) : 문자열의 부분 문자열을 반환한다. 
- indexOf(String str) : 특정 문자열이 시작되는 인덱스를 반환한다. 
- toLowerCase() , toUpperCase() : 문자열을 소문자 또는 대문자로 변환한다.
- trim() : 문자열 양 끝의 공백을 제거한다. 
- concat(String str) : 문자열을 더한다.

> String은 클래스, 즉 기본형이 아니라 참조형
> String은 항상 equals로 비교해야한다.
```
String a="hello";
        String b="hello";

        System.out.println(a==b);
        System.out.println(a.equals(b));

        a=new String("hello");
        b=new String("hello");

        System.out.println(a==b);
        System.out.println(a.equals(b));
```
> 결과
```
true
true
false
true
```

- 자바는 문자열 리터럴, 문자열 풀 사용 
- 실행시점에 리터럴 문자열 있으면 문자열 풀에 만들어놓음

> String은 불변 객체, 따라서 생성 이후에는 절대 내부 문자열 값 변경 불가
> 변경이 필요한 경우 새로운 결과 만들어서 변환한다.
```
String str1="hello";
        str1.concat(" Java");
        System.out.println(str1);
String은 불변캑체이므로 새로운 String인스턴스를 생성한다. str1로 다시 받지 않으먄 이어붙인 값은 걍 버린게 된다.
>수정
String str1="hello";
        str1=str1.concat(" Java");
        System.out.println(str1);

```
- 문자열 풀(효율성-모든 같은 문자열은 중복이 없다)에 있는 스트링 인스턴스 값이 중간에 변경되면 같은 문자열을 참고하던 다른 변수 값도 함께 변경된다
- 하지만, 스트링은 불변 객체를 사용하기 때문에 이런 사이드이펙트 문제가 터지지 않는다. 값 변경 시 새 객체 만들어서 리턴 즉 참조하는 주소값 자체가 변경되게 됨


### 스트링 클래스 주요 메서드는 그냥 그때그때 찾아보기
```
String[] strings=str.split(",");

        for (String string : strings) {
            System.out.println(string);
            
        }
 

        System.out.println(String.join("-",strings));


int num=100;
        boolean bool=true;
        Object o=new Object();
        String str="Hello, Java!";

        //모두 스트링 타입으로 바꾸어줌
        String numString=String.valueOf(num);
        String boolString=String.valueOf(bool);
        String objectString=String.valueOf(o);
        System.out.println(numString+boolString+objectString);

        //문자+x ==문자
        String numString2=""+num;
        System.out.println(numString2);

        // toCharArr 메서드
        char[] strCharArr=str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 가능!");
        for (char c : strCharArr) {
            System.out.print(c);
        }

        // format method
        String format=String.format("%d, %b, %s",num,bool,str);
        System.out.println(format);

        String format2=String.format("숫자: %.2f", 10.31334);
        System.out.println(format2);

        //reg expression
        String regex="Hello, (World|Java)!";
        System.out.println("pattern exists? "+str.matches(regex));
```

### 스트링 빌더 - 가변 클래스
- 불변 스트링 클래스의 단점: 스트링 변환때마다 객체  생성하고 GC대상이 됨
=> StringBuilder의 도입
```
StringBuilder sb=new StringBuilder();
        // String과의 차이점: 메서드 사용후 재할당 안해도 변환이 유지된다!
        // 이유: StringBuilder는 가변객체이기떄문(메모리사용줄이고 성능향상)-사이드이펙트주의
        // 스트링 바꿔야할때 많을떄 이거 쓰다가 마지막에 스트링으로 바꿔주면 더 효율적이다
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb= "+sb);

        sb.insert(4,"Java");
        System.out.println("sb= "+sb);

        sb.delete(4,8);
        System.out.println("delete="+sb);

        //reverse
        sb.reverse();
        System.out.println("sb= "+sb); //sb= DCBA

        // to String
        String string=sb.toString();
        System.out.println(string);

```

- 어차피 + 연산 등 할때 자바 내부에서 StringBulider사용해서 최적화해줌
- 웬만하면 +연산 하자 (다만 루프 내에서 문자열을 더하는 경우 최적화 불가)
- StringBuilder사용이 더 좋은경우:
- 1)반복문에서 문자열 더할 떄
- 2) 조건문 통해 문지열 조합
- 3) 복잡한 문자열의 특정부분 변경 
- 4) 매우 긴 대용량 문자열

- StringBuilder와 같은 기능 수행하는 StringBuffer 클래스
- =>멀티스레드 환경에서는 StringBuffer사용 그 외는 빌더

### 메서드 체이닝
```
public ValueAdder add(int addVal){
        value+=addVal;
        return this;
    }

ValueAdder adder = new ValueAdder();
        int result=adder.add(1).add(2).add(3).getValue();
        System.out.println("result "+result);
```
.으로 연결해서 계속 연산하니, 코드 더 편하게 짤 수 있다.

StringBuilder는 메서드 체이닝 기법을 사용한다.

 ex) sb.append("A").append("B").append("C").append("D").insert(4,"Java").delete(4,8).reverse();


-  <문제: 해당 단어가 문장에 몇번 등장하는가>
```
String str2="hello java hello world hello peaple";
        String key="hello";
        int cnt=0;
        int idx=str2.indexOf(key);
        while(idx>=0){
            cnt+=1;
            idx=str2.indexOf(key,idx+1);
        }
        System.out.println("cnt: "+cnt);

```



