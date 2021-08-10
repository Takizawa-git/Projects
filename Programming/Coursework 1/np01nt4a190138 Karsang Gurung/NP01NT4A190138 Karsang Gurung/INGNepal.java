import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.util.*;
//main class for GUI of staffHire
public class INGNepal implements ActionListener
{   
    //all preparing the instances variables
    ArrayList<StaffHire> staffAL = new ArrayList<StaffHire>();
    
    private int formNo;
    
    //Frames of GUI
    private JFrame mainFrame, vacancyFrame, hirePTF, hireFTF, terminateF;
    
    //Panel of gui
    private JPanel panel;
    
    //Buttons
    private JButton addVacancy, hirePTB, hireFTB, displayPTB, displayFTB, terminateB, exitB, clearB;
    
    //common labels for GUI
    private JLabel title, vnLabel;
    
    //Labels for add vacancy
    private JLabel dLabel, jTLabel, workHLabel, ftLabel, salaryLabel, ptLabel, wphLabel, shiftLabel;
    
    //Text fields for add vacancy
    private JTextField vNumText, designationText, workHText, salaryText, wphText;
    
    //ComboBox for add Vacacncy
    private JComboBox jTypeComboBox, shiftComboBox;
    
    //Buttons for Add vacancy
    private JButton returnB1, addVacancyFTB, addVacancyPTB;
    
    //Labels for Appointing Full Time Staff
    private JLabel ftsLabel, snftsLabel, jdftsLabel, qftsLabel, abftsLabel;
    
    //Text fields for Appointing Full Time Staff
    private JTextField vnftsText, snftsText, jdftsText, qftsText, abftsText;
    
    //Buttons for Appointing Full Time Staff
    private JButton returnB3, ftsAppointB;
    
    //Labels for Appointing Part Time Staff
    private JLabel ptsLabel, snptsLabel, jdptsLabel, qptsLabel, abptsLabel;
    
    //Text fields for Appointing Part Time Staff
    private JTextField vnptsText, snptsText, jdptsText, qptsText, abptsText;
    
    //Buttons for Appointing Part Time Staff
    private JButton  returnB2, ptsAppointB;
    
    //Labels for Terminate Syaff PartTime
    private JLabel terminateLabel;
    
    //Text Fields for Terminate Staff PartTime
    private JTextField vnTerminateText;
     
    //Button for Terminate Staff Part Time
    private JButton  returnB4, terminateStaffB;
    
    //Fonts
    private Font titleFont = new Font("Times New Roman", Font.BOLD, 25);
    private Font F = new Font("Times New Roman", Font.BOLD, 15);
    
