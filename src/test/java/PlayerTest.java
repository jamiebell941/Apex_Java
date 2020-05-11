import Guns.assaultRifles.R301;
import Guns.gunType.LightGun;
import Guns.smg.R99;
import Player.Characters.Legend;
import Player.Characters.Recon.Pathfinder;
import Player.Player;
import Guns.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Pathfinder player1;
    private R301 gun1;
    private R99 gun2;
    private ArrayList<Weapon> equippedGuns;

    @Before
    public void before(){
        gun1 = new R301(LightGun.R_301.getGunName(), LightGun.R_301.getMagSize(),LightGun.R_301.getReloadSpeed(), LightGun.R_301.getFireRate(), LightGun.R_301.getBulletDamage());
        gun2 = new R99(LightGun.R99.getGunName(), LightGun.R99.getMagSize(),LightGun.R99.getReloadSpeed(), LightGun.R99.getFireRate(), LightGun.R99.getBulletDamage());
        player1 = new Pathfinder("Shroud", 100, new ArrayList<Weapon>(), Legend.PATHFINDER );
    }
//    @Test
//    public void canEquipGun(){
//        assertEquals(0, equippedGuns.size());
//        player1.equipGun(gun1);
//        assertEquals(1, equippedGuns.size());
//    }
}
