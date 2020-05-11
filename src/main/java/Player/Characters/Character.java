package Player.Characters;

import Behaviours.IAbility;
import Player.Player;
import Guns.Weapon;

import java.util.ArrayList;

public abstract class Character extends Player implements IAbility {

  private Legend legend;

    public Character(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns);
        this.legend = legend;
    }


    public String getName() {
        return legend.getCharName();
    }
    public String getUlt() {
        return legend.getUlt();
    }
    public String getTactical() {
        return legend.getTactical();
    }
    public String getPassive(){
        return legend.getPassive();
    }



}
