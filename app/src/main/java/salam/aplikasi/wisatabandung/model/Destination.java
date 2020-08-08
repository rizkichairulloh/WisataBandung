package salam.aplikasi.wisatabandung.model;

public class Destination {
    private String name;
    private String location;
    private String description;
    private String thumbnail;
    private String image;

    public Destination(String name, String location, String description, String thumbnail, String image) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.thumbnail = thumbnail;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
