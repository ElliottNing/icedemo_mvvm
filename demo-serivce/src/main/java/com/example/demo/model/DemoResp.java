package com.example.demo.model;

import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 * 连接查询返回字段映射类
 *
 * */
@Table(name = "t_demo_student")
public class DemoResp implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String studentName;

    private String petName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
