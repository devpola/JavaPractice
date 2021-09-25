package gamelevel;

public class Player {

    PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play() {
        if (level instanceof BeginnerLevel) {
            level.go(1);
        }
        else if (level instanceof AdvancedLevel) {
            level.go(2);
        }
        else if (level instanceof SuperLevel) {
            level.go(3);
        }
        else {
            System.out.println("level error");
        }
    }
}
