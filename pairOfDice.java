import java.util.Scanner;
import java.util.Random;
public class pairOfDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rand = new Random(); 
		System.out.println("How many times will you toss the dice?");
		int tosses = in.nextInt();
		int count = 1; 
		int sum = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;	
		int nine = 0;
		int ten = 0;		
		int elev = 0;
		int twel = 0;
		while (count <= tosses)
			{
				int die1 = rand.nextInt((6 - 1) + 1) + 1;
				int die2 = rand.nextInt((6 - 1) + 1) + 1;
				sum = (die1 + die2);
				System.out.print(sum + " ");
				count ++;
				if (sum == 2)
					{
						two++;
					}
				if (sum == 3)
					{
						three++;
					}
				if (sum == 4)
					{
						four++;
					}
				if (sum == 5)
					{
						five++;
					}
				if (sum == 6)
					{
						six++;
					}
				if (sum == 7)
					{
						seven++;	
					}
				if (sum == 8)
					{
						eight++;
					}
				if (sum == 9)
					{
						nine++;
					}
				if (sum == 10)
					{
						ten++;
					}
				if (sum == 11)
					{
						elev++;
					}
				if (sum == 12)
					{
						twel++;
					}
			}
		System.out.println();
		System.out.print("2: ");
		for (int a = 0; a <= two; a++)
			{
				System.out.print("*");
			}
		System.out.println();
		System.out.print("3: ");
		for (int b = 0; b <= three; b++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("4: ");	
		for (int c = 0; c <= four; c++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("5: ");
		for (int d = 0; d <= five; d++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("6: ");
		for (int e = 0; e <= six; e++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("7: ");
		for (int f = 0; f <= seven; f++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("8: ");
		for (int g = 0; g <= eight; g++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("9: ");
		for (int h = 0; h <= nine; h++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("10: ");
		for (int i = 0; i <= ten; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("11: ");
		for (int j = 0; j <= elev; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("12: ");
		for (int k = 0; k <= twel; k++)
		{
			System.out.print("*");
		}
		
		
	}

}
