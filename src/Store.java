public class Store{ 
    private String name;
    private Sellers seller;
    private Cars car;

    public Store(String n, Sellers s, Cars c) {
        name = n;
        seller = s;
        car = c; 
    }

    public void sReport() {
        System.out.println("Store " + name + ", the Seller ");
        seller.sReport();
        car.cReport();
    }
}