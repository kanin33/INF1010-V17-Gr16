class TestBeholder {
    public static void main(String[] args) {
        // lager en beholder som kan inneholde en String
        Beholder<String> beholder = new Beholder<String>("Hei");
        System.out.println(beholder.getValue());
    }
}
