package com.example.studentapplication.Domain;

public class FastedFoodDomain {
    private String title;
    private String pic;
    private Double star;
    private int time;

    public FastedFoodDomain(String title,String pic, Double star,int time){

        this.title=title;
        this.pic=pic;
        this.star=star;
        this.time=time;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getPic(){
        return pic;
    }
    public void setPic(String pic){
        this.pic=pic;
    }

    public Double getstar(){
        return star;
    }
    public void setstar(Double star){
        this.star=star;
    }
    public int gettime(){
        return time;
    }
    public void settime(int time){
        this.time=time;
    }
}
