import java.util.Scanner;
public class Main {
 
  public static void main(String args[]){
   Scanner scanner= new Scanner(System.in);
   System.out.println("Çalışanlar PRogramın Hoş Geldiniz");
    
   String islemler= "İşlemler...\n"
                  + "1.Yazılımcı İşlemleri\n"
                  + "2.Yönetici İşlemleri\n"
                  + "Çıkış için q'ya basınız...";
  
   System.out.println("**********");
  
  while(true){
  System.out.println("İşlemi seçiniz: ");
  String islem=scanner.nextLine();
    
  if(islem.equals("q")){
   System.out.println("Programdan çıkılıyor...");
   break;
    }
  
    else if(islem.equals("1")){ 
    Yazilimci yazilimci = new Yazilimci("Mihrimah Sena","Küçük",123, "Java");
    
      String yazilimci_islem="1.Format At\n"
                            +"2.Bilgileri Göster\n"
                            +"Çıkış için q'ya basınız...";
      
      System.out.println(yazilimci_islem);
      
      while(true){
        
      System.out.println("İşlemi Seçiniz: ");
      String y_islem= scanner.nextLine();
        
      if(y_islem.equals("q")){
      System.out.println("Yazılımcı işlemlerinden çıkış yapılıyor...");
      break;
       }
       else if(y_islem.equals("1")){
       System.out.println("İşletim Sistemi: ");
       String isletim_sistemi= scanner.nextLine();
       yazilimci.formatAt(isletim_sistemi); 
       }
        
       else if(y_islem.equals("2")){
         yazilimci.bilgileriGoster();
        
        
        
      }
        
       else{
       System.out.println("Geçersiz yazılımcı işlemi...");
       
       }
    }
    
    
            
  }
  
  else if(islem.equals("2")){
  
    Yönetici yonetici = new Yönetici("Sena","Nur", 456, 5);
    
    String yonetici_islem= "Yönetici işlemleri\n"
                          +"1.Zam yap\n"
                          +"2.Bilgileri Göster\n"
                          +"Çıkış için q'ya basınız...";
    System.out.println(yonetici_islem);
    
   while(true){
   System.out.println("İşlem seçiniz");
   String y_islem=scanner.nextLine();
     
     if(y_islem.equals("q")){
       System.out.println("Yönetici işlemlerinden çıkılıyor...");
       break;
     }
     
     else if(y_islem.equals("1")){
       System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz?");
       int zam_miktari= scanner.nextInt();
       scanner.nextLine();
       yonetici.zamYap(zam_miktari);
     }
     
     else if(y_islem.equals("2")){
       yonetici.bilgileriGoster();
     }
             
     else{
       System.out.println("Geçersiz yönetici işlemi...");
     }
   }
    }
  }
  
  }

}
