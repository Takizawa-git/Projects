public class FullTimeStaffHire extends StaffHire
{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour)
    {
        super(vacancyNumber,designation,jobType);//calling superclass conductor
        this.salary=salary;
        this.workingHour=workingHour;//giving value to the empty string
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
    }
    
    public void setSalary(int salary)//setter method
    {
        this.salary=salary;
    }
    public int getSalary()//getter method
    {
        return this.salary;
    }
    public void setworkingHour(int workingHour)//setter method
    {
        this.workingHour=workingHour;
    }
    public int getworkingHour()//getter method
    {
        return this.workingHour;
    }
    public void setstaffName(String staffName)//setter method
    {
        this.staffName=staffName;
    }
    public String getstaffName()//getter method
    {
        return this.staffName;
    }
    public void setjoiningDate(String joiningDate)//setter method
    {
        this.joiningDate=joiningDate;
    }
    public String getjoiningDate()//getter method
    {
        return this.joiningDate;
    }
    public void setqualfication(String qualification)//setter method
    {
        this.qualification=qualification;
    }
    public String getqualification()//getter method
    {
        return this.qualification;
    }
    public void setappointedBy(String appointedBy)//setter method
    {
        this.appointedBy=appointedBy;
    }
    public String getappointedBy()//getter method
    {
        return this.appointedBy;
    }
    public void setjoined(boolean joined)//setter method
    {
        this.joined=joined;
    }
    public boolean getjoined()//getter
    {
        return this.joined;
    }
    public int gerSalary() //method to set new salary
    {
       return this.salary;
    }
    
    public void workingHours(int new_workinghour) //method to set new working hour
    {
        this.workingHour=new_workinghour;
    }
    
    public void HirefulltimeStaff(String staffName, String joiningDate, String qualification, String appointedBy) //method defination for joined display
    {
        if (this.joined)
        {
            System.out.println("Employee already exists");
            System.out.println("Employee Details:");
            System.out.println("staffName="+getstaffName());
            System.out.println("joiningDate="+getjoiningDate());
            System.out.println("Qualification = " + getqualification());
            System.out.println("Appointed By = " + getappointedBy());
        }
        else
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
        }
    }
    
    public void display()  //display method
    {
        super.display();
        if (joined)
        {
            System.out.println("staffName"+getstaffName());
            System.out.println("salary"+getSalary());
            System.out.println("workingHour"+getworkingHour());
            System.out.println("joiningDate"+getjoiningDate());
            System.out.println("qualification"+getqualification());
            System.out.println("appointedBy"+getappointedBy());
        }
        else{
        System.out.println("No employee data");
        }
    }
}
