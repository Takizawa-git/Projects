import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
public class INGNepal implements ActionListener
{
    JFrame frame;

    JPanel panelStaffHire;

    JLabel labelFullTimeTitle,labelVacancyNumber,labelDesignation,labelJob,labelSalary,labelWorkingHour,labelStaffName,labelJoined,labelQualification,labelAppointedBy,labelPartTimeTitle,labelWages,labelShifts,labelTerminateStaff;

    JTextField txtCheckFullTimeVacancyNumber,txtFullTimeVacancyNumber,txtFullTimeDesignation,txtFullTimeJob,txtFullTimeSalary,txtFullTimeWorkingHour,txtFullTimeStaffName,txtFullTimeJoined,txtFullTimeQualification,txtFullTimeAppointedBy;
    JTextField txtCheckPartTimeVacancyNumber,txtPartTimeVacancyNumber,txtPartTimeDesignation,txtPartTimeJob,txtPartTimeWorkingHour,txtPartTimeStaffName,txtPartTimeJoined,txtPartTimeQualification,txtPartTimeAppointedBy,txtWages,txtShifts,txtTerminateStaff;

    JButton addFullTimeStaffButton,appointFullTimeStaffButton,addPartTimeStaffButton,appointPartTimeStaffButton,terminateStaffButton,clearButton,displayPartTimeButton,displayFullTimeButton;
    ArrayList<StaffHire> list=new ArrayList<StaffHire>();
    
