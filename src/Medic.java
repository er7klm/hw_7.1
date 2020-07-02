public class Medic extends Hero {

    public Medic(int health, int damage, String typeOfSuperAbility) {
        super(health, damage, typeOfSuperAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: ");
    }
}
