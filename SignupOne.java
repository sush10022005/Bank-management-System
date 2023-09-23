import java.awt.*;
import javax.swing.*;
import java.util.*;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{

    long random;
    JTextField nameTextField, fnameTextField,  emailTextField, addTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, married, unmarried;
    JDateChooser dateChooser;
    SignupOne() {

    setLayout(null);

    Random ran = new Random();
    random = Math.abs(ran.nextLong() % 9000L + 1000L) ;


    JLabel formno = new JLabel("APPLICATION FORM NO. " + random );
    formno.setFont(new Font("Raleway", Font.BOLD, 38));
    formno.setBounds(140, 20, 600, 40);
    add(formno);

    JLabel personalDetails =new JLabel("Page 1 : PERSONAL DETAILS");
    personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
    personalDetails.setBounds(290, 80, 400, 30);
    add(personalDetails);

    JLabel name =new JLabel("Name:");
    name.setFont(new Font("Raleway", Font.BOLD, 22));
    name.setBounds(100, 140, 100, 30);
    add(name);

     nameTextField = new JTextField();
    nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    nameTextField.setBounds(300, 140, 400, 30);
    add(nameTextField);

    JLabel fname =new JLabel("Father's Name:");
    fname.setFont(new Font("Raleway", Font.BOLD, 22));
    fname.setBounds(100, 190, 200, 30);
    add(fname);

     fnameTextField = new JTextField();
    fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    fnameTextField.setBounds(300, 190, 400, 30);
    add(fnameTextField);

    JLabel dob =new JLabel("Date of Birth:");
    dob.setFont(new Font("Raleway", Font.BOLD, 22));
    dob.setBounds(100, 240, 200, 30);
    add(dob);

     dateChooser = new JDateChooser();
    dateChooser.setBounds(300, 240, 400, 30);
    dateChooser.setForeground(Color.BLACK);
    add(dateChooser);

    JLabel gender =new JLabel("Gender:");
    gender.setFont(new Font("Raleway", Font.BOLD, 22));
    gender.setBounds(100, 290, 200, 30);
    add(gender);

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
    
    JLabel email =new JLabel("Email id :");
    email.setFont(new Font("Raleway", Font.BOLD, 22));
    email.setBounds(100, 340, 200, 30);
    add(email);

     emailTextField = new JTextField();
    emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    emailTextField.setBounds(300, 340, 400, 30);
    add(emailTextField);

    JLabel maritial =new JLabel("Maritial Status:");
    maritial.setFont(new Font("Raleway", Font.BOLD, 22));
    maritial.setBounds(100, 390, 200, 30);
    add(maritial);

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

    JLabel address =new JLabel("Address:");
    address.setFont(new Font("Raleway", Font.BOLD, 22));
    address.setBounds(100, 440, 200, 30);
    add(address);

     addTextField = new JTextField();
    addTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    addTextField.setBounds(300, 440, 400, 30);
    add(addTextField);

    JLabel city =new JLabel("City:");
    city.setFont(new Font("Raleway", Font.BOLD, 22));
    city.setBounds(100, 490, 200, 30);
    add(city);

     cityTextField = new JTextField();
    cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    cityTextField.setBounds(300, 490, 400, 30);
    add(cityTextField);

    JLabel state =new JLabel("State:");
    state.setFont(new Font("Raleway", Font.BOLD, 22));
    state.setBounds(100, 540, 200, 30);
    add(state);

     stateTextField = new JTextField();
    stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
    stateTextField.setBounds(300, 540, 400, 30);
    add(stateTextField);

    JLabel pincode =new JLabel("Pincode:");
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
