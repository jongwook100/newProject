package org.techtown.newproject;

public class RecipeDTO {
    private String title;
    private String name;
    private String imageUrl;

    public RecipeDTO(String title, String name, String imageUrl) {
        this.title = title;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
