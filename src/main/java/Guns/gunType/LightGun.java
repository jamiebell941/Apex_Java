package Guns.gunType;

public enum LightGun {

    R99("R-99", 20, 1.80, 18, 11),
    G7_SCOUT("G7 Scout", 10, 2.40, 4, 34),
    R_301("R-301", 18, 2.40, 13, 14),
    ALTERNATOR("Alternator", 16, 1.90, 16, 15 ),
    P2020("P2020", 10, 1.25, 8, 13),
    RE_15("RE-15", 16, 1.74, 13, 11);
   private final String GunName;
   private final int magSize;
   private final double reloadSpeed;
   private final double fireRate;
   private final int bulletDamage;

    LightGun(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
        GunName = gunName;
        this.magSize = magSize;
        this.reloadSpeed = reloadSpeed;
        this.fireRate = fireRate;
        this.bulletDamage = bulletDamage;
    }

    public String getGunName() {
        return GunName;
    }

    public int getMagSize() {
        return magSize;
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
