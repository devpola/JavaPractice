package gamelevel;

public class PlayerTest {

    public static void main(String[] args) {

        PlayerLevel beginnerLevel = new BeginnerLevel();
        PlayerLevel advancedLevel = new AdvancedLevel();
        PlayerLevel superLevel = new SuperLevel();

        Player player = new Player();
        player.upgradeLevel(beginnerLevel);
        player.play();

        player.upgradeLevel(advancedLevel);
        player.play();

        player.upgradeLevel(superLevel);
        player.play();
    }
}
