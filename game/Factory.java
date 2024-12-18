package game;

abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x;
    protected int y;

    public Character(String name, int health, int attackPower, int x, int y) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }

    public abstract void displayInfo();

    public void move(int newX, int newY) {
        System.out.println(name + " рухається з (" + x + ", " + y + ") у (" + newX + ", " + newY + ").");
        this.x = newX;
        this.y = newY;
    }

    public void attack(Character target) {
        System.out.println(name + " атакує " + target.name + " з силою " + attackPower + "!");
        target.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " отримав " + damage + " дмг. Залишилось хп: " + health);
    }
}

class Warrior extends Character {
    public Warrior(int x, int y) {
        super("Воїн", 150, 20, x, y);
    }

    @Override
    public void displayInfo() {
        System.out.println("Воїн | хп: " + health + " | дмг: " + attackPower + " | Координати: (" + x + ", " + y + ")");
    }
}

class Mage extends Character {
    public Mage(int x, int y) {
        super("Маг", 100, 40, x, y);
    }

    @Override
    public void displayInfo() {
        System.out.println("Маг | хп: " + health + " | дмг: " + attackPower + " | Координати: (" + x + ", " + y + ")");
    }
}

class Archer extends Character {
    public Archer(int x, int y) {
        super("Лучник", 120, 30, x, y);
    }

    @Override
    public void displayInfo() {
        System.out.println("Лучник | хп: " + health + " | дмг: " + attackPower + " | Координати: (" + x + ", " + y + ")");
    }
}

class CharacterFactory {
    public static Character createCharacter(String type, int x, int y) {
        switch (type.toLowerCase()) {
            case "воїн":
                return new Warrior(x, y);
            case "маг":
                return new Mage(x, y);
            case "лучник":
                return new Archer(x, y);
            default:
                throw new IllegalArgumentException("нема такого");
        }
    }
}
