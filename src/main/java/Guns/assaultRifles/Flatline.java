package Guns.assaultRifles;

import Guns.Weapon;
import Guns.gunType.HeavyGun;

public class Flatline extends Weapon {
    public Flatline(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = HeavyGun.FLATLINE.getGunName();
        magSize = HeavyGun.FLATLINE.getMagSize();
        reloadSpeed = HeavyGun.FLATLINE.getReloadSpeed();
        fireRate = HeavyGun.FLATLINE.getFireRate();
        bulletDamage = HeavyGun.FLATLINE.getBulletDamage();
    }
}
