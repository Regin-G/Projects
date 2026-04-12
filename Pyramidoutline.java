import java .util.*;
class Pyramid{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args){
		System.out.println("Enter the value");
		int n = s.nextInt();
		for(int i =0;i<n;i++){
		for(int j =0;j<n;j++){
		if(i==0||j==0||j==2||i==n-1||i==j){
		System.out.print("* ");
		}
		else{
			System.out.println("  ");
		}
		}
		System.out.println();
		}
	}
}
		