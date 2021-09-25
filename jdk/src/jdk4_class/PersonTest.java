package jdk4_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //reflection 프로그래밍
        // Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드) 등을 알고
        // 인스턴스를 생성하고, 메서드를 호출하는 방식의 프로그래밍
        // 로컬 메모리에 객체가 없는 경우, 원격 프로그래밍, 객체의 타입을 알 수 없는 경우에 사용
        // java.lang.reflect 패키지에 있는 클래스를 활용하여 프로그래밍
        // 일반적으로 자료형을 알고 있는 경우엔 사용하지 않음

        Class c1 = Class.forName("jdk4_class.Person");

        //Person lee = new Person();
        //lee.setName("Lee"); 와 아래의 소스가 같은 역할
        //deprecated 메서드이기 때문에 아래와 같이 금이 그어져있다.
        Person person = (Person)c1.newInstance();

        person.setName("Lee");
        System.out.println(person);

        //Person kim = new Person("Kim"); 와 아래의 소스들이 같은 역할
        //local에 Person이라는 클래스가 없는 경우 사용할 수 있음

        Class c2 = person.getClass();   //생성된 인스턴스에서 Class 클래스 가져오기
        Person p = (Person)c2.newInstance();
        System.out.println(p);

        //String 타입의 매개변수를 가지는 생성자를 얻음
        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person kim = (Person)cons.newInstance(initargs);
        System.out.println(kim);
    }
}
