package com.example.DependencyInjection.homework.notebooks;

import com.example.DependencyInjection.interfaces.Notebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("msiNotebook")
public class Msi implements Notebook {

    @Autowired
    @Qualifier("Hitachi")
    Hdd hdd;

    @Override
    public String spec() {
        return "This is notebook contains " + hdd.type();
    }
}
