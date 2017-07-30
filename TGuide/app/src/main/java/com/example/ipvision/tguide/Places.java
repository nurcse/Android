package com.example.ipvision.tguide;

import java.io.Serializable;

/**
 * Created by ipvision on 4/17/2017.
 */

public class Places implements Serializable {
    private String name;
    private String description;



    private String intro;
    private String howToGo;
    private String placesToVisit;
    private String img;
    private int image, index;
    private String division;

    public Places() {
    }



    public Places(String name, String division, int image, int index) {
        this.name = name;
        this.division = division;
        this.image = image;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getHowToGo() {
        return howToGo;
    }

    public void setHowToGo(String howToGo) {
        this.howToGo = howToGo;
    }

    public String getPlacesToVisit() {
        return placesToVisit;
    }

    public void setPlacesToVisit(String placesToVisit) {
        this.placesToVisit = placesToVisit;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
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

    public int getImage() {
        return image;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
