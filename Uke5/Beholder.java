class Beholder<E> implements BeholderInterface<E>{
    // merk at vi må skrive <E> både etter interfacet
    // og etter klassenavnet
    private E e;

    public Beholder(E e) {
        this.e = e;
    }

    public E getValue() {
        return e;
    }
}
