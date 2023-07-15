
public class Mammal {
    protected int energyLevel;

    public Mammal(int energy) {
        energyLevel = energy;
    }

    public Integer displayEnergy() {
        System.out.println("El nivel de energía es: " + energyLevel);
        return energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
}
