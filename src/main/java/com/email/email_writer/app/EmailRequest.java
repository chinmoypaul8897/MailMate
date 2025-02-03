package com.email.email_writer.app;

import lombok.Data;

//@Data
public class EmailRequest {
    private String emailContent;
    private String tone ;
    // getters and setters
    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    @Override
    public String toString() {
        return "EmailRequest{" +
                "emailContent='" + emailContent + '\'' +
                ", tone='" + tone + '\'' +
                '}';
    }
}
