package game;

abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void displayInfo();
}

class Warrior extends Character {
    public Warrior() {
        super("Воїн", 150, 20);
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип: Воїн | Здоров'я: " + health + " | Атака: " + attackPower);
    }
}

class Mage extends Character {
    public Mage() {
        super("Маг", 100, 40);
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип: Маг | Здоров'я: " + health + " | Атака: " + attackPower);
    }
}

class Archer extends Character {
    public Archer() {
        super("Лучник", 120, 30);
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип: Лучник | Здоров'я: " + health + " | Атака: " + attackPower);
    }
}

class CharacterFactory {
    public static Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "воїн":
                return new Warrior();
            case "маг":
                return new Mage();
            case "лучник":
                return new Archer();
            default:
                throw new IllegalArgumentException("Невідомий тип персонажа");
        }
    }
}
