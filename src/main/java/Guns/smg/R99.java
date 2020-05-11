package Guns.smg;

import Guns.Weapon;
import Guns.gunType.LightGun;

public class R99 extends Weapon {
    private LightGun R99;
    public R99(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = LightGun.R99.getGunName();
        magSize = LightGun.R99.getMagSize();
        reloadSpeed = LightGun.R99.getReloadSpeed();
        fireRate = LightGun.R99.getFireRate();
        bulletDamage = LightGun.R99.getBulletDamage();
    }
}
