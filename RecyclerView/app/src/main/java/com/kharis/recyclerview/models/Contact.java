package com.kharis.recyclerview.models;

public class Contact {
    private String nama, tlp, imgURL;

    public Contact(String nama, String tlp, String imgURL) {
        this.nama = nama;
        this.tlp = tlp;
        this.imgURL = imgURL;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
