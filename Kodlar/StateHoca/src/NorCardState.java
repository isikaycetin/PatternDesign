//Kart takılmamış durum

public class NorCardState implements ATMState{

    private ATMMachine atmMachine;

    public NorCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Kartınız takıldı. Lütfen, şifrenizi giriniz. ");
        atmMachine.setState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Çıkarılacak kart yok.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Kart takılı değil.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Lütfen, önce bir kart yerleştirin. ");
    }
}
