package cn.kgc.helloworld11.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@Table(name="emp")
public class Emp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private String sex;
    private Integer age;
    private  Double sal ;
    private Date birthday;
    private String jobDesc;
    @Transient
    private String remark;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

