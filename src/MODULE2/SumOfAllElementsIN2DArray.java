package MODULE2;

public class SumOfAllElementsIN2DArray {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4,},{2,3,4,5,},{3,4,5,6},{4,5,6,7}};
        int sum=0;

        for(int row=0;row< array.length;row++){
            for(int column=0;column<array[row].length;column++){
                 sum+=array[row][column];
            }
            System.out.println(sum);
        }

    }
}
