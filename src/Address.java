public class Address {
    private String street;
    private int cep;
    private int number;

    public Address(String s, int cep, int n) {
        street = s;
        this.cep = cep;
        number = n;
    }

    public void aReport(){
        System.out.println("Street " + street + ", Number " + number + ", CEP " + cep);
    }

}