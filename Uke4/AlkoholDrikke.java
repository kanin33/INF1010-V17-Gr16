// abstrakt klasse kan ikke lages objekter av
abstract class AlkoholDrikke implements Drikkbar{
    protected double alkoholInnhold;
    protected String navn;

    public AlkoholDrikke(double alkoholInnhold,
                         String navn) {
        this.alkoholInnhold = alkoholInnhold;
        this.navn = navn;
    }

    public double getAlkoholInnhold() {
        return alkoholInnhold;
    }

    // implementerer klassen fra Drikkbar-interfacet
    @Override
    public int getAldersgrense() {
        if(alkoholInnhold < 2.5) {
            return 0;
        } else if (alkoholInnhold > 22) {
            return 20;
        } else {
            return 18;
        }

    }
    public String getNavn() {
        return navn;
    }

    public String toString() {
        return "Alkoholholdig drikke med navn " + navn;
    }
}
