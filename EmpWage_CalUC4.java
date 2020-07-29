public class EmpWage_CalUC4
{

		

		public static void main(String[] args)
		{
			final int IS_FULL_TIME=1;
		    final int IS_PART_TIME=2;
		    final int empRatePerHrs=20;
			int empHours=0;
			int empWage=0;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck)
			{
				case IS_FULL_TIME:
					empHours=8;
					break;
				case IS_PART_TIME:
					empHours=4;
					break;
				default:
					empHours=0;
					break;
			}
			empWage=empRatePerHrs*empHours;
			System.out.println("employee Wage is "+empWage);
		}

}
