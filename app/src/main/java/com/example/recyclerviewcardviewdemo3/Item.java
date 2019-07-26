package com.example.recyclerviewcardviewdemo3;

public class Item {
    private String title;
    private String subTitle;

    Item(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
