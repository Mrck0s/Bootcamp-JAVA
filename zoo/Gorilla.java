

public class Gorilla extends Mammal{
    private int energyLevel;

    public Gorilla() {
        super(100);
    }

    public void throwSomething() {
        System.out.println("El gorila lanzó algo");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("El gorila se comió una banana");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("El gorila trepó a la cima");
        energyLevel -= 10;
    }

    public Integer displayEnergy() {
        System.out.println("El nivel de energía es: " + energyLevel);
        return energyLevel;
    }
}
