package Guns.sniper;

import Guns.Weapon;
import Guns.gunType.SniperGun;

public class TripleTake extends Weapon {
    public TripleTake(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = SniperGun.TRIPLETAKE.getGunName();
        magSize = SniperGun.TRIPLETAKE.getMagSize();
        reloadSpeed = SniperGun.TRIPLETAKE.getReloadSpeed();
        fireRate = SniperGun.TRIPLETAKE.getFireRate();
        bulletDamage = SniperGun.TRIPLETAKE.getBulletDamage();
    }
}
