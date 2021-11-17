package net.javaguides.springbootbackend.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "drawerOption")
public class home {

    private String nav_draweroptions;

    public String getNav_draweroptions() {
        return nav_draweroptions;
    }

    public void setNav_draweroptions(String nav_draweroptions) {
        this.nav_draweroptions = nav_draweroptions;
    }
}
