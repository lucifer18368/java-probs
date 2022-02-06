import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		int i,j;
		 Scanner sc=new Scanner(System.in);
		 int row = sc.nextInt();  
		 int column = sc.nextInt();  
		 int matrix[][] = new int[row][column]; 
		 for(i = 0; i < row; i++)  
		    {  
		        for(j = 0; j < column; j++)   
		            {  
		            matrix[i][j] = sc.nextInt();    
		            }  
		    } 
		int transpose[][]=new int[column][row];
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++)
			{
				transpose[i][j]=matrix[j][i];
			}
		}
		for(i=0;i<column;i++) {
			for(j=0;j<row;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
