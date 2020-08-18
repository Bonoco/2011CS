import java.util.Random;

public class Grades {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int grades[] = new int[10];

        Random random = new Random();
        for (int i = 0; i < grades.length; ++i)
            grades[i] = 80 + random.nextInt(21);
        printArray(grades);

        double average = 0.0;
        for (int i = 0; i < grades.length; ++i)
            average += grades[i];
        average /= grades.length;

        System.out.println("Grade average is " + average);

        System.out.println("The following grades are above average: ");
        for (int grade : grades)
            if (grade > average)
                System.out.print(grade + " ");
        System.out.println();
    }

}
