package Guns.assaultRifles;

import Guns.Weapon;
import Guns.gunType.EnergyGun;

public class Havoc extends Weapon {
    public Havoc(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = EnergyGun.HAVOC.getGunName();
        magSize = EnergyGun.HAVOC.getMagSize();
        reloadSpeed = EnergyGun.HAVOC.getReloadSpeed();
        fireRate = EnergyGun.HAVOC.getFireRate();
        bulletDamage = EnergyGun.HAVOC.getBulletDamage();

    }

}
