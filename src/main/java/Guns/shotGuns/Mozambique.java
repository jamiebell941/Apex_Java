package Guns.shotGuns;

import Guns.Weapon;
import Guns.gunType.ShotGun;

public class Mozambique extends Weapon {
    public Mozambique(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage, int numBullets) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = ShotGun.MOZAMBIQUE.getGunName();
        magSize = ShotGun.MOZAMBIQUE.getMagSize();
        reloadSpeed = ShotGun.MOZAMBIQUE.getReloadSpeed();
        fireRate = ShotGun.MOZAMBIQUE.getFireRate();
        bulletDamage = ShotGun.MOZAMBIQUE.getBulletDamage();
        numBullets = ShotGun.MOZAMBIQUE.getBulletNum();

    }
}
