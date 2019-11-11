package org.techtown.newproject;

class Recipe{
    public Recipe( String txt,String img){
        this.img = img;
        this.txt = txt;
    }
    String img;
    String txt;

    String getimgUrl(){
        return img;
    }

    String getTxtUrl(){
        return txt;
    }
}