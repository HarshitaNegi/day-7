import java.util.Scanner;
class typeca{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input First string: ");
		String x=sc.nextLine();
		System.out.print("Input Second string:");
		String y=sc.nextLine();
		int z=Integer.parseInt(x);
		int w=Integer.parseInt(y);
		int compare=z>w?z:w;
		System.out.print("Largest is:"+compare);
	}
}