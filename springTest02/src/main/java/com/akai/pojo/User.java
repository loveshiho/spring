package com.akai.pojo;

public class User {
    private Integer userid;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public void initUser(){
        System.out.println("第三步:User初始化");
    }
    public void destoryUser(){
        System.out.println("第五步:User销毁");
    }
    public User() {
        System.out.println("第一步:User构造");
    }

    public User(Integer userid, String username, String password) {
        System.out.println("allArgConstructor");
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public void setUserid(Integer userid) {
        System.out.println("第二步:User赋值");
        this.userid = userid;
    }

    public void setUsername(String username) {
        System.out.println("第二步:User赋值");
        this.username = username;
    }

    public void setPassword(String password) {
        System.out.println("第二步:User赋值");
        this.password = password;
    }
}
