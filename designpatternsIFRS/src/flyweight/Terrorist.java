package flyweight;

/*
 * classe que representa Terrorist, implementa a interface Player
 */
class Terrorist implements Player
{
    // Intrínseco
    private final String TASK;
  
    // Extrínseco
    private String weapon;
  
    public Terrorist() {
        TASK = "PLANT THE BOMB";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("\nTerrorist | Weapon " + weapon + " | " + TASK);
    }
}
