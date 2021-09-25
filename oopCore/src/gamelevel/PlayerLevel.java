package gamelevel;

public interface PlayerLevel {

    void run();
    void jump();
    void turn();
    void showLevelMessage();

    default void go(int count) {
        run();
        for(int i=0; i<count; i++) {
            jump();
        }
        turn();
    }
}
