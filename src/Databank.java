public class Databank {
    private Patient[] DB;
    private int index;

    public Databank() {
        DB = new Patient[5];
        index = 0;
    }

    public void insert(Patient p) {
        DB[index] = p;
        index++;
    }

    public void remove(Patient p) {
        DB[index] = p;
        index--;
    }

    public void printALL(){
        for(int i = 0; i < index; i++){
            DB[i].pReport();
        }
    }
}