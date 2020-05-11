package Guns.gunType;

public enum EnergyGun {
    HAVOC("Havoc", 32, 2.4, 11.2, 18),
    LSTAR("L-STAR", 34, 3.26, 10, 18),
    DEVOTION("Devotion", 54, 2.80, 15, 17);

    private final String GunName;
    private final int magSize;
    private final double reloadSpeed;
    private final double fireRate;
    private final int bulletDamage;

    EnergyGun(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
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
