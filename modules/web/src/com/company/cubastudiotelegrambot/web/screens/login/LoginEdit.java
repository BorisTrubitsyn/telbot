package com.company.cubastudiotelegrambot.web.screens.login;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubastudiotelegrambot.entity.Login;

@UiController("cubastudiotelegrambot_Login.edit")
@UiDescriptor("login-edit.xml")
@EditedEntityContainer("loginDc")
@LoadDataBeforeShow
public class LoginEdit extends StandardEditor<Login> {
}