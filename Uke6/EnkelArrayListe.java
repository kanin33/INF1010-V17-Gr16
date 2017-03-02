// NB: har ikke testet dette programmet, så har ingen
// garanti for at det kjører. Dette er kun programmet
// jeg lagde i timen
import java.util.Iterator;

// Itererbar beholder med array som underliggende struktur
class EnkelArrayListe<E> implements Iterable<E> {
    private E[] array;
    private int storrelse;
    private int antElementer;

    public EnkelArrayListe(int storrelse) {
        this.storrelse = storrelse;
        // dette er en 'hack' for å kunne lage en
        // generisk array. Det går ikke an å skrive
        // new E[storrelse]
        // så linjen under må benyttes
        array = (E[]) new Object[storrelse];
        antElementer = 0;
    }

    public boolean settInn(E e) {
        // hvis arrayet er fullt kan man ikke sette inn
        if(antElementer == storrelse) {
            return false;
        }
        if(array[antElementer] == null) {
            // sett inn på ledig plass
            array[antElementer] = e;
            antElementer++;
            return true;
        }
        return false;
    }

    // dette er en indre klasse som beskriver
    // Iterator-objekter for EnkelArrayListe-klassen
    private class ArrayIterator implements Iterator<E> {
        // index i arrayet der iteratoren er nå
        private int her = 0;

        public boolean hasNext() {
            // hvis vi er på slutten av arrayet er det ingen
            // neste verdi
            if(her == storrelse) {
                return false;
            } else {
                return true;
            }
            // må også sjekke om neste er null, men det
            // har jeg ikke implementert enda
        }

        public E next() {
            her++;
            return array[her-1];
        }
    }

    @Override
    public Iterator<E> iterator() {
        // denne metoden må implementeres når klassen
        // implementerer Iterable
        return new ArrayIterator();
    }
}
