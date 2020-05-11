package Guns.shotGuns;

import Guns.Weapon;
import Guns.gunType.ShotGun;

public class Peacekeeper extends Weapon {
    private ShotGun PeaceKeeper;
    public Peacekeeper(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage, int numBullets) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = ShotGun.PEACEKEEPER.getGunName();
        magSize = ShotGun.PEACEKEEPER.getMagSize();
        reloadSpeed = ShotGun.PEACEKEEPER.getReloadSpeed();
        fireRate = ShotGun.PEACEKEEPER.getFireRate();
        bulletDamage = ShotGun.PEACEKEEPER.getBulletDamage();
        numBullets = ShotGun.PEACEKEEPER.getBulletNum();

    }
}
