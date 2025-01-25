public class HasCorrectPinState implements ATMState{

    private ATMMachine atmMachine;

    public HasCorrectPinState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Kart zaten takılmış durumda.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Kart çıkarıldı.");
        atmMachine.setState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Şifre zaten girildi.");
    }

    @Override
    public void withdrawCash(int amount) {

        if (amount <= atmMachine.getCash()) {
            System.out.println("Çekilen nakit miktarı: " + amount);
            atmMachine.setCash(atmMachine.getCash() - amount);
            System.out.println("Hesapta kalan bakiye: " + atmMachine.getCash());

            if (atmMachine.getCash() <= 0) {
                System.out.println("ATM'de para kalmadı.");
                atmMachine.setState(atmMachine.getNoCardState());
            }
        }else {
            System.out.println("ATM'de yeterince nakit bulunmamamktadır.");
        }

    }
}
