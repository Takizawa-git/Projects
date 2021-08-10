public class StaffHire
{
    protected int vacancyNumber;
    protected String designation;
    protected String jobType;
    
    public StaffHire(int vacancyNumber,String designation,String jobType)
    {
        this.vacancyNumber=vacancyNumber;
        this.designation=designation;
        this.jobType=jobType;
    }
    public void setvacancyNumber(int vacancyNumber)//setter method
    {
        this.vacancyNumber=vacancyNumber;
    }
    public int getvacancyNumber()//getter method
    {
        return this.vacancyNumber;
    }
    public void setdesignation(String designation)//setter method
    {
        this.designation=designation;
    }
    public String getdesignation()//getter method
    {
        return this.designation;
    }
    public void setjobType(String jobType)//setter method
    {
        this.jobType=jobType;
    }
    public String getjobType()//getter method
    {
        return this.jobType;
    }
    public void display()
    {
        System.out.println("vacancyNumber="+getvacancyNumber());
        System.out.println("designation="+getdesignation());
        System.out.println("jobType="+getjobType());
    }
}
