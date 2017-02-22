class MinMaksSil<T extends Comparable<T>> {
    // silen skal lagre største og minste verdi vi har
    // satt inn
    //
    // for å kunne sammenlikne to verdier må de implementere
    // Comparable-interfacet
    private T storste;
    private T minste;

    public void sil(T t) {
        if(storste == null) {
            // hvis silen er tom vil den nye verdien både
            // være størst og minst
            storste = t;
            minste = t;
            return;
        }
        if(t.compareTo(storste) > 0) {
            // hvis den nye verdien er større enn den
            // største verdien endrer vi den største
            // verdien til å bli den nye
            storste = t;
            return;
        } else if(t.compareTo(minste) < 0) {
            // hvis den nye verdien er mindre enn den
            // minste, endrer vi den minste verdien
            // til å bli den nye
            minste = t;
            return;
        } else {
            // hvis den hverken er større enn største
            // eller mindre enn minste, endrer vi ingenting
            return;
        }
    }

    public void skriv() {
        System.out.println("Storste");
        System.out.println(storste);
        System.out.println("Minste");
        System.out.println(minste);
    }
}
