package Player.Characters.Damage;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Wraith extends Character implements IAbility {
    public Wraith(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
    }

    public void useAbility(){

    };

    public String getName() {
        return Legend.WRAITH.getCharName();
    }
    public String getUlt() {
        return Legend.WRAITH.getUlt();
    }
    public String getTactical() {
        return Legend.WRAITH.getTactical();
    }
    public String getPassive(){
        return Legend.WRAITH.getPassive();
    }
}
