import java.util.Random;

import Jama.Matrix;

public class Jacobi {
	private double[][] array = new double[5][5];
	private static final Random rand = new Random();
	
	public void randomize() {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				array[i][j] = roundToDecimals((rand.nextDouble() * 20) - 10, 2);
			}
			for (int j = 0; j < i; j++) {
				array[i][j] = array[j][i];
			}
		}
	}
	
	public static double roundToDecimals(double d, int c) {
		int temp = (int)((d * Math.pow(10,c)));
		return (((double)temp) / Math.pow(10,c));
	}
	
	public void findLargestOffDiagonal() {
		int maxI = -1, maxJ = -1;
		double maxOff = -1;
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				if (i != j && Math.abs(array[i][j]) > maxOff) {
					maxI = i;
					maxJ = j;
					maxOff = Math.abs(array[i][j]);
				}
			}
		}
		diagonalizeTwoByTwo(maxI, maxJ);
	}
	
	public void diagonalizeTwoByTwo(int i, int j) {
		double array2[][] = {{array[i][i], array[i][j]}, {array[j][i], array[j][j]}};
		Matrix A = new Matrix(array2);
		Matrix U = A.eig().getV();
		Matrix G = new Matrix(new double[][]{{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 0, 0, 1}});
		G.set(i, i, U.get(0, 0));
		G.set(i, j, U.get(0, 1));
		G.set(j, i, U.get(1, 0));
		G.set(j, j, U.get(1, 1));
		Matrix B = G.transpose().times(new Matrix(array)).times(G);
		array = B.getArray();
		for(int i2 = 0; i2 < array.length; i2++) {
			for(int j2 = 0; j2 < array[0].length; j2++) {
				array[i2][j2] = roundToDecimals(array[i2][j2], 2);
			}
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

	public void findOffDiagonal() {
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (array[i][j] != 0) {
					diagonalizeTwoByTwo(i, j);
					return;
				}
			}
		}
	}
}
