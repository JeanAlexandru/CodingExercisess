package OOP_PersonalTrainer;

public class Trainer {
    /*Create class Trainee, it should contain fields like: name, stamina, strength.
    You’ll simulate both sides – Trainer and Trainee. Within a while loop you will be asked for an exercise to be done.
    Every exercise should add/reduce stamina/strength.
    Take into account that stamina should not be reduced below 0.
    *Consider adding some supplements that will recover the stamina.
    Supplement  should be additional class.*/

    private double fatigue=1.1;
    private double multiplier=0.1;

    public Trainer (){

    }

    public Trainer(double fatigue, double multiplier){
        this.fatigue=fatigue;
        this.multiplier=multiplier;
    }

    public double getFatigue() {
        return fatigue;
    }

    public void setFatigue(double fatigue) {
        this.fatigue = fatigue;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }
}
