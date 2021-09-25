package oopcore4_abstract;

public class ComputerTest {

    public static void main(String[] args) {

        Computer desktop = new Desktop();
        desktop.display();
        desktop.turnOff();

        NoteBook myNote = new MyNoteBook();
    }
}
