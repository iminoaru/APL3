// Class containing the prepareVoice() and hear() methods
public class Voice {
    private Animal[] animals;

    // Prepare the animals array
    public void prepareVoice() {
        animals = new Animal[] {
            new Cow(),
            new Dog(),
            new Pig(),
            new Goat(),
            new Lion()
        };
    }

    // Hear method that loops through the array and calls makeVoice()
    public void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}
