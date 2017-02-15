class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Tale", 25);
        Person p2 = new Person("Ikke-Tale", 20);

        System.out.println("Er Tale eldre enn ikke-Tale?");
        System.out.println(p2.compareTo(p1));
    }
}
