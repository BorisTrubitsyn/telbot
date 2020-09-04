package com.company.cubastudiotelegrambot.web.screens;

import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.auth.LoginPasswordCredentials;
import com.haulmont.cuba.web.App;

@UiController("myLogin")
@UiDescriptor("app-login-screen.xml")
@Route(path = "login", root = true)
public class AppLoginScreen extends Screen {

    @Subscribe("loginBtn")
    private void onLoginBtnClick(Button.ClickEvent event) {
        App.getInstance().getConnection().login(
                new LoginPasswordCredentials("admin", "admin"));
    }
}