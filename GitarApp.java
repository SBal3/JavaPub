import java.util.Iterator;

public class GitarApp {
    public static String[] notalar = {"do","do#","re","re#","mi","fa","fa#","sol","sol#","la","la#","si"};
    public static void main(String[] args) {
        Akor akor= new Akor();
        System.out.println("Gitar uygulamasını başlatıyoruz...");
        System.out.println("Temel akorlar:");
        for (String str : akor.alAkorListesi()) {
            System.out.println(str);
        };

        Iterator<String> itr = akor.alAkorListesi().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }  
}
