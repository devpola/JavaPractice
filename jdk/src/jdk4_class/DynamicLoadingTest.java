package jdk4_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicLoadingTest {

    public static void main(String[] args) throws ClassNotFoundException {
        //자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨.
        //Class 클래스는 컴파일된 class 파일을 로드하여 객체를 "동적로드"하고, 정보를 가져오는 메서드 제공
        //Class.forName("클래스 이름") 메서드로 클래스를 동적 로드

        //동적 로딩 : 컴파일 시에 데이터 타입이 binding 되는 것이 아닌
        //실행(runtime) 중에 데이터 타입을 binding하는 방법
        //프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에는 원하는 클래스를 로딩하여 binding 할 수 있다는 장점
        //But, 컴파일 시에 타입이 정해지지 않으므로 동적 로딩 시, 오류가 발생하면 프로그램의 심각한 장애 발생 가능

        Class c = Class.forName("java.lang.String");

        Constructor[] cons = c.getConstructors();
        for(Constructor co : cons) {
            System.out.println(co);
        }

        Method[] m = c.getMethods();
        for(Method mth : m) {
            System.out.println(mth);
        }
    }
}
