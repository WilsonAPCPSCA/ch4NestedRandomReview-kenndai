import java.util.Scanner;
public class headsOrTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many times do you wish to flip the coin?");
		int flips = in.nextInt();
		int count = 0;
		int h = 0;
		int t = 0;
		while (count<= flips)
			{
				if (Math.random()>0.5)
				{
					System.out.print("H");
					h++;
				}
				else 
				{
					System.out.print("T");
					t++;
				}
			count++;
			}
		System.out.println();
		System.out.println("You got" + h + " heads and" + t + " tails.");
	}
}
