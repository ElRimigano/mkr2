package game;

public class Main {
    public static void main(String[] args) {

        Arena arena = new Arena();

        Character warrior = CharacterFactory.createCharacter("воїн");
        Character mage = CharacterFactory.createCharacter("маг");
        Character archer = CharacterFactory.createCharacter("лучник");

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        arena.showAllCharacters();
    }
}
