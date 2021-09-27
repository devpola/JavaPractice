package Review;

public class MyArray {

    private int count;
    private int[] intArr;

    public static final int ERROR_NUM = -9999999;
    public int ARRAY_SIZE;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        System.out.println("super class");
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    public int addElement(int data) {
        if(count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return ERROR_NUM;
        }
        intArr[count++] = data;
        return data;
    }

    public int insertElement(int position, int data) {
        if(count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return ERROR_NUM;
        }

        if(position < 0 || position > count) {
            System.out.println("position error");
            return ERROR_NUM;
        }
        else {
            for(int i = count-1; i >= position; i--) {
                intArr[i+1] = intArr[i];
            }
        }
        intArr[position] = data;
        count++;
        return data;
    }

    public int removeElement(int position) {
        int ret = ERROR_NUM;

        if(isEmpty()) {
            System.out.println("There is not element");
            return ret;
        }

        if(position < 0 || position >= count) {
            System.out.println("position error");
            return ret;
        }
        else {
            ret = intArr[position];
            for(int i = position; i < count-1; i++) {
                intArr[i] = intArr[i+1];
            }
        }
        count--;
        return ret;
    }

    public int getElement(int position) {
        if(position < 0 || position >= count) {
            System.out.println("position error");
            return ERROR_NUM;
        }
        return intArr[position];
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

    public boolean isFull() {
        if(count == ARRAY_SIZE) {
            return true;
        }
        else {
            return false;
        }
    }

    public void printAll() {
        if(isEmpty()) {
            System.out.println("출력할 요소가 없습니다.");
            return;
        }
        for(int i = 0; i < count; i++) {
            System.out.println(intArr[i]);
        }
    }

    public void removeAll() {
        for(int i = 0; i < count; i++) {
            intArr[i] = 0;
        }
        count = 0;
    }
}
