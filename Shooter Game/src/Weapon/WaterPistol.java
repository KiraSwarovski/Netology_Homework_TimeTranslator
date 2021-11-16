package Weapon;

public class WaterPistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Sound of "+getClass().getSimpleName());
    }
}
