public class DB {
    private Store[] D;
    private int index;

    public DB() {
        D = new Store[3];
        index = 0;
    }

    public void insert(Store s) {
        D[index] = s;
        index++;
    }

    public void remove(Store s) {
        for(int i = 0; i < index; i++) {
            if(D[i] == s) {
               D[i] = D[index - 1];
               D[index - 1] = null;
               index--; 
            }
        }
    }
    public void allReport() {
        for(int i = 0; i < index; i++) {
            D[i].sReport();
        }
    }
}
