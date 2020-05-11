package Player.Characters.Support;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Wattson extends Character implements IAbility {
    public Wattson(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.WATSON.getCharName();
    }
    public String getUlt() {
        return Legend.WATSON.getUlt();
    }
    public String getTactical() {
        return Legend.WATSON.getTactical();
    }
    public String getPassive(){ return Legend.WATSON.getPassive();
    }
}
