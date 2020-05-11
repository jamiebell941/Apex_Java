package Guns.sniper;

import Guns.Weapon;
import Guns.gunType.SniperGun;

public class ChargeRifle extends Weapon {
    public ChargeRifle(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = SniperGun.CHARGERIFLE.getGunName();
        magSize = SniperGun.CHARGERIFLE.getMagSize();
        reloadSpeed = SniperGun.CHARGERIFLE.getReloadSpeed();
        fireRate = SniperGun.CHARGERIFLE.getFireRate();
        bulletDamage = SniperGun.CHARGERIFLE.getBulletDamage();
    }
}
