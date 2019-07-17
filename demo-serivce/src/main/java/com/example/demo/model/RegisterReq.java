package com.example.demo.model;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "t_demo_student")
public class RegisterReq implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;

    private String email;

    private String passwd;

    private String rePasswd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getRePasswd() {
        return rePasswd;
    }

    public void setRePasswd(String rePasswd) {
        this.rePasswd = rePasswd;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RegisterReq{");
        sb.append("name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", passwd='").append(passwd).append('\'');
        sb.append(", rePasswd='").append(rePasswd).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
