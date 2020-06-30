package com.example.Mini.Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DB {
    private ArrayList<User> userTable=new ArrayList<>();
    HashMap<String, String> wordTable =
            new HashMap<>();

    public DB(){
        wordTable.put("Sachin","A great Batsman");
        wordTable.put("Rahul","A good man");
        wordTable.put("gfg","good for coding" );
        userTable.add(new User(1 ,25,  "Ramu"));
        userTable.add(new User(2 ,40, "Raka"));
    }

    public String search(String word){
        return wordTable.get(word);
    }
    public User gerAUser(int id){
        for(User user:userTable){
            if(user.getId()==id)
                return user;
        }
        System.out.println("Cant found that user");
        return null;
    }
    public List<User> getAllUsers(){
        return userTable;
    }
    public boolean addAUser(User user){
        userTable.add(user);
        return true;
    }
    public boolean deleteAUser(int id){
        for(User user:userTable){
            if(user.getId()==id){
                userTable.remove(user);
                return true;
            }
        }
        System.out.println("Cant found that user");
        return false;
    }
}