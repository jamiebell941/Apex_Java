package Guns.sniper;

import Guns.Weapon;
import Guns.gunType.ShotGun;
import Guns.gunType.SniperGun;

public class Kraber extends Weapon {
    public Kraber(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = SniperGun.KRABER.getGunName();
        magSize = SniperGun.KRABER.getMagSize();
        reloadSpeed = SniperGun.KRABER.getReloadSpeed();
        fireRate = SniperGun.KRABER.getFireRate();
        bulletDamage = SniperGun.KRABER.getBulletDamage();

    }
}
