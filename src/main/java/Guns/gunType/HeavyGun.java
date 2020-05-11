package Guns.gunType;

public enum HeavyGun {

    WINGMAN("Wingman", 5, 2.10, 2.6, 45),
    SPITFIRE("M600 Spitfire", 35, 2.80, 9, 18),
    PROWLER("Prowler PDW", 20, 2.0, 20, 15),
    FLATLINE("VK-47 Flatline", 20, 2.40, 10, 19),
    HEMLOK("Hemlok Burst AR", 18, 3.2, 11, 18);

    private final String GunName;
    private final int magSize;
    private final double reloadSpeed;
    private final double fireRate;
    private final int bulletDamage;

    HeavyGun(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage) {
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
