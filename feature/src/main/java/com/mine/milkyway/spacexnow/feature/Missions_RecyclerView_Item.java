package com.mine.milkyway.spacexnow.feature;

import java.util.Date;

public class Missions_RecyclerView_Item {

    private  int id , image;
    private  String title, client_copany_name, launch_complex, orbit_type;
    private  String launch_time, time_remaining;

    public Missions_RecyclerView_Item(int id, int mission_image, String title, String client_copany_name, String launch_complex, String orbit_type, String launch_time, String time_to_launch) {
        this.id = id;
        this.image = mission_image;
        this.title = title;
        this.client_copany_name = client_copany_name;
        this.launch_complex = launch_complex;
        this.orbit_type = orbit_type;
        this.launch_time = launch_time;
        this.time_remaining = time_to_launch;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getClient_copany_name() {
        return client_copany_name;
    }

    public String getLaunch_complex() {
        return launch_complex;
    }

    public String getOrbit_type() {
        return orbit_type;
    }

    public String getLaunch_time() {
        return launch_time;
    }

    public String getTime_remaining() {
        return time_remaining;
    }
}
