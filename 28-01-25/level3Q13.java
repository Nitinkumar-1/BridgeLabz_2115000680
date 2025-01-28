import java.util.Random;
public class level3Q13 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] matrix1 = generateRandomMatrix(rows, cols);
        int[][] matrix2 = generateRandomMatrix(rows, cols);
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);
        System.out.println("\nAddition of matrices:");
        displayMatrix(addMatrices(matrix1, matrix2));
        System.out.println("\nSubtraction of matrices:");
        displayMatrix(subtractMatrices(matrix1, matrix2));
        System.out.println("\nMultiplication of matrices:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));
        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));
        System.out.println("\nDeterminant of Matrix 1 (3x3): " + determinant(matrix1));
        System.out.println("\nInverse of Matrix 1 (3x3):");
        displayMatrix(inverse(matrix1));    }
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);  // Random values between 0 and 9
            }
        }
        return matrix;
    }
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int common = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    public static int determinant(int[][] matrix) {
        int det = 0;
        if (matrix.length == 2) {
            det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else if (matrix.length == 3) {
            det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        return det;
    }
    public static double[][] inverse(int[][] matrix) {
        double[][] inverse = new double[matrix.length][matrix[0].length];
        int det = determinant(matrix);
        if (det != 0 && matrix.length == 2) {
            int temp = matrix[0][0];
            matrix[0][0] = matrix[1][1];
            matrix[1][1] = temp;
            matrix[0][1] *= -1;
            matrix[1][0] *= -1;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    inverse[i][j] = (double) matrix[i][j] / det;
                }
            }
        }
        if (det == 0) {
            System.out.println("Inverse cannot be found. Determinant is 0.");
        }
        return inverse;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%.2f", matrix[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
