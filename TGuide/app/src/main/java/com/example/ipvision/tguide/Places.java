package com.example.ipvision.tguide;

/**
 * Created by ipvision on 4/17/2017.
 */

public class Places {
    private String name, description, img;

    public Places() {
    }

    public Places(String name, String description, String img) {
        this.name = name;
        this.description = description;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
