public class EmpWage_Cal_WorkMonth
{

		

		public static void main(String[] args)
		{
			final int TOTAL_WORK_DAY=5;
			final int IS_FULL_TIME=1;
		    final int IS_PART_TIME=2;
		    final int empRatePerHrs=20;
			int empHours=0;
			int empTotalWage=0;
			int empWage=0;
			for (int day=1; day<=TOTAL_WORK_DAY; day++)
			{
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
			empTotalWage=empWage+empTotalWage;
			System.out.println("employee Wage is "+empWage);
			}
			System.out.println("employee TotalWage is "+empTotalWage);
		
	}

}
