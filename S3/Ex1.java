package S3;

//Реализовать алгоритм сортировки слиянием

public class Ex1 {
    private static void merge(int[] array, int lowIndex, int middleIndex, int highIndex) {
        int left = lowIndex;
        int right = middleIndex + 1;
        int[] tempArray = new int[highIndex - lowIndex + 1];
        int index = 0;
        while ((left <= middleIndex) && (right <= highIndex)) {
            if (array[left] < array[right]) {
                tempArray[index] = array[left];
                left++;
            } else {
                tempArray[index] = array[right];
                right++;
            }
            index++;
        }

        for (int i = left; i <= middleIndex; i++) {
            tempArray[index] = array[i];
            index++;
        }

        for (int i = right; i <= highIndex; i++) {
            tempArray[index] = array[i];
            index++;
        }

        for (int i = 0; i < tempArray.length; i++) {
            array[lowIndex + i] = tempArray[i];
        }
    }

    public static int[] mergeSortRecursive(int[] array, int lowIndex, int highIndex) {
        if (lowIndex + 1 <= highIndex) {
            int middle = (lowIndex + highIndex) / 2;
            mergeSortRecursive(array, lowIndex, middle);
            mergeSortRecursive(array, middle + 1, highIndex);
            merge(array, lowIndex, middle, highIndex);
        }
        return array;
    }
}
