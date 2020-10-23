/**
 * Desc:A java program that shows parking system of cars in 5 floor parking space 
 * each floor having different capacity.
 * @author Suparna Arya
 * Date:23/11/2020
 *
 */
import java.util.Scanner;
public class CarParkingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CarDetails parkSpace[][]= new CarDetails[5][];
		parkSpace[0]=new CarDetails[4];
		parkSpace[1]=new CarDetails[3];
		parkSpace[2]=new CarDetails[3];
		parkSpace[3]=new CarDetails[2];
		parkSpace[4]=new CarDetails[4];
		
		
	
		int s=0;
		while(s==0)
		{
			System.out.println("1. Park Car");
			System.out.println("2. Get Car");
			System.out.println("3. Show Available Parking Slot");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			int num=sc.nextInt();
			if(num==1)
			{
				System.out.println("Enter owner name");
				String ownerName=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the car registration number");
				String car_reg_no=sc.nextLine();
				CarDetails cd=new CarDetails(ownerName,car_reg_no);	
				parkCar(parkSpace,cd);

			}
			else if(num==2)
			{
				
         		System.out.println("Enter the car registration number");
				String car_reg=sc.nextLine();
				sc.nextLine();
				getCar(parkSpace,car_reg);
			}
			else if(num==3)
			{
				int slots=showAvailableParkingSlot(parkSpace);
				System.out.println("The number of available slots are:"+slots);
			}		
			else
			{
				System.exit(0);
			}
		}
	}


	private static void parkCar(CarDetails parkSpace[][],CarDetails car) {
		// TODO Auto-generated method stub		
		int c=0,i,j;		
		for(i=0;i<parkSpace.length;i++)
		{
			for(j=0;j<parkSpace[i].length;j++)
			{
				if(parkSpace[i][j]==null)
				{
					parkSpace[i][j]=car;
					c=1;
					break;
				}
			}
			if(c==1)
			{
				break;
			}
				
		}
	}

	private static int showAvailableParkingSlot(CarDetails parkSpace[][]) {
		// TODO Auto-generated method stub
		int c=0;
		for(int i=0;i<parkSpace.length;i++)
		{
			for(int j=0;j<parkSpace[i].length;j++)
			{
				if(parkSpace[i][j]==null)
					{
					c++;
					}
			}
		}
		
		return c;
		}

	private static void getCar(CarDetails parkSpace[][],String car_reg)
	{
		
		// TODO Auto-generated method stub
	outer:for(int i=0;i<parkSpace.length;i++)
		{
			for(int j=0;j<parkSpace[i].length;j++)
			{
				if(parkSpace[i][j]!=null)
				{ 
					CarDetails cars=parkSpace[i][j];
					String carno=cars.displayCarReg();
					if(car_reg.equalsIgnoreCase(carno))
					{
						System.out.println("There is a Car parked in!!!");
					}
					parkSpace[i][j]=null;
					break outer;				
				}
				else {
					System.out.println("There is a Car parked in!!!");
				}
			}
				
		}
	}

}
