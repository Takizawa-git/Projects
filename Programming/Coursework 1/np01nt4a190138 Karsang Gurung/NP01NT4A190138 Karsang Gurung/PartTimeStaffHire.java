public class PartTimeStaffHire extends StaffHire
{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

    public PartTimeStaffHire(int vacancyNumber,String designation,String jobType,int salary,
    int workingHour,int wagesPerHour, String shifts)
    {
        super(vacancyNumber,designation,jobType);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.shifts="";
        this.joined=false;
        this.terminated=false;
    }
    public void setworkingHour(int workingHour)//setter method
    {
        this.workingHour=workingHour;
    }
    public int getworkingHour()//getter Method
    {
        return this.workingHour=workingHour;
    }
    public void setwagesPerHour(int wagesPerHour)//setter method
    {
        this.wagesPerHour=wagesPerHour;
    }
    public int getwagesPerHour()//getter method
    {
        return this.wagesPerHour=wagesPerHour;
    }
    public void setstaffName(String staffName)//setter method
    {
        this.staffName=staffName;
    }
    public String getstaffName()//getter method
    {
        return this.staffName=staffName;
    }
    public void setjoiningDate(String joiningDate)//setter method
    {
        this.joiningDate=joiningDate;
    }
    public String getjoiningDate()//getter method
    {
        return this.joiningDate=joiningDate;
    }
    public void setqualification(String qualification)//setter method
    {
        this.qualification=qualification;
    }
    public String getqualification()//getter method
    {
        return this.qualification=qualification;
    }
    public void setappointedBy(String appointedBy)//setter method
    {
        this.appointedBy=appointedBy;
    }
    public String getappointedBy()//getter method
    {
        return this.appointedBy;
    }
    public void setshifts(String shifts)//setter method
    {
        this.shifts=shifts;
    }
    public String getshifts()//getter method
    {
        return this.shifts=shifts;
    }
    public void setjoined(boolean joined)//setter method
    {
        this.joined=joined;
    }
    public boolean getjoined()//getter method
    {
        return this.joined;
    }
    public void setterminated(boolean terminated)//setter method
    {
        this.terminated=terminated;
    }
    public boolean getterminated()//getter method
    {
        return this.terminated;
    }
    
    public void workingShift(String newShifts) //method to set new working shifts
    {
        if (joined==false)
        {
            this.shifts=shifts;
        }
        else
        {
        System.out.println("Staff"+getstaffName()+"is already hired");
        }
    }
    
    public void PartTimeStaffHire(String staffName, String joiningDate, String qualification, String appointedBy) //method defination for joined display
    {
        if (joined)
        {
            System.out.println("staffName"+getstaffName());
            System.out.println("joiningDate"+getjoiningDate());
        }
        else
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
            this.terminated=false;
        }
    }
    
    public void terminateStaff() //method for terminating staff
    {
        if (terminated)
        {
            System.out.println("The staff is already terminated");
        }
        else
        {
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";
            this.joined=false;
            this.terminated=true;
        }
    }
    
    public int incomePerDay() //method for income per day
    {
        int incomePerDay=(wagesPerHour*workingHour);
        return incomePerDay;
    }
    
    public void display() //display method
    {
        super.display();
        if (joined)
        {
            System.out.println("staffName="+getstaffName());
            System.out.println("wagesPerHour="+getwagesPerHour());
            System.out.println("workingHour="+getworkingHour());
            System.out.println("joiningDate="+getjoiningDate());
            System.out.println("qualification="+getqualification());
            System.out.println("appointedBy="+getappointedBy());
            System.out.println("incomePerDay="+incomePerDay());
        }
    } 
}
