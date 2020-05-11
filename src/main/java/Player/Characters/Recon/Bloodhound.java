package Player.Characters.Recon;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Bloodhound extends Character implements IAbility {
    public Bloodhound(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.BLOODHOUND.getCharName();
    }
    public String getUlt() {
        return Legend.BLOODHOUND.getUlt();
    }
    public String getTactical() {
        return Legend.BLOODHOUND.getTactical();
    }
    public String getPassive(){
        return Legend.BLOODHOUND.getPassive();
    }
}
