package flyweight;

class CounterTerrorist implements Player {
    // Intrínseco
    private final String TASK;
  
    // Extrínseco
    private String weapon;
  
    public CounterTerrorist() {
        TASK = "DEFUSE THE BOMB";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("\nCounter Terrorist | Weapon " + weapon + " | " + TASK);
    }
}
