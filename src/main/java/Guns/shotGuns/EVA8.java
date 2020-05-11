package Guns.shotGuns;

import Guns.Weapon;
import Guns.gunType.ShotGun;

public class EVA8 extends Weapon {
    public EVA8(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage, int numBullets) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = ShotGun.EVA8.getGunName();
        magSize = ShotGun.EVA8.getMagSize();
        reloadSpeed = ShotGun.EVA8.getReloadSpeed();
        fireRate = ShotGun.EVA8.getFireRate();
        bulletDamage = ShotGun.EVA8.getBulletDamage();
        numBullets = ShotGun.EVA8.getBulletNum();
    }
}
