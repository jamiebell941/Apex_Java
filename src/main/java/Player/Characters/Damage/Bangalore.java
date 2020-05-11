package Player.Characters.Damage;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Bangalore extends Character implements IAbility {
    public Bangalore(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.BANGALORE.getCharName();
    }
    public String getUlt() {
        return Legend.BANGALORE.getUlt();
    }
    public String getTactical() {
        return Legend.BANGALORE.getTactical();
    }
    public String getPassive(){
        return Legend.BANGALORE.getPassive();
    }
}
