package Behaviours;

import Guns.Weapon;
import Player.Player;

public interface IShoot {

    public void shoot(Player player);
    public void reload();
    public String getGunName();
    public int getMagSize();
    public double getReloadSpeed();
    public double getFireRate();
    public int getBulletDamage();
}
