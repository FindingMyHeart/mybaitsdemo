package com.roncoo.education.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dajuejinxian on 2018/9/23.
 */
public class RoncooUser implements Serializable {

    private Integer id;
    private String name;
    private Date createTime;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "RoncooUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
