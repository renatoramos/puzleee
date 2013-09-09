


public class ZerosInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{0,2,3,4}, {4,3,2,1},{1,4,2,3},{4,2,1,1}};
        int[][] found = new int[matrix.length * matrix[0].length][];
        int f = -1;
        int cont = 0 ;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
               if(matrix[i][j] == 0) {
                   found[++f] = new int[]{i, j};
               }
               cont++;
            }
        }
        for(f = 0; f < found.length && found[f] != null; f++) {
            for(int lineJ = 0; lineJ < matrix[found[f][0]].length; lineJ++) {
                matrix[found[f][0]][lineJ] = 0;
                cont++;
            }
            for(int lineI = 0; lineI < matrix.length; lineI++) {
                matrix[lineI][found[f][1]] = 0;
                cont++;
            }
        }
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format(" %s ",matrix[i][j]));
            }
            System.out.println();
        }
		System.out.println("\n Foram ultilizadas " + cont + " iterações");
    }
}