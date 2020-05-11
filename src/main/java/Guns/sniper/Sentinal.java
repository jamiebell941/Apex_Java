package Guns.sniper;

import Guns.Weapon;
import Guns.gunType.SniperGun;

public class Sentinal extends Weapon {
    public Sentinal(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = SniperGun.SENTINAL.getGunName();
        magSize = SniperGun.SENTINAL.getMagSize();
        reloadSpeed = SniperGun.SENTINAL.getReloadSpeed();
        fireRate = SniperGun.SENTINAL.getFireRate();
        bulletDamage = SniperGun.SENTINAL.getBulletDamage();
    }
}
