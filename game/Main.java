package game;

public class Main {
    public static void main(String[] args) {
        ArenaMediator arena = new ArenaMediator();

        Character warrior = CharacterFactory.createCharacter("воїн", 0, 0);
        Character mage = CharacterFactory.createCharacter("маг", 3, 4);
        Character archer = CharacterFactory.createCharacter("лучник", 1, 2);

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        arena.showAllCharacters();

        warrior.move(2, 2);
        mage.move(5, 5);

        arena.characterAttack(warrior, mage);
        arena.characterAttack(archer, warrior);

        arena.showAllCharacters();
    }
}
