package flyweight;

import java.util.Random;

public class CounterStrike {
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "AWP", "Knife", "Desert Eagle"};


    public static void main(String args[]) {
        for (int i = 0; i < 4; i++) {
            Player player = PlayerFactory.getPlayer(getRandomPlayerType());

            player.assignWeapon(getRandomWeapon());

            player.mission();
        }
    }

    public static String getRandomPlayerType() {
        Random random = new Random();
        int randInt = random.nextInt(playerType.length);
        return playerType[randInt];
    }

    public static String getRandomWeapon() {
        Random random = new Random();
        int randInt = random.nextInt(weapons.length);
        return weapons[randInt];
    }
}


