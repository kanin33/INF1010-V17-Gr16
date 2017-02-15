// Utvider Whiskey-klassen og implementerer Koffeinholdig
// for å lage en klasse for Irish coffee.
//
// Kunne også brukt Kaffe-klassen og implementert
// Alkoholholdig-interfacet
class Irish extends Whiskey implements Koffeinholdig {
    public Irish(double alkoholInnhold,
                 String navn) {
        super(alkoholInnhold, navn);
    }

    public int getKoffeininnhold() {
        return 50;
    }
}
