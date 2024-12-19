package com;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post("Social networks in the future", "2024-12-18 10:00:00");
        Post post2 = new Post("Java and its classes", "2024-12-18 11:00:00");


        Profile profile1 = new Profile("jack_noah", "jack@gmail.com");
        profile1.addPost(post1);

        Profile profile2 = new Profile("jane_doe", "jane@gmail.com");
        profile2.addPost(post2);


        SocialNetwork socialNetwork = new SocialNetwork("Gmail");
        socialNetwork.addProfile(profile1);
        socialNetwork.addProfile(profile2);


        socialNetwork.displayProfiles();


        profile1.displayPosts();
        profile2.displayPosts();

    }
}