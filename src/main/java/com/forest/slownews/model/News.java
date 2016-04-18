package com.forest.slownews.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class News {
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "enclosure")
    private ImageLink image = new ImageLink();
    @XmlElement(name = "pubDate")
    private String pubDate;

    public News() { }

    public News (String title, String description, String image, String pubDate) {
        this.title = title;
        this.description = description;
        this.pubDate = pubDate;
        this.image.setUrl(image);
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image.setUrl(image);
    }

    public String getImage() {
        return image.getUrl();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
