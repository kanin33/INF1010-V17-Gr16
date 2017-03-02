/**
 * klasse for en lenkeliste
 */
public class LenkeListe<E> {
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

    /**
     * setter inn objekt foran
     *
     * masse informasjon om hvordan
     * dette fungerer over
     * flere linjer
     *
     * @param s objektet som skal settes inn
     */
    public void settInnForan(E s) {
        // opprett en ny node med det nye objektet
        // som skal settes inn
        Node nyNode = new Node(s);
        if(forste == null) {
            // hvis listen er tom settes både første-peker
            // og siste-peker til å peke på den nye noden
            forste = nyNode;
            storrelse++;
            return;
        }
        // midlertidig lagrer den første noden
        Node tmp = forste;
        // endrer den første så den blir den nye noden
        forste = nyNode;
        // setter på det som var foran før etter den nye
        // første-noden
        forste.neste = tmp;
        storrelse++;
    }

    public void settInnBak(E s) {
        Node nyNode = new Node(s);
        if(forste == null) {
            forste = nyNode;
            storrelse++;
            return;
        }
        // her brukes tmp til å finne den siste noden
        Node tmp = forste;
        // så lenge vi ikke er på den siste noden må
        // vi flytte pekeren ett hakk bort
        while(tmp.neste != null) {
            tmp = tmp.neste;
        }
        // når vi har funnet siste node setter vi på den
        // nye noden der
        tmp.neste = nyNode;
        storrelse++;
    }

    public E hentForan() {
        if(forste == null) {
            return null;
        }
        Node tmp = forste;
        forste = forste.neste;
        storrelse--;
        return tmp.s;
    }

    public E hentBak() {
        // case 1 (ingen noder)
        if(forste == null) {
            return null;
        // case 2 (det er kun èn node)
        } else if(forste.neste == null) {
            Node tmp = forste;
            forste = null;
            storrelse--;
            return tmp.s;
        }
        // case 3 (mer enn èn node)
        Node tmp = forste;
        // finn nest-siste node
        while(tmp.neste.neste != null) {
            tmp = tmp.neste;
        }
        // ta vare på den siste noden
        Node tmp2 = tmp.neste;
        // slett den siste noden fra listen
        tmp.neste = null;
        storrelse--;
        // returner verdien som lå i den siste noden
        return tmp2.s;
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

