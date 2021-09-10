package oop10_objectarray;

public class DeepCopy {

    public static void main(String[] args) {

        Book[] library = new Book[3];
        Book[] copyLibrary = new Book[3];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");

        for(int i=0; i<3; i++) {
            copyLibrary[i] = new Book();
        }

        for(int i=0; i< library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
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
