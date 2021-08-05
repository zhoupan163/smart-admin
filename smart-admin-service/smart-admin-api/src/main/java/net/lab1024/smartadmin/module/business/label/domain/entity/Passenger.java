package net.lab1024.smartadmin.module.business.label.domain.entity;

import org.springframework.data.mongodb.core.mapping.Document;

// @Document的collection属性设置的是在mongo库中的集合名称
@Document(collection = "passenger")
public class Passenger {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
