package Player.Characters.Damage;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Mirage extends Character implements IAbility {
    public Mirage(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.MIRAGE.getCharName();
    }
    public String getUlt() {
        return Legend.MIRAGE.getUlt();
    }
    public String getTactical() {
        return Legend.MIRAGE.getTactical();
    }
    public String getPassive(){
        return Legend.MIRAGE.getPassive();
    }
}
