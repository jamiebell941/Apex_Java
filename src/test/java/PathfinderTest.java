import Guns.Weapon;
import Guns.assaultRifles.R301;
import Guns.gunType.LightGun;
import Guns.smg.R99;
import Player.Characters.Damage.Wraith;
import Player.Characters.Recon.Pathfinder;
import Player.Characters.Legend;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PathfinderTest {

    Pathfinder pathfinder;
    Wraith wraith;
    R301 gun1;
    R99 gun2;
    @Before
    public void before(){
        gun1 = new R301(LightGun.R_301.getGunName(), LightGun.R_301.getMagSize(),LightGun.R_301.getReloadSpeed(), LightGun.R_301.getFireRate(), LightGun.R_301.getBulletDamage());
        gun2 = new R99(LightGun.R99.getGunName(), LightGun.R99.getMagSize(),LightGun.R99.getReloadSpeed(), LightGun.R99.getFireRate(), LightGun.R99.getBulletDamage());
        pathfinder = new Pathfinder("Jambel", 100, new ArrayList<Weapon>(0), Legend.PATHFINDER);
        wraith = new Wraith("Doggy", 100, new ArrayList<Weapon>(0), Legend.WRAITH);
    }

    @Test
    public void hasCharName(){
        assertEquals("Path Finder", pathfinder.getName());
    }

    @Test
    public void hasTactical(){
        assertEquals("Grapple", pathfinder.getTactical());
    }

    @Test
    public void hasPassive(){
        assertEquals("Survey Beacon", pathfinder.getPassive());
    }

    @Test
    public void hasUlt(){
        assertEquals("Zipline", pathfinder.getUlt());
    }

    @Test
    public void hasHP(){
        assertEquals(100, pathfinder.getHitPoints());
    }

    @Test
    public void hasPlayerName(){
        assertEquals("Jambel", pathfinder.getPlayerName());
    }

    @Test
    public void canEquipGun(){
        pathfinder.equipGun(gun1);
        assertEquals(1, pathfinder.equippedGuns.size());
    }

    @Test
    public void canOnlyEquipTwoGun(){
        pathfinder.equipGun(gun1);
        pathfinder.equipGun(gun2);
        assertEquals(2, pathfinder.equippedGuns.size());
        pathfinder.equipGun(gun2);
        assertEquals(2, pathfinder.equippedGuns.size());
    }

    @Test
    public void canSwapGun(){
        pathfinder.equipGun(gun1);
        pathfinder.equipGun(gun1);
        assertEquals("R-301", pathfinder.equippedGuns.get(0).getGunName());
        pathfinder.equipGun(gun2);
        assertEquals("R-99", pathfinder.equippedGuns.get(0).getGunName());
    }

    @T




}
