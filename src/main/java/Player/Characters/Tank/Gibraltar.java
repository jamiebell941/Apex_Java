package Player.Characters.Tank;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Gibraltar extends Character implements IAbility {
    public Gibraltar(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.GIBRALTAR.getCharName();
    }
    public String getUlt() {
        return Legend.GIBRALTAR.getUlt();
    }
    public String getTactical() {
        return Legend.GIBRALTAR.getTactical();
    }
    public String getPassive(){
        return Legend.GIBRALTAR.getPassive();
    }
}
