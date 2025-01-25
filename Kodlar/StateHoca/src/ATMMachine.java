public class ATMMachine {

    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState hasCorrectPinState;
    private ATMState currentState;
    private int cash;

    public ATMMachine(int initialCash) {

        noCardState = new NorCardState(this);
        hasCardState = new HasCardState(this);
        hasCorrectPinState = new HasCorrectPinState(this);

        currentState = noCardState;
        cash = initialCash;
    }

    public void setState(ATMState state){
        currentState = state;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getHasCorrectPinState() {
        return hasCorrectPinState;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount){
        currentState.withdrawCash(amount);
    }
}
