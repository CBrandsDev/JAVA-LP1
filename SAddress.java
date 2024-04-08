public class SAddress {
    private String street;
    private int number;

    public SAddress(String s, int n) {
        street = s;
        number = n;
    }

    public void aReport() {
        System.out.println("Street " + street + ", number " + number);
    }
}