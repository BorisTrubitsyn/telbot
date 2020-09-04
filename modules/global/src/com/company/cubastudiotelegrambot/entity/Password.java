package com.company.cubastudiotelegrambot.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CUBASTUDIOTELEGRAMBOT_PASSWORD")
@Entity(name = "cubastudiotelegrambot_Password")
public class Password extends StandardEntity {
    private static final long serialVersionUID = -486077751225515766L;

    @Column(name = "PASSWORD")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}