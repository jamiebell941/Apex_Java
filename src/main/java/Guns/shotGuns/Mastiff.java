package Guns.shotGuns;

import Guns.Weapon;
import Guns.gunType.ShotGun;

public class Mastiff extends Weapon {
    public Mastiff(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage,int numBullets) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = ShotGun.MASTIFF.getGunName();
        magSize = ShotGun.MASTIFF.getMagSize();
        reloadSpeed = ShotGun. MASTIFF.getReloadSpeed();
        fireRate = ShotGun.MASTIFF.getFireRate();
        bulletDamage = ShotGun.MASTIFF.getBulletDamage();
        numBullets = ShotGun.MASTIFF.getBulletNum();
    }
}
