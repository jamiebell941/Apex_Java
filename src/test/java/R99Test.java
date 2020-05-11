import Guns.assaultRifles.R301;
import Guns.gunType.LightGun;
import Guns.smg.R99;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class R99Test {

    R99 r99Test;

    @Before
    public void before() {
        r99Test = new R99(LightGun.R99.getGunName(), LightGun.R99.getMagSize(),LightGun.R99.getReloadSpeed(), LightGun.R99.getFireRate(), LightGun.R99.getBulletDamage());
    }

    @Test
    public void hasGunName(){
        assertEquals("R-99", this.r99Test.getGunName());
    }

    @Test
    public void hasMagSize(){
        assertEquals(20, this.r99Test.getMagSize());
    }

    @Test
    public void hasReloadSpeed(){
        assertEquals(1.80, this.r99Test.getReloadSpeed(), 0.01);
    }

    @Test
    public void hasFireRate(){
        assertEquals(18, this.r99Test.getFireRate(), 0.01);
    }

    @Test
    public void hasBulletDamage(){
        assertEquals(11, this.r99Test.getBulletDamage());
    }
}


