package oop11_arraylist;

import oop10_objectarray.Book;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));

        for(int i=0; i<library.size(); i++) {
            library.get(i).showBookInfo();
        }
    }

    //Array vs. ArrayList
    //크기 : 초기화 시점에서 고정 vs. 사이즈가 동적 (default capacity : 10)
    //***ArrayList는 내부적으로 Array로 구현되어있지만, capacity와 배열의 길이가 같아지면 자동적으로 기존 capacity의 1.5배 크기를 가진 배열을 생성하고 기존의 배열을 copy한다. (copyOf 메서드 사용)
    //속도 : ArrayList의 자동 resize는 성능을 낮춘다. (But, 요소를 얻거나 추가하는 작업은 거의 비슷한 성을 보임)
    //다차원 : 가능 vs. 불가능
    //타입 : primitive type(int,byte, char etc), object vs. object elemnet만 가능
    //제네릭 : 사용 불가능 vs. 사용 가능(타입 안전성 보장)
    //길이 : length vs. size() 메서드
    //변수 추가 : assignment 연산자(=) vs. add() 메서드 사용
}
