package Guns.lmg;

import Guns.Weapon;

import Guns.gunType.HeavyGun;

public class Spitfire extends Weapon {
    public Spitfire(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = HeavyGun.SPITFIRE.getGunName();
        magSize = HeavyGun.SPITFIRE.getMagSize();
        reloadSpeed = HeavyGun.SPITFIRE.getReloadSpeed();
        fireRate = HeavyGun.SPITFIRE.getFireRate();
        bulletDamage = HeavyGun.SPITFIRE.getBulletDamage();
    }
}
