//this is an interface with all the methods as instructed.
public interface FinancialAid {

	public boolean isFinancialAidEligible(boolean isFullTime);
	
	public String dependentOrIndependent(int age);
	
	public double scholarshipAmount(double gpa, boolean isFullTime);
	
	public double subsidizeLoanAmount(boolean isFullTime);

}
