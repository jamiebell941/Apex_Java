package Guns.gunType;

public enum ShotGun {
    MASTIFF("Mastiff", 4, 1.03, 1.3, 18, 8),
    PEACEKEEPER("Peacekeeper", 5, 2.65, 0.97, 10, 11),
    EVA8("EVA-8 Auto", 8, 2.75, 2, 7, 9),
    MOZAMBIQUE("Mozambique", 3, 2.1, 2.2, 15, 3);
    private final String GunName;
    private final int magSize;
    private final double reloadSpeed;
    private final double fireRate;
    private final int bulletDamage;
    private final int bulletNum;

    ShotGun(String gunName, int magSize, double reloadSpeed, double fireRate, int bulletDamage, int bulletNum) {
        GunName = gunName;
        this.magSize = magSize;
        this.reloadSpeed = reloadSpeed;
        this.fireRate = fireRate;
        this.bulletDamage = bulletDamage;
        this.bulletNum = bulletNum;
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

    public int getBulletNum() {
        return bulletNum;
    }
}
