package com.zhao.pojo;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "hobby")
public class Hobby {
    private Long hobbyname;
    private Date time;
    private Long sum;

    public Hobby() {
    }

    public Hobby(Long hobbyname, Date time, Long sum) {
        this.hobbyname = hobbyname;
        this.time = time;
        this.sum = sum;
    }

    public Long getHobbyname() {
        return hobbyname;
    }

    public void setHobbyname(Long hobbyname) {
        this.hobbyname = hobbyname;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyname=" + hobbyname +
                ", time=" + time +
                ", sum=" + sum +
                '}';
    }
}
