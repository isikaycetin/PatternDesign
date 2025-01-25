//kart takılmış durumu
public class HasCardState implements ATMState {

    private ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Kart zaten takılmış durumda.");
    }

    @Override
    public void ejectCard() {
        System.out.println("kart çıkarıldı.");
        atmMachine.setState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        if (pin == 2828) {
            System.out.println("Şifre doğru girildi. Nakit çekebilirsiniz.");
            atmMachine.setState(atmMachine.getHasCorrectPinState());
        }else {
            System.out.println("Geçersiz şifre. Lütfen, tekrar deneyiniz.");
        }
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("İlk olarak şifre giriniz. ");
    }
}
