package Player.Characters.Support;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Lifeline extends Character implements IAbility {
    public Lifeline(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);

    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.LIFELINE.getCharName();
    }
    public String getUlt() {
        return Legend.LIFELINE.getUlt();
    }
    public String getTactical() {
        return Legend.LIFELINE.getTactical();
    }
    public String getPassive(){
        return Legend.LIFELINE.getPassive();
    }
}
