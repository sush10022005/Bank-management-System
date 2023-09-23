import java.awt.*;
import javax.swing.*;
/*import java.util.*;*/

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{

    long random;
    JTextField nameTextField, fnameTextField,  emailTextField, addTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, married, unmarried;
    JDateChooser dateChooser;
    SignupTwo() {

    setLayout(null);

    setTitle("New Account Application Form - Page 2");


    JLabel additionalDetails =new JLabel("Page 2 : ADDITIONAL DETAILS");
    additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
    additionalDetails.setBounds(290, 80, 400, 30);
    add(additionalDetails);

    JLabel religion =new JLabel("Religion:");
    religion.setFont(new Font("Raleway", Font.BOLD, 22));
    religion.setBounds(100, 140, 100, 30);
    add(religion);

     nameTextField = new JTextField();
    nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    nameTextField.setBounds(300, 140, 400, 30);
    add(nameTextField);

    JLabel category =new JLabel("Category:");
    category.setFont(new Font("Raleway", Font.BOLD, 22));
    category.setBounds(100, 190, 200, 30);
    add(category);

     fnameTextField = new JTextField();
    fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    fnameTextField.setBounds(300, 190, 400, 30);
    add(fnameTextField);

    JLabel income =new JLabel("Income:");
    income.setFont(new Font("Raleway", Font.BOLD, 22));
    income.setBounds(100, 240, 200, 30);
    add(income);

     dateChooser = new JDateChooser();
    dateChooser.setBounds(300, 240, 400, 30);
    dateChooser.setForeground(Color.BLACK);
    add(dateChooser);

    JLabel education =new JLabel("Educational:");
    education.setFont(new Font("Raleway", Font.BOLD, 22));
    education.setBounds(100, 290, 200, 30);
    add(education);

     male = new JRadioButton("Male");
    male.setBounds(300, 290, 60, 30);
    male.setBackground(Color.white);
    add(male);

     female = new JRadioButton("Female");
    female.setBounds(400, 290, 80, 30);
    female.setBackground(Color.white);
    add(female);

    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(male);
    genderGroup.add(female);
    
    JLabel qualification =new JLabel("Qualification:");
    qualification.setFont(new Font("Raleway", Font.BOLD, 22));
    qualification.setBounds(100, 340, 200, 30);
    add(qualification);

     emailTextField = new JTextField();
    emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    emailTextField.setBounds(300, 340, 400, 30);
    add(emailTextField);

    JLabel occupation =new JLabel("Occupation:");
    occupation.setFont(new Font("Raleway", Font.BOLD, 22));
    occupation.setBounds(100, 390, 200, 30);
    add(occupation);

     married = new JRadioButton("Married");
    married.setBounds(300, 390, 80, 30);
    married.setBackground(Color.white);
    add(married);

     unmarried = new JRadioButton("Unmarried");
    unmarried.setBounds(400, 390, 80, 30);
    unmarried.setBackground(Color.white);
    add(unmarried);

    ButtonGroup maritialGroup = new ButtonGroup();
    maritialGroup.add(married);
    maritialGroup.add(unmarried);

    JLabel address =new JLabel("Pan No.:");
    address.setFont(new Font("Raleway", Font.BOLD, 22));
    address.setBounds(100, 440, 200, 30);
    add(address);

     addTextField = new JTextField();
    addTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    addTextField.setBounds(300, 440, 400, 30);
    add(addTextField);

    JLabel city =new JLabel("Addhar No:");
    city.setFont(new Font("Raleway", Font.BOLD, 22));
    city.setBounds(100, 490, 200, 30);
    add(city);

     cityTextField = new JTextField();
    cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    cityTextField.setBounds(300, 490, 400, 30);
    add(cityTextField);

    JLabel state =new JLabel("Senior Citizen:");
    state.setFont(new Font("Raleway", Font.BOLD, 22));
    state.setBounds(100, 540, 200, 30);
    add(state);

     stateTextField = new JTextField();
    stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    stateTextField.setBounds(300, 540, 400, 30);
    add(stateTextField);

    JLabel pincode =new JLabel("Existing Account:");
    pincode.setFont(new Font("Raleway", Font.BOLD, 22));
    pincode.setBounds(100, 590, 200, 30);
    add(pincode);
     
     pinTextField = new JTextField();
    pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    pinTextField.setBounds(300, 590, 400, 30);
    add(pinTextField);

     next = new JButton("NEXT");
        next.setBounds(300, 350 ,250, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
    getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
         setVisible(true);
         setLocation(350, 10);
    }

    public void actionPerformed(ActionEvent ae){
          String formno = "" + random;
          String name =  nameTextField.getText();
          String fname =  fnameTextField.getText();
          String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
          String gender = null;
          if(male.isSelected()){
            gender = "Male";
          }
          else if(female.isSelected()){
            gender = "Female";
          }
          String email = emailTextField.getText();
          String maritial = null;
          if(married.isSelected()){
            maritial = "Married";
          }
          else if(unmarried.isSelected()){
            maritial = "Unmarried";
          }
          String address = addTextField.getText();
          String city = cityTextField.getText();
          String state = stateTextField.getText();
          String pin = pinTextField.getText();


          try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else{
                conn c = new conn();
                String query ="insert into signup value('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+maritial+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);
            }
          } catch (Exception e) {
               System.out.println(e);
          }
    }
    
public static void main(String[] args){
    new SignupOne();
}
}