    FullTimeStaffHire ftsObj;
    PartTimeStaffHire ptsObj;
    //main form
    public void form()
    {
        //Main frame or the first frame
        mainFrame = new JFrame();
        mainFrame.setBounds(0, 0, 460, 270);
        mainFrame.setResizable(true);
        
        //panel for the main frame
        panel = new JPanel();
        panel.setLayout(null);
        
        //The title for the frame
        title = new JLabel();
        title.setText("StaffHire Registration Form");
        title.setBounds(70, 10, 500, 50);
        title.setFont(titleFont);
        panel.add(title);
        
        //button for adding vacancy number
        addVacancy = new JButton();
        addVacancy.setText("Add Vacancy");
        addVacancy.setBounds(20, 70, 410, 30);
        addVacancy.addActionListener(this);
        panel.add(addVacancy);
        
        //button for hiring PartTime staff
        hirePTB = new JButton();
        hirePTB.setText("Hire PartTime");
        hirePTB.setBounds(20, 110, 200, 30);
        hirePTB.addActionListener(this);
        panel.add(hirePTB);
        
        //button for hiring FullTime Staff
        hireFTB = new JButton();
        hireFTB.setText("Hire FullTime");
        hireFTB.setBounds(230, 110, 200, 30);
        hireFTB.addActionListener(this);
        panel.add(hireFTB);
        
        //button for displaying PartTime Staff
        displayPTB = new JButton();
        displayPTB.setText("Display PartTime Staff");
        displayPTB.setBounds(20, 150, 200, 30);
        displayPTB.addActionListener(this);
        panel.add(displayPTB);
        
        //button for displaying FullTime Staff
        displayFTB = new JButton();
        displayFTB.setText("Display FullTime Staff");
        displayFTB.setBounds(230, 150, 200, 30);
        displayFTB.addActionListener(this);
        panel.add(displayFTB);
        
        //Button to terminate Staff
        terminateB = new JButton();
        terminateB.setText("Terminate Staff");
        terminateB.setBounds(20, 190, 200, 30);
        terminateB.addActionListener(this);
        panel.add(terminateB);
        
        //buttonn to exit from the GUI
        exitB = new JButton();
        exitB.setText("Exit");
        exitB.setBounds(230, 190, 200, 30);
        exitB.addActionListener(this);
        panel.add(exitB);
        
        //mainframe codes
        mainFrame.setVisible(true);
        mainFrame.add(panel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //add Vacancyform method
    public void vacancyForm()
    {
        //Add vacancy Frame
        formNo = 1;
        
        vacancyFrame = new JFrame();
        vacancyFrame.setBounds(0, 0, 380, 500);
        vacancyFrame.setResizable(true);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        title = new JLabel();
        title.setText("--Vacancy Form--");
        title.setBounds(85, 10, 350, 50);
        title.setFont(titleFont);
        panel.add(title);
        
        vnLabel = new JLabel();
        vnLabel.setText("Vacancy Number:");
        vnLabel.setBounds(30, 80, 150, 20);
        vnLabel.setFont(F);
        panel.add(vnLabel);
        
        vNumText = new JTextField();
        vNumText.setText("");
        vNumText.setBounds(155, 78, 170, 20);
        panel.add(vNumText);
        
        dLabel = new JLabel();
        dLabel.setText("Designation:");
        dLabel.setBounds(68, 110, 100, 20);
        dLabel.setFont(F);
        panel.add(dLabel);
        
        designationText = new JTextField();
        designationText.setText("");
        designationText.setBounds(155, 108, 170, 20);
        panel.add(designationText);
        
        jTLabel = new JLabel();
        jTLabel.setText("Job Type:");
        jTLabel.setBounds(85, 140, 100, 20);
        jTLabel.setFont(F);
        panel.add(jTLabel);
        
        jTypeComboBox = new JComboBox();
        jTypeComboBox.setBounds(155, 138, 170, 20);
        jTypeComboBox.addItem("Full Time");
        jTypeComboBox.addItem("Part Time");
        panel.add(jTypeComboBox);
        
        workHLabel = new JLabel();
        workHLabel.setText("WorkHour Per Day:");
        workHLabel.setBounds(29, 170, 150, 20);
        workHLabel.setFont(F);
        panel.add(workHLabel);
        
        workHText = new JTextField();
        workHText.setText("");
        workHText.setBounds(155, 168, 170, 20);
        panel.add(workHText);
        
        ftLabel = new JLabel();
        ftLabel.setText("--->For FullTime Staff Hire only:");
        ftLabel.setBounds(30, 200, 300, 30);
        ftLabel.setFont(F);
        panel.add(ftLabel);
        
        salaryLabel = new JLabel();
        salaryLabel.setText("Salary:");
        salaryLabel.setBounds(54, 230, 70, 20);
        salaryLabel.setFont(F);
        panel.add(salaryLabel);
        
        salaryText = new JTextField();
        salaryText.setText("");
        salaryText.setBounds(125, 229, 200, 20);
        panel.add(salaryText);
        
        ptLabel = new JLabel();
        ptLabel.setText("--->For PartTime Staff Only");
        ptLabel.setBounds(30, 260, 300, 30);
        ptLabel.setFont(F);
        panel.add(ptLabel);
        
        wphLabel = new JLabel();
        wphLabel.setText("Wages Per Hour:");
        wphLabel.setBounds(54, 290, 150, 20);
        wphLabel.setFont(F);
        panel.add(wphLabel);
        
        wphText = new JTextField();
        wphText.setText("");
        wphText.setBounds(175, 289, 150, 20);
        panel.add(wphText);
        
        shiftLabel = new JLabel();
        shiftLabel.setText("Shift:");
        shiftLabel.setBounds(133, 320, 70, 20);
        shiftLabel.setFont(F);
        panel.add(shiftLabel);
        
        shiftComboBox = new JComboBox();
        shiftComboBox.setBounds(175, 318, 120, 20);
        shiftComboBox.addItem("Morning");
        shiftComboBox.addItem("Day");
        shiftComboBox.addItem("Night");
        panel.add(shiftComboBox);
        
        addVacancyFTB = new JButton();
        addVacancyFTB.setText("Add FullTime Staff");
        addVacancyFTB.setBounds(30, 350, 150, 30);
        addVacancyFTB.addActionListener(this);
        panel.add(addVacancyFTB);
        
        addVacancyPTB = new JButton();
        addVacancyPTB.setText("Add PartTime Staff");
        addVacancyPTB.setBounds(185, 350, 150, 30);
        addVacancyPTB.addActionListener(this);
        panel.add(addVacancyPTB);
        
        returnB1 = new JButton();
        returnB1.setText("|<");
        returnB1.setBounds(30, 400, 50, 30);
        returnB1.addActionListener(this);
        panel.add(returnB1);
        
        clearB = new JButton();
        clearB.setText("Clear");
        clearB.setBounds(265, 400, 70, 30);
        clearB.addActionListener(this);
        panel.add(clearB);
        
        vacancyFrame.setVisible(true);
        vacancyFrame.add(panel);
        vacancyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void partTimeForm()
    {
        //Hire Part Time Frame
        formNo = 3;
        hirePTF = new JFrame();
        hirePTF.setBounds(0, 0, 560, 280);
        hirePTF.setResizable(true);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        ptsLabel = new JLabel();
        ptsLabel.setText("Part Time Staff");
        ptsLabel.setBounds(170, 5, 250, 30);
        ptsLabel.setFont(titleFont);
        panel.add(ptsLabel);
        
        vnLabel = new JLabel();
        vnLabel.setText("Vacancy Number:");
        vnLabel.setBounds(30,65,140,20);
        vnLabel.setFont(F);
        panel.add(vnLabel);
        
        vnptsText = new JTextField();
        vnptsText.setText("");
        vnptsText.setBounds(160,64,70,20);
        panel.add(vnptsText);
        
        snptsLabel = new JLabel();
        snptsLabel.setText("Staff Name:");
        snptsLabel.setBounds(30,105,120,20);
        snptsLabel.setFont(F);
        panel.add(snptsLabel);
        
        snptsText = new JTextField();
        snptsText.setText("");
        snptsText.setBounds(130,104,130,20);
        panel.add(snptsText);
        
        jdptsLabel = new JLabel();
        jdptsLabel.setText("Joinning Date:");
        jdptsLabel.setBounds(280,105,150,20);
        jdptsLabel.setFont(F);
        panel.add(jdptsLabel);
        
        jdptsText = new JTextField();
        jdptsText.setText("");
        jdptsText.setBounds(385,104,130,20);
        panel.add(jdptsText);
        
        JLabel qptsLabel = new JLabel();
        qptsLabel.setText("Qualification:");
        qptsLabel.setBounds(30,145,150,20);
        qptsLabel.setFont(F);
        panel.add(qptsLabel);
        
        qptsText = new JTextField();
        qptsText.setText("");
        qptsText.setBounds(130,144,130,20);
        panel.add(qptsText);
        
        abptsLabel = new JLabel();
        abptsLabel.setText("Appointed By:");
        abptsLabel.setBounds(280,145,150,20);
        abptsLabel.setFont(F);
        panel.add(abptsLabel);
        
        abptsText = new JTextField();
        abptsText.setText("");
        abptsText.setBounds(385,144,130,20);
        panel.add(abptsText);
        
        returnB2 = new JButton();
        returnB2.setText("|<");
        returnB2.setBounds(30, 190, 80, 30);
        returnB2.addActionListener(this);
        panel.add(returnB2); 
        
        clearB = new JButton();
        clearB.setText("Clear");
        clearB.setBounds(215, 190, 100, 30);
        clearB.addActionListener(this);
        panel.add(clearB);
        
        ptsAppointB = new JButton();
        ptsAppointB.setText("Appoint");
        ptsAppointB.setBounds(415, 190, 100, 30);
        ptsAppointB.addActionListener(this);
        panel.add(ptsAppointB);
        
        hirePTF.setVisible(true);
        hirePTF.add(panel);
        hirePTF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void fullTimeForm()
    {
        //Hire Full Time Frame
        formNo = 2;
        
        hireFTF = new JFrame();
        hireFTF.setBounds(0, 0, 560, 280);
        hireFTF.setResizable(true);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        ftsLabel = new JLabel();
        ftsLabel.setText("Full Time Staff");
        ftsLabel.setBounds(170, 5, 250, 30);
        ftsLabel.setFont(titleFont);
        panel.add(ftsLabel);
        
        vnLabel = new JLabel();
        vnLabel.setText("Vacancy Number:");
        vnLabel.setBounds(30,65,140,20);
        vnLabel.setFont(F);
        panel.add(vnLabel);
        
        vnftsText = new JTextField();
        vnftsText.setText("");
        vnftsText.setBounds(160,64,70,20);
        panel.add(vnftsText);
        
        snftsLabel = new JLabel();
        snftsLabel.setText("Staff Name:");
        snftsLabel.setBounds(30,105,120,20);
        snftsLabel.setFont(F);
        panel.add(snftsLabel);
        
        snftsText = new JTextField();
        snftsText.setText("");
        snftsText.setBounds(130,104,130,20);
        panel.add(snftsText);
        
        jdftsLabel = new JLabel();
        jdftsLabel.setText("Joining Date:");
        jdftsLabel.setBounds(280,105,150,20);
        jdftsLabel.setFont(F);
        panel.add(jdftsLabel);
        
        jdftsText = new JTextField();
        jdftsText.setText("");
        jdftsText.setBounds(385,104,130,20);
        panel.add(jdftsText);
        
        qftsLabel = new JLabel();
        qftsLabel.setText("Qualification:");
        qftsLabel.setBounds(30,145,150,20);
        qftsLabel.setFont(F);
        panel.add(qftsLabel);
        
        qftsText = new JTextField();
        qftsText.setText("");
        qftsText.setBounds(130,144,130,20);
        panel.add(qftsText);
        
        abftsLabel = new JLabel();
        abftsLabel.setText("Appointed By:");
        abftsLabel.setBounds(280,145,150,20);
        abftsLabel.setFont(F);
        panel.add(abftsLabel);
        
        abftsText = new JTextField();
        abftsText.setText("");
        abftsText.setBounds(385,144,130,20);
        panel.add(abftsText);
        
        returnB3 = new JButton();
        returnB3.setText("|<");
        returnB3.setBounds(30, 190, 80, 30);
        returnB3.addActionListener(this);
        panel.add(returnB3); 
        
        clearB = new JButton();
        clearB.setText("Clear");
        clearB.setBounds(215, 190, 100, 30);
        clearB.addActionListener(this);
        panel.add(clearB);
        
        ftsAppointB = new JButton();
        ftsAppointB.setText("Appoint");
        ftsAppointB.setBounds(415, 190, 100, 30);
        ftsAppointB.addActionListener(this);
        panel.add(ftsAppointB);
        
        hireFTF.setVisible(true);
        hireFTF.add(panel);
        hireFTF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void terminateForm()
    {
        //Terminate Form
        
        terminateF = new JFrame();
        terminateF.setBounds(0, 0, 265, 170);
        terminateF.setResizable(true);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        terminateLabel = new JLabel();
        terminateLabel.setText("Terminate Staff");
        terminateLabel.setBounds(35, 5, 250, 30);
        terminateLabel.setFont(titleFont);
        panel.add(terminateLabel);
        
        vnLabel = new JLabel();
        vnLabel.setText("Vacancy Number:");
        vnLabel.setBounds(20,55,140,20);
        vnLabel.setFont(F);
        panel.add(vnLabel);
        
        vnTerminateText = new JTextField();
        vnTerminateText.setText("");
        vnTerminateText.setBounds(160,54,70,20);
        panel.add(vnTerminateText);
        
        returnB4 = new JButton();
        returnB4.setText("|<");
        returnB4.setBounds(20, 85, 70, 20);
        returnB4.addActionListener(this);
        panel.add(returnB4);
        
        terminateStaffB = new JButton();
        terminateStaffB.setText("Terminate");
        terminateStaffB.setBounds(130,85,100,20);
        terminateStaffB.addActionListener(this);
        panel.add(terminateStaffB);
        
        terminateF.setVisible(true);
        terminateF.add(panel);
        terminateF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //method for action listener to perform action 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == addVacancy){
            mainFrame.dispose();
            vacancyForm();
        }
        else if(e.getSource() == hirePTB){
           mainFrame.dispose();
           partTimeForm();
        }
        else if(e.getSource() == hireFTB){
            mainFrame.dispose();
            fullTimeForm();
        }
        else if(e.getSource() == terminateB){
            mainFrame.dispose();
            terminateForm();
        }
        else if(e.getSource() == exitB){
            mainFrame.dispose();
        }
        
        //Return to main Form button
        if(e.getSource() == returnB1){
            vacancyFrame.dispose();
            form();
        }
        else if(e.getSource() == returnB2){
            hirePTF.dispose();
            form();
        }
        else if(e.getSource() == returnB3){
            hireFTF.dispose();
            form();
        }
        else if(e.getSource() == returnB4){
            terminateF.dispose();
            form();
        }
        
        //for add vacancy fulltime and parttime
        if(e.getSource() == addVacancyFTB){   
            try
            {
                int VacancyNumber = Integer.parseInt(vNumText.getText());
                int WorkingHour = Integer.parseInt(workHText.getText());
                int Salary = Integer.parseInt(salaryText.getText());
                String JobType = (String) jTypeComboBox.getSelectedItem();
                boolean isDefined = false;
                for(StaffHire ar: staffAL){
                    if(ar.getvacancyNumber() == VacancyNumber && ar instanceof FullTimeStaffHire){  
                        isDefined = true;
                        break;
                    }
                }
                if(isDefined == false){
                    ftsObj = new FullTimeStaffHire(VacancyNumber, designationText.getText(), JobType, WorkingHour, Salary);
                    staffAL.add(ftsObj);
                    JOptionPane.showMessageDialog(vacancyFrame,"Full Time Staff Vacancy has been Successfully created."); 
                    clearText();
                }
                else{
                    JOptionPane.showMessageDialog(vacancyFrame, "Vacancy Number already exists");
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(vacancyFrame, "Fill all the fields for FullTime staff");
            }
        }
        else if(e.getSource() == addVacancyPTB){
            try
            {
                int VacancyNumber = Integer.parseInt(vNumText.getText());
                int WorkingHour = Integer.parseInt(workHText.getText());
                int WagesPerHour = Integer.parseInt(wphText.getText());
                String JobType = String.valueOf(jTypeComboBox.getSelectedItem());
                String Shift = String.valueOf(shiftComboBox.getSelectedItem());
                
                boolean isDefined = false;
                
                for(StaffHire ar: staffAL){
                    if(ar.getvacancyNumber() == VacancyNumber && ar instanceof PartTimeStaffHire)
                    {   
                        isDefined = true;
                        break;
                    }
                }
                if(isDefined == false){
                    ptsObj = new PartTimeStaffHire(VacancyNumber, designationText.getText(), JobType, WorkingHour, WagesPerHour, Shift);
                    staffAL.add(ptsObj);
                    JOptionPane.showMessageDialog(vacancyFrame,"Part Time Staff Vacancy has been Successfully created.");
                    clearText();
                }
                else{
                    JOptionPane.showMessageDialog(vacancyFrame,"Part Time Staff Vacancy Number has already been added.");
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(vacancyFrame, "Fill all the fields for FullTime staff");
            }
        }
        //appoint FullTime Staff
        if(e.getSource() == ftsAppointB){
            try
            {
                int vacancyNumber = Integer.parseInt(vnftsText.getText());
                String staffName = snftsText.getText();
                String joiningDate = jdftsText.getText();
                String qualification = qftsText.getText();
                String appointedBy = snftsText.getText();
                boolean availableVN = false;
                boolean forJob = false;
                
                for(StaffHire staff: staffAL){
                    if(staff.getvacancyNumber() == vacancyNumber){   
                        availableVN = true;
                    
                        if(staff instanceof FullTimeStaffHire){
                            forJob = true;
                            ftsObj = (FullTimeStaffHire) staff;
                            if(ftsObj.getjoined() == true){
                                JOptionPane.showMessageDialog(hireFTF, "Staff has Already joined");
                            }
                            else{
                                ftsObj.HirefulltimeStaff(staffName, joiningDate, qualification, appointedBy);
                                JOptionPane.showMessageDialog(hireFTF, "Staff has been hired");
                                clearText();
                                break;
                            }
                        }
                    }
                }
                if(!availableVN){
                    JOptionPane.showMessageDialog(hireFTF, "Vacancy Number is not available");
                }
                else if(availableVN == true && !forJob){
                    JOptionPane.showMessageDialog(hirePTF, "Vacancy Number isn't available for Part Time Staff");
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(hireFTF, "Empty Fields! please fill all the informations");
            }
        }
        
        //appoint staff for PartTime
        if(e.getSource() == ptsAppointB){
            try
            {
                int vacancyNumber = Integer.parseInt(vnptsText.getText());
                String staffName = snptsText.getText();
                String joiningDate = jdptsText.getText();
                String qualification = qptsText.getText();
                String appointedBy = snptsText.getText();
                boolean availableVN = false;
                boolean forJob = false;
                
                for(StaffHire staff: staffAL){
                    if(staff.getvacancyNumber() == vacancyNumber){
                        availableVN = true;
                    
                        if(staff instanceof PartTimeStaffHire){   forJob = true;
                            ptsObj = (PartTimeStaffHire) staff;
                            if(ptsObj.getjoined() == true){
                                JOptionPane.showMessageDialog(hirePTF, "Staff has Already joined");
                            }
                            else{
                                ptsObj.PartTimeStaffHire(staffName, joiningDate, qualification, appointedBy);
                                JOptionPane.showMessageDialog(hirePTF, "Staff has been hired");
                                clearText();
                                break;
                            }
                        }
                    }
                }
                if(!availableVN){
                    JOptionPane.showMessageDialog(hirePTF, "Vacancy Number is not available");
                }
                else if(availableVN == true &&  !forJob){
                    JOptionPane.showMessageDialog(hirePTF, "Vacancy Number isn't available for Part Time Staff");
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(hireFTF, "Empty Fields! please fill all the informations");
            }
        }

        if(e.getSource() == terminateStaffB){
            try
            {   
                boolean availableVN = false;
                int vacancyNumber = Integer.parseInt(vnTerminateText.getText());
                
                for(StaffHire staff: staffAL){
                    if(staff instanceof PartTimeStaffHire){   
                        ptsObj = (PartTimeStaffHire) staff;
                        availableVN = true;
                        if (vacancyNumber == ptsObj.getvacancyNumber()){
                            if(ptsObj.getterminated() == false){
                                ptsObj.terminateStaff();
                                JOptionPane.showMessageDialog(terminateF,"Staff has been terminated");
                                break;
                            }
                            else if(ptsObj.getterminated() == true){
                                JOptionPane.showMessageDialog(terminateF, "Staff has already been terminated");
                                break;
                            }
                        }
                    }
                }
                if(availableVN == false){
                    JOptionPane.showMessageDialog(terminateF, "Vacancy Number is not available");
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(terminateF, "Please enter the Vacancy Number of the Part Time Staff");
            }
        }
        //clear button action
        if(e.getSource() == clearB){
            clearText();
        }
        if(e.getSource() == displayFTB){   
            for(StaffHire list: staffAL){
                if(list instanceof FullTimeStaffHire){
                    ftsObj = (FullTimeStaffHire) list;
                    ftsObj.display();
                }
            }
        }
        else if(e.getSource() == displayPTB){
            for(StaffHire list: staffAL){
                if(list instanceof PartTimeStaffHire){
                    ptsObj = (PartTimeStaffHire) list;
                    ptsObj.display();
                }
            }
        }
    }
    public void clearText()
    {   
       if(formNo == 1){
           vNumText.setText("");
           designationText.setText("");
           workHText.setText("");
           salaryText.setText("");
           wphText.setText("");
       }
       else if(formNo == 2){
           vnftsText.setText("");
           snftsText.setText("");
           jdftsText.setText("");
           qftsText.setText("");
           abftsText.setText("");
       }
       else if(formNo == 3){
           vnptsText.setText("");
           snptsText.setText("");
           jdptsText.setText("");
           qptsText.setText("");
           abptsText.setText("");
       }
    }
    //Main method of the class
    public static void main(String []args)
    {
        INGNepal mainForm = new INGNepal();
        mainForm.form();
    }
}
