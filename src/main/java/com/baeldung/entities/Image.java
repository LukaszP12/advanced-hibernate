package com.baeldung.entities;

public class Image {

    public Image() {
    }

    public Image(String file_name) {
        this.file_name = file_name;
    }

    private String file_name;

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
}