   public static void main(String []args){
       new INGNepal();
   }
    public INGNepal() 
    {

        //To hire full time employee
        frame = new JFrame("ING Nepal");
        Container container = frame.getContentPane();
        frame.setLayout(null);
        panelStaffHire = new JPanel();
        panelStaffHire.setBounds(0,0,900,900);
        container.add(panelStaffHire);
        panelStaffHire.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelFullTimeTitle = new JLabel("For Full Time Staff:");
        labelFullTimeTitle.setFont (labelFullTimeTitle.getFont().deriveFont (25.0f));
        labelFullTimeTitle.setBounds(290,10,400,35);
        panelStaffHire.add(labelFullTimeTitle);

        labelVacancyNumber = new JLabel("Vacancy Number:");
        labelVacancyNumber.setBounds(10,60,120,20);
        panelStaffHire.add(labelVacancyNumber);

        txtFullTimeVacancyNumber = new JTextField();
        txtFullTimeVacancyNumber.setBounds(125,60,125,25);
        panelStaffHire.add(txtFullTimeVacancyNumber);

        labelDesignation = new JLabel("Designation:");
        labelDesignation.setBounds(290,60,80,20);
        panelStaffHire.add(labelDesignation);

        txtFullTimeDesignation = new JTextField();
        txtFullTimeDesignation.setBounds(380,60,125,25);
        panelStaffHire.add(txtFullTimeDesignation);

        labelSalary = new JLabel("Salary:");
        labelSalary.setBounds(10,95,60,20);
        panelStaffHire.add(labelSalary);

        txtFullTimeSalary = new JTextField();
        txtFullTimeSalary.setBounds(125,95,125,25);
        panelStaffHire.add(txtFullTimeSalary);

        labelJob = new JLabel("Job Type:");
        labelJob.setBounds(545,60,60,20);
        panelStaffHire.add(labelJob);

        txtFullTimeJob = new JTextField();
        txtFullTimeJob.setBounds(620,60,125,25);
        panelStaffHire.add(txtFullTimeJob);

        labelWorkingHour = new JLabel("Working Hour:");
        labelWorkingHour.setBounds(290,95,120,20);
        panelStaffHire.add(labelWorkingHour);

        txtFullTimeWorkingHour = new JTextField();
        txtFullTimeWorkingHour.setBounds(380,95,125,25);
        panelStaffHire.add(txtFullTimeWorkingHour);

        addFullTimeStaffButton = new JButton("Add");
        addFullTimeStaffButton.setBounds(125,130,125,35);
        addFullTimeStaffButton.addActionListener(this);
        panelStaffHire.add(addFullTimeStaffButton);

        //To appoint Full Time Staff GUI
        labelVacancyNumber = new JLabel("Vacancy Number:");
        labelVacancyNumber.setBounds(10,185,120,20);
        panelStaffHire.add(labelVacancyNumber);

        txtCheckFullTimeVacancyNumber = new JTextField();
        txtCheckFullTimeVacancyNumber.setBounds(125,185,125,25);
        panelStaffHire.add(txtCheckFullTimeVacancyNumber);

        labelStaffName = new JLabel("Staff Name:");
        labelStaffName.setBounds(290,185,120,20);
        panelStaffHire.add(labelStaffName);

        txtFullTimeStaffName = new JTextField();
        txtFullTimeStaffName.setBounds(380,185,125,25);
        panelStaffHire.add(txtFullTimeStaffName);

        labelJoined = new JLabel("Joined Date:");
        labelJoined.setBounds(285,220,120,20);
        panelStaffHire.add(labelJoined);

        txtFullTimeJoined = new JTextField();
        txtFullTimeJoined.setBounds(380,220,125,25);
        panelStaffHire.add(txtFullTimeJoined);

        labelQualification = new JLabel("Qualification:");
        labelQualification.setBounds(545,185,100,20);
        panelStaffHire.add(labelQualification);

        txtFullTimeQualification = new JTextField();
        txtFullTimeQualification.setBounds(620,185,125,25);
        panelStaffHire.add(txtFullTimeQualification);

        labelAppointedBy = new JLabel("Appointed By:");
        labelAppointedBy.setBounds(10,220,120,20);
        panelStaffHire.add(labelAppointedBy);

        txtFullTimeAppointedBy = new JTextField();
        txtFullTimeAppointedBy.setBounds(125,220,125,25);
        panelStaffHire.add(txtFullTimeAppointedBy);

        appointFullTimeStaffButton = new JButton("Appoint");
        appointFullTimeStaffButton.setBounds(125,255,125,35);
        appointFullTimeStaffButton.addActionListener(this);
        panelStaffHire.add(appointFullTimeStaffButton);

        displayFullTimeButton = new JButton("Display");
        displayFullTimeButton.setBounds(380,255,125,35);
        displayFullTimeButton.addActionListener(this);
        panelStaffHire.add(displayFullTimeButton);

        //For Part Time Staff
        labelPartTimeTitle = new JLabel("For Part Time Staff:");
        labelPartTimeTitle.setFont (labelFullTimeTitle.getFont().deriveFont (25.0f));
        labelPartTimeTitle.setBounds(290,300,400,35);
        panelStaffHire.add(labelPartTimeTitle);

        labelVacancyNumber = new JLabel("Vacancy Number:");
        labelVacancyNumber.setBounds(10,345,120,20);
        panelStaffHire.add(labelVacancyNumber);

        txtPartTimeVacancyNumber = new JTextField();
        txtPartTimeVacancyNumber.setBounds(125,345,125,25);
        panelStaffHire.add(txtPartTimeVacancyNumber);

        labelDesignation = new JLabel("Designation:");
        labelDesignation.setBounds(290,345,80,20);
        panelStaffHire.add(labelDesignation);

        txtPartTimeDesignation = new JTextField();
        txtPartTimeDesignation.setBounds(380,345,125,25);
        panelStaffHire.add(txtPartTimeDesignation);

        labelJob = new JLabel("Job Type:");
        labelJob.setBounds(545,345,80,20);
        panelStaffHire.add(labelJob);

        txtPartTimeJob = new JTextField();
        txtPartTimeJob.setBounds(620,345,125,25);
        panelStaffHire.add(txtPartTimeJob);

        labelWages = new JLabel("Wages Per Hour:");
        labelWages.setBounds(10,380,100,20);
        panelStaffHire.add(labelWages);

        txtWages = new JTextField();
        txtWages.setBounds(620,380,125,25);
        panelStaffHire.add(txtWages);

        labelWorkingHour = new JLabel("Working Hour:");
        labelWorkingHour.setBounds(290,380,120,20);
        panelStaffHire.add(labelWorkingHour);

        txtPartTimeWorkingHour = new JTextField();
        txtPartTimeWorkingHour.setBounds(380,380,125,25);
        panelStaffHire.add(txtPartTimeWorkingHour);

        labelShifts = new JLabel("Shifts:");
        labelShifts.setBounds(545,380,40,20);
        panelStaffHire.add(labelShifts);

        txtShifts = new JTextField();
        txtShifts.setBounds(125,380,125,25);
        panelStaffHire.add(txtShifts);

        addPartTimeStaffButton = new JButton("Add");
        addPartTimeStaffButton.setBounds(125,415,125,35);
        addPartTimeStaffButton.addActionListener(this);
        panelStaffHire.add(addPartTimeStaffButton);

        //To appoint Part Time Staff GUI
        labelVacancyNumber = new JLabel("Vacancy Number:");
        labelVacancyNumber.setBounds(10,470,120,20);
        panelStaffHire.add(labelVacancyNumber);

        txtCheckPartTimeVacancyNumber = new JTextField();
        txtCheckPartTimeVacancyNumber.setBounds(125,470,125,25);
        panelStaffHire.add(txtCheckPartTimeVacancyNumber);

        labelStaffName = new JLabel("Staff Name:");
        labelStaffName.setBounds(290,470,120,20);
        panelStaffHire.add(labelStaffName);

        txtPartTimeStaffName = new JTextField();
        txtPartTimeStaffName.setBounds(380,470,125,25);
        panelStaffHire.add(txtPartTimeStaffName);

        labelJoined = new JLabel("Joined Date:");
        labelJoined.setBounds(10,505,100,20);
        panelStaffHire.add(labelJoined);

        txtPartTimeJoined = new JTextField();
        txtPartTimeJoined.setBounds(125,505,125,25);
        panelStaffHire.add(txtPartTimeJoined);

        labelQualification = new JLabel("Qualification:");
        labelQualification.setBounds(545,470,120,20);
        panelStaffHire.add(labelQualification);

        txtPartTimeQualification = new JTextField();
        txtPartTimeQualification.setBounds(620,470,125,25);
        panelStaffHire.add(txtPartTimeQualification);

        labelAppointedBy = new JLabel("Appointed By:");
        labelAppointedBy.setBounds(290,505,120,20);
        panelStaffHire.add(labelAppointedBy);

        txtPartTimeAppointedBy = new JTextField();
        txtPartTimeAppointedBy.setBounds(380,505,125,25);
        panelStaffHire.add(txtPartTimeAppointedBy);

        appointPartTimeStaffButton = new JButton("Appoint");
        appointPartTimeStaffButton.setBounds(125,540,125,35);
        appointPartTimeStaffButton.addActionListener(this);
        panelStaffHire.add(appointPartTimeStaffButton);

        displayPartTimeButton = new JButton("Display");
        displayPartTimeButton.setBounds(380,540,125,35);
        displayPartTimeButton.addActionListener(this);
        panelStaffHire.add(displayPartTimeButton);

        labelTerminateStaff = new JLabel("Vacancy Number:");
        labelTerminateStaff.setBounds(10,595,120,20);
        panelStaffHire.add(labelTerminateStaff);

        txtTerminateStaff = new JTextField();
        txtTerminateStaff.setBounds(125,595,125,25);
        panelStaffHire.add(txtTerminateStaff);

        terminateStaffButton = new JButton("Terminate");
        terminateStaffButton.setBounds(125,635,125,35);
        terminateStaffButton.addActionListener(this);
        panelStaffHire.add(terminateStaffButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(380,635,125,35);
        clearButton.addActionListener(this);
        panelStaffHire.add(clearButton);

        frame.setSize(1000,700);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event)
    {
        
        
        if(event.getSource()==addFullTimeStaffButton) 
        {
            try {
                if(txtFullTimeVacancyNumber.getText().isEmpty() || txtFullTimeDesignation.getText().isEmpty() || txtFullTimeJob.getText().isEmpty() || txtFullTimeSalary.getText().isEmpty() || txtFullTimeWorkingHour.getText().isEmpty()) {
                    throw new NumberFormatException("TextField cannot be empty");
                }
                int fullTimeVacancyNumber = Integer.parseInt(txtFullTimeVacancyNumber.getText());
                String fullTimedesignation = txtFullTimeDesignation.getText();
                String fullTimeJob = txtFullTimeJob.getText();
                int fullTimesalary = Integer.parseInt(txtFullTimeSalary.getText());
                int fullTimeworkingHour = Integer.parseInt(txtFullTimeWorkingHour.getText());
                FullTimeStaffHire objectAddFullTime = new FullTimeStaffHire(fullTimeVacancyNumber,fullTimedesignation,fullTimeJob,fullTimesalary,fullTimeworkingHour);
                list.add(objectAddFullTime);
                JOptionPane.showMessageDialog(frame,"Full Time Staff has been added");
            }
            catch(NumberFormatException exception) 
            {
                JOptionPane.showMessageDialog(frame,exception.getMessage());
            }
        }

        if(event.getSource()==addPartTimeStaffButton) 
        {
            try 
            {
              if(txtPartTimeVacancyNumber.getText().isEmpty() || txtPartTimeDesignation.getText().isEmpty() || txtPartTimeJob.getText().isEmpty()  || txtShifts.getText().isEmpty() || txtWages.getText().isEmpty() || txtPartTimeWorkingHour.getText().isEmpty()) {
                  throw new NumberFormatException("TextField cannot be empty");
              }
              int partTimevacancyNumber = Integer.parseInt(txtPartTimeVacancyNumber.getText());
              String partTimedesignation = txtPartTimeDesignation.getText();
              String partTimeJob = txtPartTimeJob.getText();
              int wagesPerHour = Integer.parseInt(txtWages.getText());
              int partTimeworkingHour = Integer.parseInt(txtPartTimeWorkingHour.getText());
              
              String shifts = txtShifts.getText();
              PartTimeStaffHire objectAddPartTime = new PartTimeStaffHire(partTimevacancyNumber,partTimedesignation,partTimeJob,partTimeworkingHour,wagesPerHour,shifts);
              list.add(objectAddPartTime);
              JOptionPane.showMessageDialog(frame,"Part Time Staff has been added");
            }
            catch(NumberFormatException exception) 
            {
              JOptionPane.showMessageDialog(frame,exception.getMessage());
            }
        }

        if (event.getSource() == appointFullTimeStaffButton) 
        {
            try {
                if (txtCheckFullTimeVacancyNumber.getText().isEmpty() || txtFullTimeStaffName.getText().isEmpty() || txtFullTimeJoined.getText().isEmpty() || txtFullTimeQualification.getText().isEmpty() || txtFullTimeAppointedBy.getText().isEmpty()) {
                     throw new NumberFormatException("TextField cannot be empty");
                }
                int checkFullTimeVacancyNumber = Integer.parseInt(txtCheckFullTimeVacancyNumber.getText());
                String fullTimeStaffName = txtFullTimeStaffName.getText();
                String fullTimeJoined = txtFullTimeJoined.getText();
                String fullTimeQualification = txtFullTimeQualification.getText();
                String fullTimeAppointedBy = txtFullTimeAppointedBy.getText();
                
                for (StaffHire x:list) 
                {
                  if (x instanceof FullTimeStaffHire) 
                  {
                    FullTimeStaffHire f = (FullTimeStaffHire) x;
                    f.HirefulltimeStaff(fullTimeStaffName,fullTimeJoined,fullTimeQualification,fullTimeAppointedBy);
                    JOptionPane.showMessageDialog(frame,"Full Time Staff has been appointed");
                  }
                }
            }
            catch(NumberFormatException exception) 
            {
              JOptionPane.showMessageDialog(frame,exception.getMessage());
            }
        }
        
        if (event.getSource() == appointPartTimeStaffButton) 
        {
            try {
                if (txtCheckPartTimeVacancyNumber.getText().isEmpty() || txtPartTimeStaffName.getText().isEmpty() || txtPartTimeJoined.getText().isEmpty() || txtPartTimeQualification.getText().isEmpty() || txtPartTimeAppointedBy.getText().isEmpty()) {
                    throw new NumberFormatException("TextField cannot be empty");
                }
                int checkPartTimeVacancyNumber = Integer.parseInt(txtCheckPartTimeVacancyNumber.getText());
                String partTimeStaffName = txtPartTimeStaffName.getText();
                String partTimeJoined = txtPartTimeJoined.getText();
                String partTimeQualification = txtPartTimeQualification.getText();
                String partTimeAppointedBy = txtPartTimeAppointedBy.getText();
                for (StaffHire y:list) 
                {
                  if (y instanceof PartTimeStaffHire) 
                  {
                    PartTimeStaffHire objPartTime = (PartTimeStaffHire) y;
                    objPartTime.PartTimeStaffHire(partTimeStaffName,partTimeJoined,partTimeQualification,partTimeAppointedBy);
                    JOptionPane.showMessageDialog(frame,"Part Time Staff has been appointed");
                  }
                }
            }
            catch(NumberFormatException exception) 
            {
              JOptionPane.showMessageDialog(frame,exception.getMessage());
            }
        }

        if (event.getSource() == displayFullTimeButton) 
        {
          for (StaffHire a:list) 
          {
            if (a instanceof FullTimeStaffHire) 
            {
              FullTimeStaffHire objDisplayFullTime = (FullTimeStaffHire) a;
              objDisplayFullTime.display();
            }
          }
        }

        if (event.getSource() == displayPartTimeButton) 
        {
          for (StaffHire b:list) 
          {
            if (b instanceof PartTimeStaffHire) 
            {
              PartTimeStaffHire objDisplayPartTime = (PartTimeStaffHire) b;
              objDisplayPartTime.display();
            }
          }
        }
         
        if (event.getSource()==clearButton) 
        {
          if (txtCheckFullTimeVacancyNumber.getText().isEmpty() == false) 
          {
            txtCheckFullTimeVacancyNumber.setText("");
          }
          if (txtFullTimeVacancyNumber.getText().isEmpty() == false) 
          {
            txtFullTimeVacancyNumber.setText("");
          }          
          if (txtFullTimeDesignation.getText().isEmpty() == false) 
          {
            txtFullTimeDesignation.setText("");
          }
          if (txtFullTimeJob.getText().isEmpty() == false) 
          {
            txtFullTimeJob.setText("");
          }
          if (txtFullTimeSalary.getText().isEmpty() == false) 
          {
            txtFullTimeSalary.setText("");
          }  
          if (txtFullTimeWorkingHour.getText().isEmpty() == false) 
          {
            txtFullTimeWorkingHour.setText("");
          }
          if (txtFullTimeStaffName.getText().isEmpty() == false) 
          {
            txtFullTimeStaffName.setText("");
          }
          if (txtFullTimeJoined.getText().isEmpty() == false) 
          {
            txtFullTimeJoined.setText("");
          }
          if (txtFullTimeQualification.getText().isEmpty() == false) 
          {
            txtFullTimeQualification.setText("");
          }
          if (txtFullTimeAppointedBy.getText().isEmpty() == false) 
          {
            txtFullTimeAppointedBy.setText("");
          }
          if (txtCheckPartTimeVacancyNumber.getText().isEmpty() == false) 
          {
            txtCheckPartTimeVacancyNumber.setText("");
          }  
          if (txtPartTimeVacancyNumber.getText().isEmpty() == false) 
          {
            txtPartTimeVacancyNumber.setText("");
          } 
          if (txtPartTimeDesignation.getText().isEmpty() == false) 
          {
            txtPartTimeDesignation.setText("");
          } 
          if (txtPartTimeJob.getText().isEmpty() == false) 
          {
            txtPartTimeJob.setText("");
          } 
          if (txtPartTimeWorkingHour.getText().isEmpty() == false) 
          {
            txtPartTimeWorkingHour.setText("");
          } 
          if (txtPartTimeStaffName.getText().isEmpty() == false) 
          {
            txtPartTimeStaffName.setText("");
          } 
          if (txtPartTimeJoined.getText().isEmpty() == false) 
          {
            txtPartTimeJoined.setText("");
          } 
          if (txtPartTimeQualification.getText().isEmpty() == false) 
          {
            txtPartTimeQualification.setText("");
          } 
          if (txtPartTimeAppointedBy.getText().isEmpty() == false) 
          {
            txtPartTimeAppointedBy.setText("");
          } 
          if (txtWages.getText().isEmpty() == false) 
          {
            txtWages.setText("");
          } 
          if (txtShifts.getText().isEmpty() == false) 
          {
            txtShifts.setText("");
          } 
          if (txtTerminateStaff.getText().isEmpty() == false) 
          {
            txtTerminateStaff.setText("");
          }   
        }
    }
}
