public class Exam {
    private String description;
    private int code;
    private double value;
    private Date examDate;

    public Exam(String ds, int code, double v, Date dt) {
        description = ds;
        this.code = code;
        value = v;
        examDate = dt;
    }

    public void eReport() {
        System.out.println("Exam: " + description);
        System.out.println("Exam Code: " + code);
        System.out.println("Date: ");
        examDate.dReport();
        System.out.println("Exam Value: " + value);

    }


}