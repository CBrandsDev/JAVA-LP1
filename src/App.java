// public class App {
//     public static void main(String[] args) throws Exception {
//         Date d1 = new Date(12, "March", 2024);
//         Date d2 = new Date(13, "March", 2024);
//         Date d3 = new Date(25, "March", 2024);
//         Exam e1 = new Exam("Blood Collect", 334, 50, d1);
//         Exam e2 = new Exam("Tomography", 78, 375, d2);
//         Exam e3 = new Exam("Eye Exam", 67, 78, d3);
//         Address a1 = new Address("Olivia Flores", 45056876, 234);
//         Address a2 = new Address("Frei Beijamin", 45455435, 14);
//         Address a3 = new Address("Otavio Santos", 45056495, 4);
//         Patient p1 = new Patient("Micael Jadson da Silva", 22, a1, e1);
//         Patient p2 = new Patient("Frederico Mercurio", 45, a2, e2);
//         Patient p3 = new Patient("Davi Boliche", 34, a3, e3);
        
        
//         Databank DB = new Databank();

//         DB.insert(p1);
//         DB.insert(p2);
//         DB.insert(p3);
//         // DB.remove(p2);
//         DB.printALL();

        
        
//     }
// }

public class App {
    public static void main(String[] args) {
        
        SAddress a1 = new SAddress("Paulin Pinho", 22);
        SAddress a2 = new SAddress("Jalin Rabey", 456);
        SAddress a3 = new SAddress("Tomas Aquino Rego", 31);
        Sellers s1 = new Sellers("Maia Carneiro", 34, a1);
        Sellers s2 = new Sellers("Morgana Brandão", 40, a2);
        Sellers s3 = new Sellers("Dante Santana Oliveira", 38, a3);
        Cars c1 = new Cars("Nissan Versa", 2024);
        Cars c2 = new Cars("Corsinha Classic", 2013);
        Cars c3 = new Cars("Nissan 350z", 2009);
        Store st1 = new Store("Maia Cars", s1, c1);
        Store st2 = new Store("Morgana Automobil", s2, c2);
        Store st3 = new Store("Dante's Machines", s3, c3);

        DB D = new DB();

        D.insert(st1);
        D.insert(st2);
        D.insert(st3);
        D.allReport();

        
    }

}
