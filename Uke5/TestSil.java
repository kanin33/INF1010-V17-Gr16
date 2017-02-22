class TestStil {
    public static void main(String[] args) {
        // lager en sil for String
        // merk at String implementerer Comparable (prøv
        // å sjekke dokumentasjonen til String)
        MinMaksSil<String> sil = new MinMaksSil<String>();
        sil.sil("hei");
        sil.sil("hallo");
        sil.sil("aaaaa");
        sil.sil("bbbb");
        // den største burde være "hallo" og den minste
        // burde være "aaaaa" (sortert alfabetisk)
        sil.skriv();

        // lager en sil for personer (Person-klassen vår
        // implementerer Comparable)
        MinMaksSil<Person> personSil = new MinMaksSil<Person>();
        personSil.sil(new Person("Tale", 25));
        personSil.sil(new Person("Tale2", 20));
        personSil.skriv();
    }
}
