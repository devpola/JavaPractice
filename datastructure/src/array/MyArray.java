package array;

//Array : 선형 자료구조(인접한 데이터간의 관계가 1:1인 자료구조) 중 하나로,
//-동일한 데이터 타입을 순서에 따라 관리하는 자료구조
//-정해진 크기가 있음
//-자료의 논리적 위치와 물리적 위치가 동일
//-> 요소의 추가 및 제거 시 다른 요소들의 이동이 필요

public class MyArray {

    int[] intArr;   //int array
    int count;      //개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -99999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    public void addElement(int num) {
        if(count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num) {
        int i;

        if(count >= ARRAY_SIZE) {   //꽉 찬 경우
            System.out.println("not enough memory");
            return;
        }

        if(position < 0 || position > count) {  //position index error
            System.out.println("insert Error");
            return;
        }

        for(i = count-1; i >= position; i--) {  //하나씩 뒤로 이동
            intArr[i+1] = intArr[i];
        }

        intArr[position] = num;
        count++;
    }

    public int removeElement(int position) {
        int i;
        int ret = ERROR_NUM;

        if(isEmpty()) { //비어있을 경우
            System.out.println("There is no element");
            return ret;
        }

        if(position < 0 || position >= count) {  //position index error
            System.out.println("remove error");
            return ret;
        }

        ret = intArr[position];

        for(i = position; i < count-1; i++) {
            intArr[i] = intArr[i+1];
        }

        count--;
        return ret;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        if(count == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getElement(int position) {
        if(position < 0 || position > count-1) {  //position index error
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count + "개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll() {
        int i;

        if(count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for(i = 0; i<count; i++) {
            System.out.println(intArr[i]);
        }
    }

    public void removeAll() {
        int i;

        for(i = 0; i < count; i++) {
            intArr[i] = 0;
        }
        count = 0;
    }
}
