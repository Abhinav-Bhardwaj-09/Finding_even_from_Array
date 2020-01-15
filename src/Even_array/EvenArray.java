package Even_array;

public class EvenArray {
int k = 0;
public int[] even(int [] InitialArray) {
    int ARR [] = new int[InitialArray.length];
    for (int i = 0; i < InitialArray.length; i++) {
        if (InitialArray[i] % 2 == 0 && InitialArray[i] !=0 ){
            ARR[k] = InitialArray[i];
            k++;
        }
    }
    return ARR;
    }
}