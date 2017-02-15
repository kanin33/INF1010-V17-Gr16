class Oppg31Main {
    public static void main(String[] args) {
        // Lager en bjørn og en ulv
        Bjorn b = new Bjorn();
        b.jakt();
        Ulv u = new Ulv();
        u.jakt();
        // Alle rovdyr kan legges inn i et Rovdyr-array,
        // selv om de ikke er samme type (litt som
        // å bruke superklasser)
        Rovdyr[] rovdyrArray = new Rovdyr[2];
        rovdyrArray[0] = b;
        rovdyrArray[1] = u;
    }
}
