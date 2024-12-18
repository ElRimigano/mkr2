package game;

import java.util.ArrayList;
import java.util.List;

class ArenaMediator {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.name + " доданий на координати (" + character.x + ", " + character.y + ").");
        notifyCharacters(character);
    }

    public void characterAttack(Character attacker, Character target) {
            attacker.attack(target);
    }

    public void showAllCharacters() {
        System.out.println("\nУсі персонажі на арені:");
        for (Character c : characters) {
            c.displayInfo();
        }
    }

    private void notifyCharacters(Character newCharacter) {
        for (Character c : characters) {
            if (c != newCharacter) {
                System.out.println(">>> " + c.name + " бачить нового персонажа " + newCharacter.name);
            }
        }
    }
}
