import Weapon.*;

class Player {
    private Weapon[] weaponSlots;
    private boolean isOutOfRange;

    public Player() {
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new BigGun(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void setOutOfRange(boolean isOutOfRange) {
        this.isOutOfRange = isOutOfRange;
    }

    public boolean getOutOfRange() {
        return isOutOfRange;
    }

    public void shotWithWeapon(int slot) {
        //TODO обязательно сделать тернарник
        if (slot < 0 || slot >= getSlotsCount()) {
//            setOutOfRange(true);
            System.out.println("Invalid index");
            return;
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();


    }
}
