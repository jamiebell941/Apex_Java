package Guns.smg;

import Guns.Weapon;
import Guns.gunType.HeavyGun;

public class Prowler extends Weapon {
    public Prowler(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = HeavyGun.PROWLER.getGunName();
        magSize = HeavyGun.PROWLER.getMagSize();
        reloadSpeed = HeavyGun.PROWLER.getReloadSpeed();
        fireRate = HeavyGun.PROWLER.getFireRate();
        bulletDamage = HeavyGun.PROWLER.getBulletDamage();
    }
}
