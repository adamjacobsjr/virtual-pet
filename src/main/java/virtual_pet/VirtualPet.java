package virtual_pet;

public class VirtualPet {

    private int hunger;
    private int thirst;
    private int happy;

    public VirtualPet(int hunger, int thirst, int happy) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.happy = happy;

    }

    public int getHungerLevel() {
        return hunger;
    }

    public int getThirstLevel() {
        return thirst;
    }

    public int getHappyLevel() {
        return happy;

    }

    public void tick() {
        this.hunger += 10;
        this.thirst += 10;
        this.happy -= 5;
    }

    public void giveFood() {
        this.hunger -= 50;
        this.thirst += 25;
        if (hunger < 10){
            hunger = 0;
            System.out.println("Is no longer hungry.");
        }
    }

    public void giveWater() {
        this.thirst -= 50;
        if (thirst < 10){
            thirst = 0;
            System.out.println();
            System.out.println("Is no longer thirsty.");

        }
    }

    public void play() {
        this.happy += 30;
        if (happy < 10){
            happy = 0;
        }
    }

}
