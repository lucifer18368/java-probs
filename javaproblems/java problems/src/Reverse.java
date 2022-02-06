import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		int s;
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        s=str.length();
        for(int i=s;i>0;i--){
            System.out.print(str.charAt(i-1)); 
        } 

	}

}
