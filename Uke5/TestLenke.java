class TestLenke {
    public static void main(String[] args) {
        // lager en lenkeliste som kan inneholder Strings
        LenkeListe<String> l = new LenkeListe<String>();
        // setter inn to stringer
        l.settInn("Hei");
        l.settInn("Hallo");
        // henter ut verdien på index 1, det burde bli "hallo"
        System.out.println(l.hent(1));
        System.out.println(l.getStorrelse());
    }
}
