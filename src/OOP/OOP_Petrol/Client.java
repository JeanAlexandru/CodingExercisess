package OOP.OOP_Petrol;

public class Client {
    private double petrol;
    private double money;

    public Client(){

    }

    public Client (double petrol, double money){
        this.petrol=petrol;
        this.money=money;
    }

    public double getPetrol() {
        return petrol;
    }

    public void setPetrol(double petrol) {
        this.petrol = petrol;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
