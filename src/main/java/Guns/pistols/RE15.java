package Guns.pistols;

import Guns.Weapon;
import Guns.gunType.EnergyGun;
import Guns.gunType.LightGun;

public class RE15 extends Weapon {
    public RE15(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = LightGun.RE_15.getGunName();
        magSize = LightGun.RE_15.getMagSize();
        reloadSpeed = LightGun.RE_15.getReloadSpeed();
        fireRate = LightGun.RE_15.getFireRate();
        bulletDamage = LightGun.RE_15.getBulletDamage();
    }
}
