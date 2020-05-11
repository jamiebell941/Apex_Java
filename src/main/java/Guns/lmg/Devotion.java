package Guns.lmg;

import Guns.Weapon;
import Guns.gunType.EnergyGun;

public class Devotion extends Weapon {
    private EnergyGun Devotion;
    public Devotion(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = EnergyGun.DEVOTION.getGunName();
        magSize = EnergyGun.DEVOTION.getMagSize();
        reloadSpeed = EnergyGun.DEVOTION.getReloadSpeed();
        fireRate = EnergyGun.DEVOTION.getFireRate();
        bulletDamage = EnergyGun.DEVOTION.getBulletDamage();
    }

}
