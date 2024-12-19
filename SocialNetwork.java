package com;

import java.util.ArrayList;

public class SocialNetwork {
    private String platformName;
    private ArrayList<Profile> profiles;


    public SocialNetwork(String platformName) {
        this.platformName = platformName;
        this.profiles = new ArrayList<>();
    }


    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }


    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public void displayProfiles() {
        System.out.println("Profiles on " + platformName + ":");
        for (Profile profile : profiles) {
            System.out.println(profile);
        }
    }
}