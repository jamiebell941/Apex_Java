import Guns.Weapon;
import Guns.assaultRifles.R301;
import Guns.gunType.LightGun;
import Player.Characters.Legend;
import Player.Characters.Recon.Pathfinder;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class R301Test {

    R301 R301Test;
    Pathfinder player1;

    @Before
    public void before() {
        player1 = new Pathfinder("Jambel", 100, new ArrayList<Weapon>(0), Legend.PATHFINDER);

        R301Test = new R301(LightGun.R_301.getGunName(), LightGun.R_301.getMagSize(),LightGun.R_301.getReloadSpeed(), LightGun.R_301.getFireRate(), LightGun.R_301.getBulletDamage());
    }

    @Test
    public void hasGunName(){
        assertEquals("R-301", this.R301Test.getGunName());
    }

    @Test
    public void hasMagSize(){
        assertEquals(18, this.R301Test.getMagSize());
    }

    @Test
    public void hasReloadSpeed(){
        assertEquals(2.40, this.R301Test.getReloadSpeed(), 0.01);
    }

    @Test
    public void hasFireRate(){
        assertEquals(13, this.R301Test.getFireRate(), 0.01);
    }

    @Test
    public void hasBulletDamage(){
        assertEquals(14, this.R301Test.getBulletDamage());
    }

    @Test
    public void canShoot(){
        assertEquals(18, R301Test.getMagSize());
        R301Test.shoot(player1);
        assertEquals(17, R301Test.getMagSize());
        assertEquals(86, player1.getHitPoints());

    }
    @Test
    public void canReload(){
        R301Test.setMagSize(0);
        assertEquals(0, R301Test.getMagSize());
        R301Test.reload();
        assertEquals(18, R301Test.getMagSize());
    }
}
