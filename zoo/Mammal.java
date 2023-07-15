package zoo;

public class Mammal {
    protected int energyLevel = 50;

    public Integer displayEnergy() {
        System.out.println("El nivel de energía es: " + energyLevel);
        return energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
}
