package org.techtown.newproject;

public class FoodListDTO {
    private String titleStr;
    private String subUrl;
    private String iconStr;


    public FoodListDTO(String iconStr, String titleStr, String subUrl) {
        this.iconStr = iconStr;
        this.subUrl = subUrl;
        this.titleStr = titleStr;
    }

    public String getIcon() {
        return this.iconStr;
    }
    public String getSubUrl() {
        return this.subUrl;
    }
    public String getTitleStr() {
        return this.titleStr;
    }

}