import java.util.HashMap;

/**
 * Created by e13056 on 3/23/17.
 */
public class SparseMatrix {

    private int size;
    private HashMap<Integer,Integer> map = new HashMap<>();

    public SparseMatrix(){}

    // create an empty square matrix of given size
    public void createEmptyMatrix(int size){
        
        this.size = size;
        

    }

    // put A[i][j] = 1
    public void set(int i, int j){
        map.put(i*size + j, 1);
    }

    // return value at A[i][j]
    public int get(int i, int j){
        
        
        return map.get(i*size + j);
    }

}
