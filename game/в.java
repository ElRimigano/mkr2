package game;
import java.util.ArrayList;
import java.util.List;

class Arena {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.name + " доданий на арену.");
        notifyCharacters(character);
    }

    public void notifyCharacters(Character newCharacter) {
        System.out.println("На арені з'явився новий персонаж: " + newCharacter.name);
        for (Character c : characters) {
            if (c != newCharacter) {
                System.out.println(">>> " + c.name + " бачить нового персонажа " + newCharacter.name);
            }
        }
    }

    public void showAllCharacters() {
        System.out.println("\nУсі персонажі на арені:");
        for (Character c : characters) {
            c.displayInfo();
        }
    }
}
