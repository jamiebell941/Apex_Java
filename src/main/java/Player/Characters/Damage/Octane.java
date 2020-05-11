package Player.Characters.Damage;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Octane extends Character implements IAbility {
    public Octane(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.OCTANE.getCharName();
    }
    public String getUlt() {
        return Legend.OCTANE.getUlt();
    }
    public String getTactical() {
        return Legend.OCTANE.getTactical();
    }
    public String getPassive(){
        return Legend.OCTANE.getPassive();
    }
}
