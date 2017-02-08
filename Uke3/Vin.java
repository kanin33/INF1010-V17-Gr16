class Vin extends AlkoholDrikke {
    protected String drueType;
    protected int aargang;

    public Vin(String drueType, int aargang,
               double alkoholInnhold, String navn) {
        // maa kalle paa super foer noe annet gjores
        super(alkoholInnhold, navn);
        this.drueType = drueType;
        this.aargang = aargang;
    }

    public String getDrueType() {
        return drueType;
    }
    public int getAargang() {
        return aargang;
    }

    public String toString() {
        return "Vin med navn " + navn;
    }
}
