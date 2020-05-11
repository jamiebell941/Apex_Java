package Guns.pistols;

import Guns.Weapon;
import Guns.gunType.EnergyGun;
import Guns.gunType.LightGun;

public class P2020 extends Weapon {
    public P2020(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = LightGun.P2020.getGunName();
        magSize = LightGun.P2020.getMagSize();
        reloadSpeed = LightGun.P2020.getReloadSpeed();
        fireRate = LightGun.P2020.getFireRate();
        bulletDamage = LightGun.P2020.getBulletDamage();
    }
}
