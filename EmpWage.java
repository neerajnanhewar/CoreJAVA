class EmpWage {
 public static void main(String[] arg){
	int IS_FULL_TIME = 1;
	double empCheck = Math.floor(Math.random()*10) % 2;
		if (empCheck == IS_FULL_TIME){
			System.out.println("Emp is present");
			System.out.println(empCheck);}
		else{
				System.out.println(empCheck);
				System.out.println("Emp is Abscent");
			}
	}
}
