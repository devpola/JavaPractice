package array;

public class MyObjectArray {

    private int count;
    private Object[] objectArr;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -99999999;

    public MyObjectArray() {
        count = 0;
        ARRAY_SIZE = 10;
        objectArr = new Object[ARRAY_SIZE];
    }

    public MyObjectArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        objectArr = new Object[ARRAY_SIZE];
    }

    public void addElement(Object object) {
        if(count >= ARRAY_SIZE) {   //꽉 찬 경우
            System.out.println("not enough memory");
            return;
        }

        objectArr[count++] = object;
    }

    public void insertElement(int position, Object object) {
        if(count >= ARRAY_SIZE) {   //꽉 찬 경우
            System.out.println("not enough memory");
            return;
        }

        if(position < 0 || position > count-1) {    //position index error
            System.out.println("insert position index error");
            return;
        }

        for(int i = count-1; i >= position; i--) {  //마지막 요소부터 하나씩 뒤로 이동
            objectArr[i+1] = objectArr[i];
        }

        objectArr[position] = object;
        count++;
    }

    public Object removeElement(int position) {
        Object ret = null;

        if(isEmpty()) {
            System.out.println("There is no element");
            return ret;
        }

        if(position < 0 || position >= count) { //position index error
            System.out.println("remove position index error");
            return ret;
        }

        ret = objectArr[position];

        for(int i = position; i < count; i++) {
            objectArr[i] = objectArr[i+1];
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

    public Object getElement(int position) {
        Object ret = null;
        if(position < 0 || position >= count) {
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count + "개 입니다.");
            return ret;
        }
        return objectArr[position];
    }

    public void printAll() {
        if(count == 0) {
            System.out.println("출력할 요소가 없습니다.");
            return;
        }

        for(int i = 0; i < count; i++) {
            System.out.println(objectArr[i]);
        }
    }

    public void removeAll() {
        for(int i = 0; i < count; i++) {
            objectArr[i] = null;
        }
        count = 0;
    }
}
