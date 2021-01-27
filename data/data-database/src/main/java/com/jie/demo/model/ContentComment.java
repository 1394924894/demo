package com.jie.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "myshop..content_comment")
public class ContentComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "content_id")
    private Integer contentId;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return content_id
     */
    public Integer getContentId() {
        return contentId;
    }

    /**
     * @param contentId
     */
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
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