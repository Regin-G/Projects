import java.util.*;
class Pattern10{
	static Scanner s = new Scanner(System.in);
public static void main(String [] args){
	System.out.println("Enter the value");
	int n =s.nextInt();
    for(int i = 1; i <= n; i++) {

            for(int j = i; j <= n; j++) {
				 System.out.print(j);
            }
            System.out.println();
        } 
        for(int i = n-1; i > 0; i--) {

            for(int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
}
}
