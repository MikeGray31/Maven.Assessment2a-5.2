package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        if(startingIndex < 0 || endingIndex < 0){
            throw new IllegalArgumentException();
        }

        String[] result = new String[endingIndex - startingIndex];
        for(int i = 0; i <result.length; i++){
            result[i] = arrayToBeSpliced[i + startingIndex];
        }
        return result;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        if(startingIndex > arrayToBeSpliced.length - 1){
            throw new IllegalArgumentException();
        }

        String[] result = new String[arrayToBeSpliced.length - startingIndex];
        for(int i = 0; i <result.length; i++){
            result[i] = arrayToBeSpliced[i + startingIndex];
        }
        return result;
    }
}
