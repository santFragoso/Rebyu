package com.lintori.rebyu.Entities;

import com.lintori.rebyu.Generic.Date;

public class Item {

    private Integer id;
    private String title;
    private User addedBy;
    private Date createdAt;
    private Date updatedAt;

    public Item(Integer id, String title, User addedBy, Date createdAt, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.addedBy = addedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean equals(Object compared){
        boolean output = false;
        if (this == compared){
            output = true;
        }
        if (!(compared instanceof Item)){
            output = false;
        }
        Item comparedItem = (Item) compared;
        if (this.id == comparedItem.getId() &&
                this.title.equals(comparedItem.getTitle()) &&
                this.addedBy.equals(comparedItem.getAddedBy()) &&
                this.createdAt.equals(comparedItem.getCreatedAt()) &&
                this.updatedAt.equals(comparedItem.getUpdatedAt())
        ){
            output = true;
        }
        return output;
    }

}


