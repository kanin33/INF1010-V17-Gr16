class Basketlag {
    // initialiserer variabler
    private String navn;
    private Basketspiller[] spillere;

    public Basketlag(String navn, int antSpillere) {
        // kontruktor
        // husk this hvis variablene har samme navn
        this.navn = navn;
        spillere = new Basketspiller[antSpillere];
    }

    public boolean settInnSpiller(Basketspiller s) {
        // sett inn spiller hvis det er ledig plass
        for(int i = 0; i < spillere.length; i++) {
            // hvis plassen er null, sett inn
            if(spillere[i] == null) {
                spillere[i] = s;
                // returner saa loopen slutter (metoden avsluttes)
                return true;
            }
        }
        // returner false hvis det ikke er ledig plass
        return false;
    }
}
