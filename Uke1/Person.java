class Person {
    String navn;
    int alder;
    double hoyde;

    public Person(String navn, int alder, double hoyde){
        this.navn = navn;
        this.alder = alder;
        this.hoyde = hoyde;
    }

    public String hentNavn() {
        return navn;
    }

    public void printAlder() {
        for(int i = 0; i < alder; i++) {
            System.out.println(i);
        }
    }


}
