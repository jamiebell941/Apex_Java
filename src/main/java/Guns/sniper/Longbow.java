package Guns.sniper;

import Guns.Weapon;
import Guns.gunType.SniperGun;

public class Longbow extends Weapon {
    public Longbow(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = SniperGun.LONGBOW.getGunName();
        magSize = SniperGun.LONGBOW.getMagSize();
        reloadSpeed = SniperGun.LONGBOW.getReloadSpeed();
        fireRate = SniperGun.LONGBOW.getFireRate();
        bulletDamage = SniperGun.LONGBOW.getBulletDamage();
    }
}
