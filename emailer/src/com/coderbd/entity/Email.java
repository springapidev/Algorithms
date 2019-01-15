package com.coderbd.entity;
public class Email {
   private Long id;
   private String emailAddress;   
   private boolean status;
   private String emaillUserName;
   private String emailPassword;

    public Email() {
    }

    public Email(Long id, String emailAddress, boolean status, String emaillUserName, String emailPassword) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.status = status;
        this.emaillUserName = emaillUserName;
        this.emailPassword = emailPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmaillUserName() {
        return emaillUserName;
    }

    public void setEmaillUserName(String emaillUserName) {
        this.emaillUserName = emaillUserName;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }
      
}
