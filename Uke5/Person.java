// Comparable-interfacet ligger allerede i java - derfor
// trenger vi ikke ha det liggende i samme mappe
class Person implements Comparable<Person> {
    private String navn;
    private int alder;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public int getAlder() {
        return alder;
    }
    // metode for å sammenlikne to personer med hensyn
    // på alder
    //
    // returner 1 hvis denne sin alder < p sin alder
    // returner 0 hvis alderene er like
    // returner -1 hvis denne sin alder > p sin alder
    @Override
    public int compareTo(Person p) {
        if(this.alder < p.getAlder()) {
            return 1;
        } else if (this.alder == p.getAlder()) {
            return 0;
        } else {
            return -1;
        }
    }

    public String getNavn() {
        return navn;
    }
    // metode for å sammelikne to personer med hensyn på
    // navn (String)
    /*
    @Override
    public int compareTo(Person p) {
        // bruk String sin compareTo
        return this.navn.compareTo(p.getNavn());
    }
    */
}
