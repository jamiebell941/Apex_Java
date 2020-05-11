package Guns.assaultRifles;

import Behaviours.IShoot;
import Guns.Weapon;
import Guns.gunType.LightGun;

public class R301 extends Weapon implements IShoot {
    private LightGun R301;
    public R301(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        super(gunName, magSize, reloadSpeed, fireRate, bulletDamage);
        gunName = LightGun.R_301.getGunName();
        magSize = LightGun.R_301.getMagSize();
        reloadSpeed = LightGun.R_301.getReloadSpeed();
        fireRate = LightGun.R_301.getFireRate();
        bulletDamage = LightGun.R_301.getBulletDamage();
    }


    public void reload(){
        setMagSize(LightGun.R_301.getMagSize());
    }







}
