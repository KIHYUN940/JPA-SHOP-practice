package jpabook.jpashop.domain;

import jakarta.persistence.Entity;

@Entity
public class Album extends Item {

    private String artist;
    private String atc;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAtc() {
        return atc;
    }

    public void setAtc(String atc) {
        this.atc = atc;
    }
}
