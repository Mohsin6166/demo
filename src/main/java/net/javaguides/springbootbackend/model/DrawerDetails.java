package net.javaguides.springbootbackend.model;

import org.springframework.stereotype.Service;

@Service
public class DrawerDetails {

    private String nav_Options;


    public String getNav_Options() {
        return nav_Options;
    }

    public void setNav_Options(String nav_Options) {
        this.nav_Options = nav_Options;
    }

}
