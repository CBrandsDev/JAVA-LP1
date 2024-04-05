public class App {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date(12, "March", 2024);
        Exam e1 = new Exam("Blood collect", 334, 50, d1);
        Address a1 = new Address("H", 45055495, 4);
        Patient p1 = new Patient("Calil Macedo Brandão", 22, a1, e1);
        // 

        
        p1.pReport();
    }
}
