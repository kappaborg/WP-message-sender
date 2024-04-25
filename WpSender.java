package Adapter;
import java.util.*;
public class WpSender {
    public static void main(String[] args) {
        Scanner kappa = new Scanner(System.in);
        System.out.println("Enter contant number with area code");
        String phoneNumber = kappa.nextLine(); 
        System.out.println("Enter a message to send");
        String message = kappa.nextLine(); 
        String clickToChatLink = "https://wa.me/" + phoneNumber + "?text=" + encodeMessage(message);
        //executable çıktımızı oluşturuyoruz. kullanıcı numarası ve mesaj ile
        System.out.println("Click to Chat Link: " + clickToChatLink);
    }
    private static String encodeMessage(String message) {
        try {
            return java.net.URLEncoder.encode(message, "UTF-8");
            //UTF 8 protokolünde encode işlemi yapıyoruz
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
}

