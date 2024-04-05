public class App {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date(12, "March", 2024);
        Date d2 = new Date(13, "March", 2024);
        Date d3 = new Date(25, "March", 2024);
        Exam e1 = new Exam("Blood Collect", 334, 50, d1);
        Exam e2 = new Exam("Tomography", 78, 375, d2);
        Exam e3 = new Exam("Eye Exam", 67, 78, d3);
        Address a1 = new Address("Olivia Flores", 45056876, 234);
        Address a2 = new Address("Frei Beijamin", 45455435, 14);
        Address a3 = new Address("Otavio Santos", 45056495, 4);
        Patient p1 = new Patient("Micael Jadson da Silva", 22, a1, e1);
        Patient p2 = new Patient("Frederico Mercurio", 45, a2, e2);
        Patient p3 = new Patient("Davi Boliche", 34, a3, e3);
        
        
        Databank DB = new Databank();

        DB.insert(p1);
        DB.insert(p2);
        DB.insert(p3);
        // DB.remove(p2);
        DB.printALL();

        
        
    }
}
