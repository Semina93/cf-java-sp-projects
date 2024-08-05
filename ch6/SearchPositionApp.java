package gr.aueb.cf.ch6;

/**
 * Searches for an array elements and returns its position.
 * If it's not found returns -1.
 *
 */
public class SearchPositionApp {
    public static void main(String[] args) {
        final int EXCELLENT = 10;
        int[] grades = {6,3,8,9,1,10};
        int position = -1;

        for (int i =0; i < grades.length; i++){
            if(grades[i] == EXCELLENT){
                position = i;
                break;
            }
        }
        if(position == -1 ){
            System.out.println("Not found");
        }else {
            System.out.printf("The element %d was found %d\n", EXCELLENT, position + 1);
            System.out.printf("The value %d was found %d", grades[position], position + 1);

        }
    }
}
