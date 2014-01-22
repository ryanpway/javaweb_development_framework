package com.inspur.oa.user.domain;

/**
 * Created with IntelliJ IDEA.
 * User: zhangpengwei
 * Date: 13-11-27
 * Time: 上午9:22
 */
public class User {

    private String host;
    private String username;
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
