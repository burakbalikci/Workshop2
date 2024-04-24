/*1-) Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi olarak
tutan ve toplam satış gelirini hesaplayan bir algoritma yazınız.*/

public class Main {
    public static void main(String[] args) {
        int[] SatısAdedı= {5,8,1};
        String[] UrunAdı = {"telefon","bilgisayar","tablet"};
        double[] Fiyat= {100,500,200};
        double toplamSatis=0;
        for (int i=0;i< UrunAdı.length;i++){
            toplamSatis+= SatısAdedı[i]* Fiyat[i];

            System.out.println("Ürün adı " + UrunAdı[i] + " Ürün miktarı " + SatısAdedı[i] + " Ürün fiyatı " + Fiyat[i]);
        }
        System.out.println("Toplam Staış " + toplamSatis);
    }
}