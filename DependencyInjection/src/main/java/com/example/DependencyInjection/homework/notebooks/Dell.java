package com.example.DependencyInjection.homework.notebooks;

import com.example.DependencyInjection.interfaces.Notebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dellNotebook")
public class Dell implements Notebook {

    @Autowired
    @Qualifier("Toshiba")
    Hdd hdd;


    @Override
    public String spec() {
        return "This is notebook contains " + hdd.type();
    }
}

