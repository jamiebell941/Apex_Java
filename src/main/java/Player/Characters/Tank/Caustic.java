package Player.Characters.Tank;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Caustic extends Character implements IAbility {
    public Caustic(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.CAUSTIC.getCharName();
    }
    public String getUlt() {
        return Legend.CAUSTIC.getUlt();
    }
    public String getTactical() {
        return Legend.CAUSTIC.getTactical();
    }
    public String getPassive(){
        return Legend.CAUSTIC.getPassive();
    }
}
