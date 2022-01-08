package flyweight;
import java.util.HashMap;

/*
Classe para retornar o jogador (Player)
Se já existe retorna uma referência do objeto que já existe
Caso contrário cria uma
*/

class PlayerFactory {
    /* HashMap para armazenar instâncias de player (nesse caso CT ou TR) */
    private static HashMap <String, Player> hm = new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player player = null;
  
        /* Se um TR ou CT já foi criado somente retorna sua referência*/
        if (hm.containsKey(type)) {
            player = hm.get(type);
        } else {
            /* Cria Terrorista ou Contra Terrorista  */
            switch(type) {

            case "Terrorist":
                System.out.println("\nT Created");
                player = new Terrorist();
                break;

            case "CounterTerrorist":
                System.out.println("\nCT Created");
                player = new CounterTerrorist();
                break;

            default:
                System.out.println("Not defined");
            }
  
            // Add no HashMap depois de criado
            hm.put(type, player);
        }

        return player;
    }
}
