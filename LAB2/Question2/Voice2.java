// Voice2 class implementing a template method pattern
public class Voice2 {
    private Animal[] animals;

    // Prepare the animals array
    private void prepareVoice() {
        animals = new Animal[] {
            new Cow(),
            new Dog(),
            new Pig(),
            new Goat(),
            new Lion()
        };
    }

    // Hear method that loops through the array and calls makeVoice()
    private void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }

    // Template method ensuring correct order of execution
    public void templateMethod() {
        prepareVoice();
        hear();
    }
}
