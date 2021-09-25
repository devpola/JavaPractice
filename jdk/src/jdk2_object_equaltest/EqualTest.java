package jdk2_object_equaltest;

public class EqualTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");

        // == 연산자는 양쪽의 피 연산자들의 인스턴스의 저장 주소를 비교하여 true or false를 반환
        // 물리적인 주소 값을 비교하는 것
        System.out.println(std1 == std2);

        // Object class에 정의된 equals 메서드는 == 연산자와 같이 두 인스턴스의 주소 값을 비교
        // 이를 재정의 하여, 비교 대상인 인스턴스들의 논리적 동일함의 여부를 구현할 수 있음
        // ex) 같은 학번을 가진 서로 다른 student 인스턴스를 논리적으로 동일한 결과로 반환하도록 구현
        System.out.println(std1.equals(std2));

        //Objec class에 정의된 hashCode 메서드는 인스턴스의 저장 주소를 반환
        //힙 메모리에 인스턴스가 저장되는 방식이 hash 방식
        //두 인스턴스가 같다는 것은 두 인스턴스에 대한 equals의 반환 값이 true이며 동일한 hashCode 값을 반환하는 것
        //논리적 동일함의 여부를 구현하기 위해 equals를 재정의 했다면,
        //hashCode 메서드도 재정의 하여 동일한 hashCode 값이 반환되도록 하여야 함.
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        //hashCode 메서드를 재정의힌 클래스의 인스턴스에 대한 실제 주소 값을 얻기 위해서
        //아래와 같은 메서드 사용 가능
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        Student std3 = (Student)std1.clone();
        System.out.println(std1);
        System.out.println(std3);
        System.out.println(std1.equals(std3));

        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std3));
    }
}
