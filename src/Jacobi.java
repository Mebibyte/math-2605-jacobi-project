import java.util.Arrays;
import java.util.Random;

import Jama.Matrix;

public class Jacobi {
	private double[][] array = new double[5][5];
	private static final Random rand = new Random();
	
	public void randomize() {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				array[i][j] = rand.nextDouble() * 50;
			}
			for (int j = 0; j < i; j++) {
				array[i][j] = array[j][i];
			}
		}
	}
	
	public void findLargestOffDiagonal() {
		int maxI = -1, maxJ = -1;
		double maxOff = -1;
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				if (Math.abs(array[i][j]) > maxOff) {
					maxI = i;
					maxJ = j;
					maxOff = Math.abs(array[i][j]);
				}
			}
		}
		System.out.println("Max Offset at: (" + (maxI + 1) + ", " + (maxJ + 1) + ") with value: " + maxOff);
		diagonalizeTwoByTwo(maxI, maxJ);
	}
	
	public void diagonalizeTwoByTwo(int i, int j) {
		double array2[][] = {{array[i][i], array[i][j]}, {array[j][i], array[j][j]}};
		for (int x = 0; x < 2; x++) {
			System.out.println(Arrays.toString(array2[x]));
		}
		Matrix A = new Matrix(array2);
		Matrix U = A.eig().getV();
		System.out.println("U:");
		for (int x = 0; x < 2; x++) {
			System.out.println(Arrays.toString(U.getArray()[x]));
		}
	}
	
	public double calculateOffset() {
		double ans = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i != j) {
					ans += array[i][j] * array[i][j];
				}
			}
		}
		return ans;
	}
	
	public double[][] getArray() {
		return array;
	}
	
	
	
    public static void main(String[] args) {
    	Jacobi jacobi = new Jacobi();
    	jacobi.randomize();
    	for (int x = 0; x < 5; x++) {
    		System.out.println(Arrays.toString(jacobi.array[x]));
    	}
    	jacobi.findLargestOffDiagonal();
    	System.out.println(jacobi.calculateOffset());
    }
}
