package Player.Characters.Damage;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Revenant extends Character implements IAbility {
    public Revenant(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.REVENANT.getCharName();
    }
    public String getUlt() {
        return Legend.REVENANT.getUlt();
    }
    public String getTactical() {
        return Legend.REVENANT.getTactical();
    }
    public String getPassive(){
        return Legend.REVENANT.getPassive();
    }
}
