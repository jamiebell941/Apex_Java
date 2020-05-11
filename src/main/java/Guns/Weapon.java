package Guns;

import Behaviours.IShoot;
import Player.Player;

public abstract class Weapon implements IShoot  {

    private final String GunName;
    private int magSize;
    private final double reloadSpeed;
    private final double fireRate;
    private final int bulletDamage;

    public Weapon(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        GunName = gunName;
        this.magSize = magSize;
        this.reloadSpeed = reloadSpeed;
        this.fireRate = fireRate;
        this.bulletDamage = bulletDamage;
    }

    public void reload(){

    }

    public void shoot(Player player){
        if (magSize > 0 && player.getHitPoints() > 0){
            setMagSize(magSize -= 1);
            player.setHitPoints((player.getHitPoints() - this.bulletDamage));
        } else if (magSize == 0){
            this.reload();
        }
    };

    public String getGunName() {
        return GunName;
    }

    public int getMagSize() {
        return magSize;
    }
    public void setMagSize(int magSize) {
        this.magSize = magSize;
    }
    public double getReloadSpeed() {
        return reloadSpeed;
    }

    public double getFireRate() {
        return fireRate;
    }

    public int getBulletDamage() {
        return bulletDamage;
    }
}
