public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 6, 123, 1, 1, 3};
        int count = uniqueCount(array);
        System.out.println("Количество различных элементов: " + count);
    }

    public static int uniqueCount(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            boolean unicCheck = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    unicCheck = false;
                    break;
                }
            }
            if (unicCheck) {
                counter++;
            }
        }
        return counter;
    }
}

