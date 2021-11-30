package net.javaguides.springbootbackend.model;

import org.springframework.stereotype.Service;

@Service

public class PromotionModel {

    private String img_url;

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
