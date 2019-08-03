package OOP_PersonalTrainer;

public class Trainee {
        /*Create class Trainee, it should contain fields like: name, stamina, strength.
    You’ll simulate both sides – Trainer and Trainee. Within a while loop you will be asked for an exercise to be done.
    Every exercise should add/reduce stamina/strength.
    Take into account that stamina should not be reduced below 0.
    *Consider adding some supplements that will recover the stamina.
    Supplement  should be additional class.*/
        private String name;
        private double stamina;
        private double strength;

        public Trainee (){

        }

        public Trainee (String name, double stamina, double strength){
            this.name=name;
            this.stamina=stamina;
            this.strength=strength;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
}
