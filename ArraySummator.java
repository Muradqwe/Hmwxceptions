package HMWRK2;

public class ArraySummator {
    public static final int SIZE = 4;


    public static int sum(String[][] arr) {
        if (arr.length != SIZE) throw new MyArraySizeException("только 4x4 массивы");
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y].length != SIZE) throw new MyArraySizeException("только 4x4 массивы!!!");
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
//
                    throw new MyArrayDataException(String.format("числовые данные в ячейке [%d][%d]", x + 1, y + 1));
                }
            }
        }
        System.out.println("Sum is " + sum);
        return sum;
    }

}




