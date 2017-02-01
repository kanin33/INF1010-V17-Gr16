class Basketspiller {
    // initialiser variabler
    private String navn;
    private double hoyde;
    private int antKamper;

    public Basketspiller(String navn, double hoyde, int antKamper) {
        // kontruktor
        this.navn = navn;
        this.hoyde = hoyde;
        this.antKamper = antKamper;
    }

    public int antallKamperSpilt() {
        // returner antall kamper
        return antKamper;
    }
}
