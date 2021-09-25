package jdk1_object_tostring;

//Object class -> 모든 클래스의 최상위 클래스
//java.lang.* 자동으로 import됨
//String, Integer, System... 등의 클래스들이 속한 패키지
//java.lang.Object 클래스
//Object 클래스의 메서드 중, 일부는 재정의하여 사용가능

class Book{

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    //객체의 정보를 String으로 바꾸어서 사용할 때 쓰임
    //String이나 Integer 클래스는 이미 재정의 되어 있음
    public String toString() {
        return title + "," + author;
    }
}

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만 헤세");

        System.out.println(book);
        //==System.out.println(book.toString());
    }
}
