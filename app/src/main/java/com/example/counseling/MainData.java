package com.example.counseling;

public class MainData {
    private int iv_profile;
    private String tv_name;
    private String tv_category;
    private String tv_add;

    public MainData(int iv_profile, String tv_name, String tv_category, String tv_add) {
        this.iv_profile = iv_profile;
        this.tv_name = tv_name;
        this.tv_category = tv_category;
        this.tv_add = tv_add;
    }


    public int getIv_profile() {
        return iv_profile;
    }

    public void setIv_profile(int iv_profile) {
        this.iv_profile = iv_profile;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public String getTv_category() {
        return tv_category;
    }

    public void setTv_category(String tv_category) {
        this.tv_category = tv_category;
    }

    public String getTv_add() {
        return tv_add;
    }

    public void setTv_add(String tv_add) {
        this.tv_add = tv_add;
    }
}
