package homework;

public class HW_02_Task_02 {
    public static void someCode() {
        int[] intArray = new int[]{2, 4, 8, 1, 5, 7};
        int d = 0;
        int index = 8;
        if (d == 0) {
            System.out.println("Denominator can not be zero.");
        } else if (intArray == null) {
            System.out.println("Array is null.");
        } else if (index < 0 || index >= intArray.length) {
            System.out.println("Index out of range.");
        } else {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}
