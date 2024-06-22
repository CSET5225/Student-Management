public class sortAlgorithms {
    public static void bubbleSortByID(Student[] arr, int size) {
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j].ID > arr[j + 1].ID) {
                    // Swap arr[j] and arr[j+1]
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSortByName(Student[] arr, int size) {
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j].name.compareTo(arr[j + 1].name) > 0) {
                    // Swap arr[j] and arr[j+1]
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSortByAge(Student[] arr, int size) {
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                int age1 = Integer.parseInt(String.valueOf(arr[j].age));
                int age2 = Integer.parseInt(String.valueOf(arr[j + 1].age));
                if (age1 > age2) {
                    // Swap arr[j] and arr[j+1]
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSortByGrade(Student[] arr, int size) {
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j].grade.compareTo(arr[j + 1].grade) > 0) {
                    // Swap arr[j] and arr[j+1]
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
