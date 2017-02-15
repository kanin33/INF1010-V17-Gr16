class Ol extends AlkoholDrikke {
    protected String humletype;
    public Ol(String humletype, double alkoholInnhold,
              String navn) {
        super(alkoholInnhold, navn);
        this.humletype = humletype;
    }

    public String getHumletype() {
        return humletype;
    }
}
