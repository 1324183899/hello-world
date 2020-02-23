package com.example.demo.entity;

public class UserPosition {
    private Integer id;
    private String boss;
    private String manager;
    private String cfo;
    private String cto;
    private String clerk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getCfo() {
        return cfo;
    }

    public void setCfo(String cfo) {
        this.cfo = cfo;
    }

    public String getCto() {
        return cto;
    }

    public void setCto(String cto) {
        this.cto = cto;
    }

    public String getClerk() {
        return clerk;
    }

    public void setClerk(String clerk) {
        this.clerk = clerk;
    }

    @Override
    public String toString() {
        return "UserPosition{" +
                "id=" + id +
                ", boss='" + boss + '\'' +
                ", manager='" + manager + '\'' +
                ", cfo='" + cfo + '\'' +
                ", cto='" + cto + '\'' +
                ", clerk='" + clerk + '\'' +
                '}';
    }
}
