package homeworks.hw4_01_11_22.ex1;

import java.util.Objects;

public class Gun {
    private String weaponName;
    private int damageWeapon;
    private int priceWeapon;

    public Gun(String weaponName, int damageWeapon, int priceWeapon) {
        this.weaponName = weaponName;
        this.damageWeapon = damageWeapon;
        this.priceWeapon = priceWeapon;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamageWeapon() {
        return damageWeapon;
    }

    public void setDamageWeapon(int damageWeapon) {
        this.damageWeapon = damageWeapon;
    }

    public int getPriceWeapon() {
        return priceWeapon;
    }

    public void setPriceWeapon(int priceWeapon) {
        this.priceWeapon = priceWeapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gun gun = (Gun) o;
        return weaponName.equals(gun.weaponName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weaponName);
    }

    @Override
    public String toString() {
        return "Gun{" +
                "weaponName='" + weaponName + '\'' +
                ", damageWeapon=" + damageWeapon +
                ", priceWeapon=" + priceWeapon +
                '}';
    }
}
