import java.util.*;
public class Charcount     
{    
     public static void main(String[] args) {    
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();    
        HashMap<Character, Integer> map = new HashMap<>();
        char[] C=str.toCharArray();
        for(char i : C ) {
        	if(map.containsKey(i)) {
        		map.put(i, map.get(i)+1);
        	}
        	 else {  
                 map.put(i, 1);  
             }  
        }
          System.out.println(map);
    } 
}
