public class Sellers {
    private String name;
    private int age;
    private SAddress address;

    public Sellers(String n, int a, SAddress ad) {
        name = n;
        age = a;
        address = ad;
    }

    public void sReport() {
        System.out.println("Seller " + name + ", " + age + " year old, address ");
        address.aReport();
    }
}