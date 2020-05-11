package Guns.smg;

import Guns.Weapon;
import Guns.gunType.LightGun;

public class Alternator extends Weapon {
    public Alternator(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = LightGun.ALTERNATOR.getGunName();
        magSize = LightGun.ALTERNATOR.getMagSize();
        reloadSpeed = LightGun.ALTERNATOR.getReloadSpeed();
        fireRate = LightGun.ALTERNATOR.getFireRate();
        bulletDamage = LightGun.ALTERNATOR.getBulletDamage();
    }
}
