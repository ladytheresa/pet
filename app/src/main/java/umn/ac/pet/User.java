package umn.ac.pet;

public class User {
    private String username;
    private String uid;
    private int level;
    private int exp;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }



    public User(String username, String uid, int level, int exp) {
        this.username = username;
        this.uid=uid;
        this.level=level;
        this.exp=exp;
    }

    public String getUsername() {
        return username;
    }

    public String getUid() {
        return uid;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

}