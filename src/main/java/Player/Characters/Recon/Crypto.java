package Player.Characters.Recon;

import Behaviours.IAbility;
import Guns.Weapon;
import Player.Characters.Character;
import Player.Characters.Legend;

import java.util.ArrayList;

public class Crypto extends Character implements IAbility {
    public Crypto(String playerName, int hitPoints, ArrayList<Weapon> equippedGuns, Legend legend) {
        super(playerName, hitPoints, equippedGuns, legend);

    }
    public void useAbility(){

    };

    public String getName() {
        return Legend.CRYPTO.getCharName();
    }
    public String getUlt() {
        return Legend.CRYPTO.getUlt();
    }
    public String getTactical() {
        return Legend.CRYPTO.getTactical();
    }
    public String getPassive(){
        return Legend.CRYPTO.getPassive();
    }
}
