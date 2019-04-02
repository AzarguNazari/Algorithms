public class MatrixMultiplication{
	
	// matrix multiplication
    public static int[][] matrixMultiplication(int[][] firstMatrix, int[][] secondMatrix){
        int[][] finalResult = new int[firstMatrix.length][firstMatrix.length];
        for(int x = 0; x < firstMatrix.length; x++){
            for(int y = 0; y < firstMatrix[x].length; y++){
                for(int i = 0; i < firstMatrix.length; i++){
                    finalResult[x][y] += firstMatrix[x][i] * secondMatrix[i][y];
                }
            }
        }
        return finalResult;
    }
	
}