package DTO;

public class User {
    private String UserName;
    private String PassWord;
    private int Level;
    public User(String userName, String passWord, int level) {
        UserName = userName;
        PassWord = passWord;
        Level = level;
    }
    public User() {
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getPassWord() {
        return PassWord;
    }
    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }
    
}
