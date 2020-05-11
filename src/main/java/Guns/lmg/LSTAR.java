package Guns.lmg;

import Guns.Weapon;
import Guns.gunType.EnergyGun;

public class LSTAR extends Weapon {
    public LSTAR(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = EnergyGun.LSTAR.getGunName();
        magSize = EnergyGun.LSTAR.getMagSize();
        reloadSpeed = EnergyGun.LSTAR.getReloadSpeed();
        fireRate = EnergyGun.LSTAR.getFireRate();
        bulletDamage = EnergyGun.LSTAR.getBulletDamage();
    }
}
