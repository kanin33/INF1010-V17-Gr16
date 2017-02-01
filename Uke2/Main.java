class Main {
    public static void main(String[] args) {
        testBasketspiller();
        testBasketlag();
    }

    public static void testBasketspiller() {
        // lag Basketspiller-objekt
        Basketspiller s = new Basketspiller("Jordan", 2.05, 398);
        System.out.println("Test Basketspiller");
        // sjekk at antall kamper spillt er riktig
        if(s.antallKamperSpilt() == 398) {
            System.out.println("Testen gikk bra");
        } else {
            System.out.println("Testen gikk ikke bra");
        }
    }

    public static void testBasketlag() {
        // lag Baskerspiller-objekt
        Basketspiller b = new Basketspiller("James", 1.98, 205);
        // lag Basketlag-objekt
        Basketlag lag = new Basketlag("Abelz Gainerz", 2);
        // sett inn spiller paa laget
        lag.settInnSpiller(b);
        System.out.println("Tester sett inn spiller paa ledig plass");
        // sjekk at det gaar an aa sette inn en spiller til
        if(lag.settInnSpiller(b)) {
            System.out.println("Testen gikk fint");
        } else {
            System.out.println("Testen feilet");
        }
        System.out.println("Tester sett inn spiller, ikke ledig plass");
        // skal bare vaere plass til to, saa skal ikke kunne
        // sette inn en spiller til
        if(!lag.settInnSpiller(b)) {
            // ! gjoer false til true og true til false (kalles negasjon)
            System.out.println("Testen gikk bra");
        } else {
            System.out.println("Testen feilet");
        }
    }
}
