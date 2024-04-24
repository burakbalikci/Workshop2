//Kullanıcının username, email, firstname, lastname ve password bilgilerini tutan bir ArrayList
// kullanarak giriş yapma algoritması yazınız.
  import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class q4 {
        public static void main(String[] args) {
            //4-) Kullanıcının username, email, firstname, lastname ve password bilgilerini tutan bir ArrayList kullanarak giriş yapma algoritması yazınız.
            List<String[]> userInfos = new ArrayList<>();
            userInfos.add(new String[] {"MelodiBayraktar","abc@gmail.com", "Melodi", "Bayraktar","abcabc"});

            //System.out.println(userInfos);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kullanıcı adınızı giriniz: ");
            String userName = scanner.nextLine();

            System.out.print("Şifrenizi giriniz: ");
            String password = scanner.nextLine();

            for(String[] user: userInfos){
                if(user[0].equals(userName) && user[4].equals(password)){
                    System.out.println("Giriş başarılı, hoşgeldiniz " + user[0]);
                }else{
                    System.out.println("Kullanıcı bulunamadı..");
                }
            }
        }
    }