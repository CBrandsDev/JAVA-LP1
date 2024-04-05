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
    
    public void remove(Patient p){
        for(int i = 0; i < index; i++){
            if(DB[i] == p){
                DB[i] = DB[index-1];
                DB[index-1] = null;
                index--;
            }
        }
    }

    public void printALL(){
        for(int i = 0; i < index; i++){
            DB[i].pReport();
        }
    }
}