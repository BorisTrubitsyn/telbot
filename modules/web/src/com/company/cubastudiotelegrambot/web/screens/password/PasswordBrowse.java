package com.company.cubastudiotelegrambot.web.screens.password;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubastudiotelegrambot.entity.Password;

@UiController("cubastudiotelegrambot_Password.browse")
@UiDescriptor("password-browse.xml")
@LookupComponent("passwordsTable")
@LoadDataBeforeShow
public class PasswordBrowse extends StandardLookup<Password> {
}