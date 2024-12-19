package com;

import java.util.ArrayList;
import java.util.Objects;

public class Profile {
    private String username;
    private String email;
    private ArrayList<Post> posts;


    public Profile(String username, String email) {
        this.username = username;
        this.email = email;
        this.posts = new ArrayList<>();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }


    public void addPost(Post post) {
        posts.add(post);
    }

    public void displayPosts() {
        System.out.println(username + "'s Posts:");
        for (Post post : posts) {
            System.out.println(post);
        }
    }


    public String toString() {
        return "Profile{" + "username='" + username + '\'' + ", email='" + email + '\'' + ", posts=" + posts.size() + '}';
    }


    public boolean equals(Object num1) {
        if (this == num1) return true;
        if (!(num1 instanceof Profile)) return false;
        Profile profile = (Profile) num1;
        return Objects.equals(username, profile.username) &&
                Objects.equals(email, profile.email);
    }


    public int hashCode() {
        return Objects.hash(username, email);
    }
}