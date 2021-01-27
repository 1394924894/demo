package com.jie.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "myshop..content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_id")
    private Integer categoryId;

    private String author;

    private String title;

    @Column(name = "sub_title")
    private String subTitle;

    private String pic1;

    private String pic2;

    private String pic3;

    private Date created;

    private Date updated;

    private byte[] text;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return sub_title
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * @param subTitle
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * @return pic1
     */
    public String getPic1() {
        return pic1;
    }

    /**
     * @param pic1
     */
    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    /**
     * @return pic2
     */
    public String getPic2() {
        return pic2;
    }

    /**
     * @param pic2
     */
    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    /**
     * @return pic3
     */
    public String getPic3() {
        return pic3;
    }

    /**
     * @param pic3
     */
    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * @return text
     */
    public byte[] getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(byte[] text) {
        this.text = text;
    }
}