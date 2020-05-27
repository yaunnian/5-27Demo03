package com.zhao.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String sex;
    private Long hobby;
    private String hobbys;
    @Temporal(TemporalType.DATE)
    private Date createtime;
    private String none;

    public Person() {
    }
    public Person(String name, String sex, Long hobby, Date createtime, String none) {
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
        this.createtime = createtime;
        this.none = none;
    }

    public String getHobbys() {
        return hobbys;
    }

    public void setHobbys(String hobbys) {
        this.hobbys = hobbys;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getHobby() {
        return hobby;
    }

    public void setHobby(Long hobby) {
        this.hobby = hobby;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNone() {
        return none;
    }

    public void setNone(String none) {
        this.none = none;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", hobby=" + hobby +
                ", createtime=" + createtime +
                ", none='" + none + '\'' +
                '}';
    }
}
