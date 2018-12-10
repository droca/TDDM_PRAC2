
package com.example.roca486.prac2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Track {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("singer")
    @Expose
    private String singer;
    @SerializedName("title")
    @Expose
    private String title;

    /**
     * No args constructor for use in serialization
     *
     */
    public Track() {
    }

    /**
     *
     * @param id
     * @param title
     * @param singer
     */
    public Track(Integer id, String singer, String title) {
        super();
        this.id = id;
        this.singer = singer;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Track withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Track withSinger(String singer) {
        this.singer = singer;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Track withTitle(String title) {
        this.title = title;
        return this;
    }

}