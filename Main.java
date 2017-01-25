class Main {
    public static void main(String[] args){
        Person p = new Person("Per", 20, 1.95);
        System.out.println(p.hentNavn());
        p.printAlder();
    }
}
