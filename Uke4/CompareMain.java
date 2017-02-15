class CompareMain {
    public static void main(String[] args) {
        String[] stringArray = {"Hei", "Hallo", "Hey"};
        String storst = stringArray[0];
        // sammenlikner det første elementet med alle
        // de andre elementene
        for(String s : stringArray) {
            // hvis s er "større enn" storst
            // gjør vi s om til den største
            if(storst.compareTo(s) < 0) {
                storst = s;
            }
        }
        System.out.println(storst);
    }
}
