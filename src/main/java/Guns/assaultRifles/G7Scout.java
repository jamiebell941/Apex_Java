package Guns.assaultRifles;

import Guns.Weapon;
import Guns.gunType.LightGun;

public class G7Scout extends Weapon {
    public G7Scout(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);

        gunName = LightGun.G7_SCOUT.getGunName();
        magSize = LightGun.G7_SCOUT.getMagSize();
        reloadSpeed = LightGun.G7_SCOUT.getReloadSpeed();
        fireRate = LightGun.G7_SCOUT.getFireRate();
        bulletDamage = LightGun.G7_SCOUT.getBulletDamage();
    }
}
