/*   Uygulamanın Amacı:
*  Bir nesneye yani kahveye dinamik olarak yeni özellikler ekleyebilmektir.
*  Bu örnekte farklı kahve türlerini ve bileşenleri(şurup,çiko,süt) için ayrı bir sınıf oluşturmadan yönetmek amacındayız.
* Bunun yerine, Decorator tasarım deseni kullanılarak temel bir kahve nesnesine farklı bileşenler dinamik olarak eklenir.
* Bileşenler(şurup,çiko,süt) bir Decorator sınıf tanımlanır ve temel nesneye eklenir.
* Bu sayede her olası kombinasyon için ayrı bir sınıf oluşturmak zorunda kalmazyız.
*
* Işıkay ÇETİN - 1220505031
* */
public class Main {
    public static void main(String[] args) {
        Kahve kahve = new SadeKahve();
        System.out.println(kahve.aciklama() + " Fiyat: " + kahve.fiyat() + " TL");

        // Kahveye süt ekleyelim.
        kahve = new SutDecorator(kahve);
        System.out.println(kahve.aciklama() + " Fiyat: " + kahve.fiyat() + " TL");

        // Kahveye çikolata da ekleyelim.
        kahve = new CikolataDecorator(kahve);
        System.out.println(kahve.aciklama() + " Fiyat: " + kahve.fiyat() + " TL");

        // Son olarak şurup ekleyelim.
        kahve = new SurupDecorator(kahve);
        System.out.println(kahve.aciklama() + " Fiyat: " + kahve.fiyat() + " TL");
    }
}