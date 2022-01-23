import java.util.Arrays;

public class Task1Lesson3 {


        public static void main(String[] args) {
            String[] array = {"яблоко", "груша", "киви", "манго", "банан"};
        }



        public static void taskLesson(Object[] array, int index1, int index2) {
            Object temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
            printArray(array);
        }

        private static void printArray(Object[] array) {
            System.out.println(Arrays.toString(array));
        }
    }
