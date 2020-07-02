public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(200, 20, "Magic Hit");
        Medic medic = new Medic(250, 20, "Healing");
        Warrior warrior = new Warrior(250, 25, "Destroying Hit");

        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " " + heroes[i].getTypeOfSuperAbility());

        }
    }

}
