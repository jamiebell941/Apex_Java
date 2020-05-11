package Guns.gunType;

public enum SniperGun {
    CHARGERIFLE("Charge Rifle", 4, 3.6, 0.7, 45),
    LONGBOW("Longbow DMR", 6, 2.66, 1.3, 55),
    SENTINAL("Sentinal", 4, 2.5, 0.57, 70 ),
    KRABER("Kraber .50 CAL", 4, 3.2, 0.47, 145),
    TRIPLETAKE("Triple Take", 5, 2.6, 1.25, 23);

    private final String GunName;
    private final int magSize;
    private final double reloadSpeed;
    private final double fireRate;
    private final int bulletDamage;

    SniperGun(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
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
