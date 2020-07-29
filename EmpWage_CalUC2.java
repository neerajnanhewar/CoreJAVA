public class EmpWage_CalUC2
{
		public static void main(String[] args)
		{
			int IS_FULL_TIME=1;
			int empRatePerHrs=20;
			int empHours=0;
			int empWage=0;
			double empCheck=Math.floor(Math.random()*10)%2;
			if(empCheck == IS_FULL_TIME)
			{
				empHours=8;
			}else
			{
				empHours=0;
			}
			empWage=empRatePerHrs*empHours;
			System.out.println("employee Wage is "+empWage);
		}

}
