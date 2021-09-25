package jdk3_string;

public class StringTest {

    public static void main(String[] args) {

        //힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 방법 비교
        //동일한 문자열이라도, 힙 메모리는 생성될 때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4);

        //java, android, 두 문자열을 붙여 java에 대입했을 때의 인스턴스
        //위 세 가지 인스턴스 모두 주소 값이 다르다.(다른 곳에 할당되는 서로 다른 인스턴스)
        //이런식으로 문자열을 연결하면, 계속해서 새로운 인스턴스가 생섣되기 때문에,
        //메모리 낭비가 발생할 가능성 => StringBuilder, StringBuffer class 사용
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(android);
        System.out.println(System.identityHashCode(java));
    }
}
