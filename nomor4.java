package matrix;
public class nomor4 {
    public static void main(String[] args) {
        int [][] A = {
            {10,20,30},
            {40,50,60}
        };
        int tranpose [][] = new int[3][2];
        for (int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                tranpose[j][i]= A[i][j];
            }
        }
        
        for (int i=0; i<A[0].length; i++){
            for (int j=0; j<A.length; j++){
                System.out.print(tranpose[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
    

