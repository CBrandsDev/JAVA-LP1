public class Patient {
    private String name;
    private int age;
    private Address local;
    private Exam typeExam;
    
    public Patient(String n, int a, Address l, Exam t) {
        name = n;
        age = a;
        local = l;
        typeExam = t;
    }

    public void pReport() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Patient Address: ");
        local.aReport();
        System.out.println("Patient Exam: ");
        typeExam.eReport();
    }
}