package algorithms;

public class Traversal {
	public static void printSimple(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printReverse(int[][] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[0].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printZigzag(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int dir = i % 2;
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j + (arr[0].length - 1 - 2 * j) * dir] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printSnail(int[][] arr) {
		int x = -1, y = 0;
		int d = 1;
		int lenX = arr[0].length;
		int lenY = arr.length;
		int loop = lenX < lenY ? lenX : lenY;

		while (true) {
			for (int i = 0; i < lenX; i++) {
				x = x + d;
				System.out.print(arr[y][x] + " ");
			}
			System.out.println();

			lenX--;
			lenY--;
			loop--;
			if (loop == 0)
				break;

			for (int i = 0; i < lenY; i++) {
				y = y + d;
				System.out.print(arr[y][x] + " ");
			}
			System.out.println();

			d = d > 0 ? -1 : 1;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 } };

		System.out.println("printSimple");
		printSimple(arr);
		System.out.println("printReverse");
		printReverse(arr);
		System.out.println("printZigzag");
		printZigzag(arr);
		System.out.println("printSimple");
		printSimple(arr);
		System.out.println("printSnail");
		printSnail(arr);
		;
	}
}
