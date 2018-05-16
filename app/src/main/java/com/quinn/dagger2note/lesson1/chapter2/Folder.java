package com.quinn.dagger2note.lesson1.chapter2;

import javax.inject.Inject;

public class Folder {

    public Mail mail;

    @Inject
    public Folder(Mail mail) {
        this.mail = mail;
    }

}
