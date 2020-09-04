package com.company.cubastudiotelegrambot.web.screens.login;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubastudiotelegrambot.entity.Login;

@UiController("cubastudiotelegrambot_Login.browse")
@UiDescriptor("login-browse.xml")
@LookupComponent("loginsTable")
@LoadDataBeforeShow
public class LoginBrowse extends StandardLookup<Login> {
}