package dpdev.homework_2_copyArray;

public class Copy {

    public int[] copyArrayOfRange(int[] in, int leftBound, int rightBound){
        if (in.length == 0) return new int[0];
        int size = 0;
        int[] array;
        for (int element: in) {
            if (element >= leftBound && element <= rightBound){
                size++;
            }
        }
        if (size == 0) return new int[0];
        else {
            array = new int[size];
            int j = 0;
            for (int i = 0; i < in.length; i++) {
                if (in[i] >= leftBound && in[i] <= rightBound){
                    array[j] = in[i];
                    j++;
                }
            }
        }
        return array;
    }
}
