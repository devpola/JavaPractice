package oop10_objectarray;

public class ShallowCopy {

    public static void main(String[] args) {

        Book[] library = new Book[3];
        Book[] copyLibrary = new Book[3];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 3);
        //System.arraycopy vs. Arrays.copyOf
        //copyOf 메서드는 단순히 arraycopy를 래핑한 메서드.
        //주요 차이점은 arraycopy는 이미 존재하는 array에 특정 array를 복사하는 것인데,
        //copyOf는 "새로운 array를 생성"하고 특정 array를 복사하는 것

//        public static int[] copyOf(int[] original, int newLength) {
//            int[] copy = new int[newLength];
//            System.arraycopy(original, 0, copy, 0, Math.min(original.length, newLength));
//            return copy;
//        }

        System.out.println("==========copy library============");
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("==========library============");
        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("==========copy library============");
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }
    }
}
