package Player;

import Guns.Weapon;

import java.util.ArrayList;

public abstract class Player {

    private String playerName;
    private int hitPoints;
    public ArrayList<Weapon> equippedGuns;

    public Player(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.equippedGuns = equippedGuns;
    }


    public String getPlayerName() {
        return playerName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public ArrayList<Weapon> getWeapons() {
        return equippedGuns;
    }

    public void equipGun(Weapon weapon){
        if (equippedGuns.size() < 2) {
            equippedGuns.add(weapon);
        }
        else if (equippedGuns.size() == 2){
            equippedGuns.remove(0);
            equippedGuns.add(0, weapon);
        }
    }


}
