//State (Durum) Arayüzü

public interface ATMState {

    void insertCard(); //kart takma
    void ejectCard(); //kartın çıkarılması
    void enterPin(int pin); // şifre durumları kontrol
    void withdrawCash(int amount); // para çekme

}
