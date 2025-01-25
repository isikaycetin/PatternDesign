public class Main {
    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine(15000); //ATM başlangıç bakiyesi


        atmMachine.insertCard();
        atmMachine.enterPin(2828);
        atmMachine.withdrawCash(3650);
        atmMachine.ejectCard();
        atmMachine.withdrawCash(3000);

    }
}