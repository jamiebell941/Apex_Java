package Player.Characters.Recon;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Pathfinder extends Character implements IAbility {
    public Pathfinder(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);
        playerName = this.getPlayerName();
        hitPoints = 100;
        equippedGuns = new ArrayList<Weapon>(0);
        legend = Legend.PATHFINDER;
    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.PATHFINDER.getCharName();
    }
    public String getUlt() {
        return Legend.PATHFINDER.getUlt();
    }
    public String getTactical() {
        return Legend.PATHFINDER.getTactical();
    }
    public String getPassive(){
        return Legend.PATHFINDER.getPassive();
    }



}
