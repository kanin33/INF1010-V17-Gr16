class LenkeListe<E> {
    private int storrelse;
    private Node forste;
    private Node siste;

    private class Node {
        // indre klasse, kan ikke brukes
        // utenfor denne klassen

        // hver node lagrer et objekt av typen E
        E s;

        // noden har en peker til den neste
        // noden i listen
        Node neste;

        Node(E s) {
            this.s = s;
        }
    }

    public void settInn(E s) {
        // opprett en ny node med det nye objektet
        // som skal settes inn
        Node nyNode = new Node(s);
        if(forste == null) {
            // hvis listen er tom settes både første-peker
            // og siste-peker til å peke på den nye noden
            forste = nyNode;
            siste = nyNode;
            storrelse++;
            return;
        }
        // hvis listen ikke er tom legger vi til
        // den nye noden på slutten av lenkelisten
        siste.neste = nyNode;
        // flytte siste-pekeren til å peke på den nye noden
        // siden den nå ligger sist
        siste = nyNode;
        storrelse++;
    }

    public int getStorrelse() {
        return storrelse;
    }

    public boolean erTom() {
        if(forste == null) {
            return true;
        } else {
            return false;
        }
    }

    public E hent(int index) {
        // skal hente ut objektet som ligger lagret
        // i noden på indeks index
        int teller = 0;
        // starter på den første noden
        Node denne = forste;
        while(denne != null) {
            // så lenge vi ikke har nådd slutten av listen
            // vil vi sjekke om telleren har nådd indeksen
            // vi leter etter
            if(teller == index) {
                return denne.s;
            } else {
                // hvis vi ikke har kommet til riktig
                // indeks flytter vi denne-pekeren ett
                // hakk bort
                denne = denne.neste;
                teller++;
            }
        }
        // hvis vi aldri finner riktig indeks returnerer
        // vi null, siden indeksen ikke finnes
        //
        // vi kunne også kastet et unntak, for eksempel
        // IndexOutOfBoundsException
        return null;
    }
}

