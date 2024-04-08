public class Cars {
    private String model;
    private int year;

    public Cars(String md, int y) {
        year = y;
        model = md;
    }

    public void cReport() {
        System.out.println("Sell this car model " + model + ", year " + year);
        System.out.println("");
    }
}