package com.amjad.careershiksha.model;

public class Category {
    private String categoryImage;
    private String categoryName;

    public Category(String categoryImage, String categoryName) {
        this.categoryImage = categoryImage;
        this.categoryName = categoryName;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
