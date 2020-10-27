package com.parkgaram.dp.prototype.deepshallow;



// 복사할 클래스
public class Cat implements Cloneable {
    private String name;
    private Age age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

//    deep copy
    public Cat copy() throws CloneNotSupportedException {
//      이렇게 복사하면 Cat 객체는 값 복사 이루어지지만, Cat 객체가 참조한느  Age 객체에 대해서는 주소 복사가 된다...! (당연한 일..)
//        Cat 객체는 age 객체에 대한 주소값 참조만 가지고 있기 때문에 cat을 copy 하더라도 age 객체의 참조값 공간과 참조값이 deep copy 되는 것
        Cat ret = (Cat) this.clone();

//      따라서 Age 객체에 대한 value copy를 명시적으로 해주어야 함~
//      새로운 객체를 생성하여 cat 객체에 새로운 객체 참조를 넣어준다. (값은 같아도 주소는 달라진다)
        ret.setAge(new Age(this.age.getYear(), this.age.getValue()));


        return ret;
    }
}
