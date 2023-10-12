/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;
import java.util.Date;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author apple
 */
public class Patient {
    
        private String fname;
        private String lname;
        private String ageText;
        private String email; 
        private String msg ;
        private String patientTypeComboBox;
        private BufferedImage imageLabel;
        private String gender;
        
        
        
 
private Date selectedDate;


public Date getSelectedDate() {
    return selectedDate;
}


public void setSelectedDate(Date selectedDate) {
    this.selectedDate = selectedDate;
}
        
        
        
        

    public BufferedImage getImageLabel() {
        return imageLabel;
    }

    public void setImageLabel(BufferedImage imageLabel) {
        this.imageLabel = imageLabel;
    }
        
        
        
    public String getPatientTypeComboBox() {
        return patientTypeComboBox;
    }

    public void setPatientTypeComboBox(String patientTypeComboBox) {
        this.patientTypeComboBox = patientTypeComboBox;
    }


    


    

        
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAgeText() {
        return ageText;
    }

    public void setAgeText(String ageText) {
        this.ageText = ageText;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

        
        
    
}
