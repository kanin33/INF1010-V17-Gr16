// abstrakt klasse kan ikke lages objekter av
abstract class AlkoholDrikke {
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
    public String getNavn() {
        return navn;
    }

    public String toString() {
        return "Alkoholholdig drikke med navn " + navn;
    }
}
