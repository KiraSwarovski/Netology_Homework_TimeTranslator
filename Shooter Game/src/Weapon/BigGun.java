package Weapon;

public class BigGun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Sound of "+getClass().getSimpleName());
    }
}
