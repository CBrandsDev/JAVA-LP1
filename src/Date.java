public class Date {
    private int day;
    private String month;
    private int year;


    public Date(int d, String m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void dReport() {
        System.out.println(day + " " + month + " " + year);
    }
}