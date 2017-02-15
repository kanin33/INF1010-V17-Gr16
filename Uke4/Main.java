class Main {
    public static void main(String[] args) {
        //AlkoholDrikke a = new AlkoholDrikke(10, "hei"); // gaar ikke
        Ol o = new Ol("Challenger", 4.5, "IPA");
        AlkoholDrikke b = o;
        //System.out.println(b.getHumletype()); // gaar ikke
        Ol o2 = (Ol) b;
        System.out.println(o2.getHumletype());

        Vin v = new Vin("Cabernet sauvignon", 2005,
                        12, "Vin1");
        if(v instanceof Rodvin) { // v er ikke Rodvin
            Rodvin r = (Rodvin) v;
            System.out.println("Den var rodvin");
        }
        Rodvin r1 = new Rodvin("Pinot noir", 2008, 11.5,
                                "Doppio passo");
        Hvitvin v1 = new Hvitvin("Carbernet sauvignon",
                                 2010, 10, "Hvitvin");
        Vin v3 = v1;
        //Rodvin r3 = (Rodvin) v3; // gaar ikke
        AlkoholDrikke a = v;
        System.out.println(a); // printer Vin sin toString
    }
}
