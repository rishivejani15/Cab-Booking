import java.util.*;
class Cab
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Press 1 for Day Booking");
		System.out.println("Press 2 for Night Booking");
		System.out.println("Press 3 for Full Booking");
		System.out.print("Choose an option: ");
		int option = sc.nextInt();
		int fare = 0;
		System.out.println("Welcome to Uber !!!");
		System.out.print("Enter distance in km: ");
		double distance = sc.nextDouble();
		switch(option)
		{
			case 1:
				System.out.print("Enter waiting time in min: ");
				int time1 = sc.nextInt();
				if (distance <= 1.5)
				{
					fare += 29;
				}
				else if (distance > 1.5)
				{
					fare += 29;
					distance -= 1.5;
					fare += (distance*10 )*2;
				}
				fare += time1*2;
				System.out.print("Total Fare is: " + fare);
				break;
			case 2:
				System.out.print("Enter waiting time in min: ");
				int time2 = sc.nextInt();
				if (distance <= 1.5)
				{
					fare += 35;
				}
				else if (distance > 1.5)
				{
					fare += 35;
					distance -= 1.5;
					fare += (distance*10)*3;
				}
				fare += time2*3;
				System.out.print("Total Fare is: " + fare);
				break;
			case 3:
				System.out.println("Press 1 for AC");
				System.out.println("Press 2 for NON - AC");
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:
						if (distance <= 200)
						{
							fare += 7000;
						}
						else if (distance > 200)
						{
							fare += 7000;
							distance -= 200	;
							fare += (distance*30);
						}		
						System.out.print("Total Fare is: " + fare);
						break;
					case 2:
						if (distance <= 200)
						{
							fare += 5000;
						}
						else if (distance > 200)
						{
							fare += 5000;
							distance -= 200	;
							fare += (distance*20);
						}
						System.out.print("Total Fare is: " + fare);
						break;
					
					default:
						System.out.println("Invalid Input !!!");
				}
				break;
			default:
				System.out.println("Invalid Input !!!");
		}
	}
}
