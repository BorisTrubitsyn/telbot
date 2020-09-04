package com.company.cubastudiotelegrambot.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CUBASTUDIOTELEGRAMBOT_LOGIN")
@Entity(name = "cubastudiotelegrambot_Login")
public class Login extends StandardEntity {
    private static final long serialVersionUID = 5378282572436229339L;

    @NotNull
    @Column(name = "LOGIN_NAME", nullable = false)
    private String loginName;

    @Column(name = "PASSWORD")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}