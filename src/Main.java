public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] animals = new int[3];
        animals[0] = 1;
        animals[1] = 2;
        animals[2] = 3;

        double[] weights = {1.57, 7.654, 9.986};

        int[] birds = {3, 5, 7, 9};

        // Задача 2

        for (int i = 0; i < animals.length; i++) {
            if (i < (animals.length-1)) {
                System.out.print(animals[i] + ", ");
            } else {
                System.out.println(animals[i]);
            }
        }

        for (int i = 0; i < weights.length; i++) {
            if (i < (weights.length-1)) {
                System.out.print(weights[i] + ", ");
            } else {
                System.out.println(weights[i]);
            }
        }

        for (int i = 0; i < birds.length; i++) {
            if (i < (birds.length-1)) {
                System.out.print(birds[i] + ", ");
            } else {
                System.out.println(birds[i]);
            }
        }

        // Задача 3

        System.out.println();
        for (int i = animals.length; i > 0; i--) {
            if (i > 1) {
                System.out.print(animals[i - 1] + ", ");
            } else {
                System.out.print(animals[i - 1]);
            }
        }

        System.out.println();
        for (int i = weights.length; i > 0; i--) {
            if (i > 1) {
                System.out.print(weights[i - 1] + ", ");
            } else {
                System.out.print(weights[i - 1]);
            }
        }

        System.out.println();
        for (int i = birds.length; i > 0; i--) {
            if (i > 1) {
                System.out.print(birds[i - 1] + ", ");
            } else {
                System.out.print(birds[i - 1]);
            }
        }
    }
}