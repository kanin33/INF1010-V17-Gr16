// må importere iterator, men ikke iterable
import java.util.Iterator;
class LenkeTest {
    public static void main(String[] args) {
        LenkeListe<String> l = new LenkeListe<String>();
        // legger inn stringer i listen
        l.settInnForan("hei");
        l.settInnBak("hallo");
        l.settInnBak("hey");
        l.settInnForan("avocado");
        l.settInnBak("banan");
        l.settInnBak("heisann");
        Iterator<String> i = l.iterator();

        // denne while-løkken er ekvivalent med --
        String s;
        while(i.hasNext()) {
            s = i.next();
            System.out.println(s);
        }

        // -- denne for-løkken
        for(String s : l) {
            System.out.println(s);
        }



        // hentForan kaster en TomListeException, som
        // fanges i catch
        try{
          l.hentForan();
        }catch(TomListeException e) {

        }
        // programmet fortsetter her uansett om det oppstår
        // en exception eller ikke. Hvis vi ikke hadde brukt
        // try-catch, ville programmet avsluttet på linjen
        // l.hentForan() hvis det oppsto en exception
        System.out.println("Hallo");
    }
}
