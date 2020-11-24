# JAVA DESIGN PATTERN

##### 1. Strategy Pattern
- 여러 알고리즘을 `하나의 추상적인 접근점`을 만들어 접근점에서 서로 교환 가능하도록 하는 패턴
- 인터페이스 : 기능에 대한 선언과 구현을 분리. 기능을 사용하는 _통로_

##### 2. Adapter Pattern
- 한 클래스의 인터페이스를 클라이언트에서 사용하고자하는 다른 인터페이스로 변환한다.
- 어댑터를 이용하면 인터페이스 호환성 문제 때문에 *같이 쓸 수 없는 클래스*들을 연결해서 쓸 수 있다.
    
##### 3. Template Method Pattern 
- 알고리즘의 **구조를 메소드에 정의**하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 **재정의**하는 패턴
- 구현하려는 알고리즘이 **일정한 프로세스**를 가지고, **변경 가능성**이 큰 알고리즘일 때
- 알고리즘 여러 단계로 분해 -> 나눠진 알고리즘의 단계를 메소드로 선언 -> 알고리즘 수행할 템플릿 메소드 생성 -> 하위 클래스에서 나눠진 메소드들 구현

##### 4. Factory Method Pattern
- `template method pattern`이 사용된다.
- **구조와 구현의 분리**가 이루어진다. (framework)

##### 5.  Singleton Pattern
- 객체 : 속성과 기능을 갖춘 것
- 클래스 : 속성과 기능을 정의한 것 
- 인스턴스 : 속성과 기능을 가진 것 중 실제하는 것 
- 생성자를 private 으로 지정하여 생성 못하게 막음
- getInstance, static, spring framework 등 이용하여 singleton 객체 생성 

##### 6. Prototype Pattern 
- 생산 비용이 높은 인스턴스를 복사하여 쉽게 생성할 수 있도록 하는 패턴 
- 생산 비용이 높은 경우 
    - 종류가 많아서 클래스로 정리되지 않는 경우
    - 클래스로부터 인스턴스 생성이 어려운 경우 
- clone method을 사용할 수 있음
- 복사
    - Deep Copy : 주소값이 아닌 실제 값 복사 (clone) 
        - 자바의 기본 자료형 + String : copy 했을 때 자동 깊은 복사 
        - 참조 자료형 : copy할 때 명시적으로 깊은 복사 해주어야 함 ( DeepShallow package 참) 
    - Shallow Copy : 주소값 참조 복사 
    
##### 7. Builder Pattern 
- 복잡한 단계가 있는 인스턴스 생성 과정 단순화 
1. 코드로 설명한 builder pattern : 객체를 대신 생성해주는 builder, builderDirector  이용
2. lombok에서 사용하는 builder pattern : 메소드 체이닝 등 
등

##### 8. Abstract Factory Pattern 
- 서로 관련이 있는 객체들을 통째로 묶어서 팩토리 클래스로 만들고, 이들 팩토리를 조건에 따라 생성하도록 다시 팩토리를 만들어서 객체를 생성하는 패턴
- 추상 팩토리 패턴은 팩토리 메서드 패턴을 좀 더 캡슐화한 방식이라고 볼 수 있음

##### 9. Brige Pattern
- 기능 부분과 구현 부분 분리 
- 구현부에서 추상층을 분리하여 각자 독립적으로 변형, 확장 가능. 즉 기능과 구현이 두 개를 별도의 클래스로 존

##### 10. Composite Pattern
- 트리 구조 
- 파일 시스템에서 많이 사용 

##### 11. Decorator Pattern
- 동적으로 책임을 추가 
- 탈부착 가능한 책임 정의할 때 사용
- Decorator 객체는 Component와 Concrete Decorator 동일시 해주는 역
- Decorator가 추가된 책임 가지고 있

##### 12. Visitor Pattern
- 객체에서 처리를 분리하여 사용
- 객체 외부 타 객에서 처리를 진행 

##### 13. Chain of Responsibility Pattern
- 다양한 처리 방식을 유연하게 처리
- Handler (abstract class) 상속 ChildHandler 구현







##### Object Oriented Programming
- OOP
    - 객체들이 서로 유기적으로 동작하는 프로그래밍 이론
    - 코드의 재사용성과 중복제거가 가장 큰 목적
- 추상화
    - 목적과 관련이 없는 부분을 제외해서 필요한 부분을 포착하는 기법
    - 객체의 공통된 속성들 중 필요한 부분을 포착해서 클래스로 정의하는 설계 기법
- 캡슐화
     - 외부에 노출할 필요가 없는 정보들은 은닉 (정보은닉)
- 상속
    - 상속 관계에 있는 두 클래스에 대해, 부모 클래스가 자손 클래스에게 속성을 물려주는 것
    - 코드의 재사용이 목적
- 다형성
    - 같은 형태이지만 다른 기능을 하는 것
    - 오버라이딩은 이와 관련된 기능임






 