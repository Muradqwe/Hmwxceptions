package HMWRK2;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "4", "5"},
                {"5", "7", "4", "3"},
                {"49", "11", "-7", "-8"}};

        String[][] arr2 = new String[][]{
                {"4", "8", "14", "8", "13"},
                {"9", "8", "2", "54"},
                {"98", "7", "4", "tr", "24"},
                {"59", "1", "-33", "-80"}};

        String[][] arr3 = new String[][]{
                {"4", "8", "14", "10"},
                {"9", "8", "4", "54"},
                {"98", "5", "4", "5"},
                {"9", "10", "-47", "-20"}};


        try {
            ArraySummator.sum(arr1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            ArraySummator.sum(arr2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ArraySummator.sum(arr3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

