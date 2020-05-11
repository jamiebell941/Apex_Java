package Guns.pistols;

import Guns.Weapon;
import Guns.gunType.HeavyGun;

public class Wingman extends Weapon {
    private HeavyGun Wingman;
    public Wingman(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = HeavyGun.WINGMAN.getGunName();
        magSize = HeavyGun.WINGMAN.getMagSize();
        reloadSpeed = HeavyGun.WINGMAN.getReloadSpeed();
        fireRate = HeavyGun.WINGMAN.getFireRate();
        bulletDamage = HeavyGun.WINGMAN.getBulletDamage();
    }
}
