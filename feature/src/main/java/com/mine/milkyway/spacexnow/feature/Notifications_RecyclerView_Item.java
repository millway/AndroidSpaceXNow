package com.mine.milkyway.spacexnow.feature;

public class Notifications_RecyclerView_Item {

    private  String ID;
    private int Image;
    private String Description, Date;

    public Notifications_RecyclerView_Item(String ID, int image, String description, String date) {
        this.ID = ID;
        Image = image;
        Description = description;
        Date = date;
    }


    public String getID() {
        return ID;
    }

    public int getImage() {
        return Image;
    }

    public String getDescription() {
        return Description;
    }



    public String getDate() {
        return Date;

    }
}
