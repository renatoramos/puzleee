public class CopyOfmatriz {

	public static void main(String[] args) {

		int[][] matriz = { {0,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int[] list = new int[(matriz.length * matriz[0].length) * 2 ];
		int cont = 0;

		System.out.println("\n A Matriz: \n");
		int x = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (matriz[linha][coluna] == 0) {
					list[x] = linha + 1;
					x++;
					list[x] = coluna + 1;
					x++;
				}
				System.out.printf(" %d ", matriz[linha][coluna]);
				cont++;
			}
			System.out.println();
		}

		for (int i = 0; i <= list.length - 1 && list[i] != 0; i = i + 2) {
				for (int y = 0; y < matriz.length; y++) {
					matriz[y][list[i + 1] - 1] = 0;
					matriz[list[i] - 1][y] = 0;
					cont++;
				}
		}

		System.out.println("\nA Matriz ficou : \n");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (matriz[linha][coluna] == 0) {
				}
				System.out.printf(" %d ", matriz[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println("\n Foram ultilizadas " + cont + " iterações");
	}
}
