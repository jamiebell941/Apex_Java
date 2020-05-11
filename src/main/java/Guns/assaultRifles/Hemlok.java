package Guns.assaultRifles;

import Guns.Weapon;
import Guns.gunType.HeavyGun;
import Guns.gunType.LightGun;

public class Hemlok extends Weapon {
    private HeavyGun HemLok;
    public Hemlok(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = HeavyGun.HEMLOK.getGunName();
        magSize = HeavyGun.HEMLOK.getMagSize();
        reloadSpeed = HeavyGun.HEMLOK.getReloadSpeed();
        fireRate = HeavyGun.HEMLOK.getFireRate();
        bulletDamage = HeavyGun.HEMLOK.getBulletDamage();
    }
}
