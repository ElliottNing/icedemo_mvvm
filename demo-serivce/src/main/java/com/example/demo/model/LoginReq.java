package com.example.demo.model;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "t_demo_student")
public class LoginReq implements Serializable{

    private static final long serialVersionUID = 1L;

    private String userName;

    @JSONField(name = "password")
    private String passWord;

    private Boolean checkBox;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Boolean getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(Boolean checkBox) {
        this.checkBox = checkBox;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LoginReq{");
        sb.append("userName='").append(userName).append('\'');
        sb.append(", passWord='").append(passWord).append('\'');
        sb.append(", checkBox=").append(checkBox);
        sb.append('}');
        return sb.toString();
    }
}
