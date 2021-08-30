package com.itransition.courses.collectorio.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "collections")
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    private User author;

    @OneToMany
    private Set<Item> items = new HashSet<>();

    @ElementCollection(targetClass = Subject.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "subjects")
    @Enumerated(EnumType.STRING)
    private Set<Subject> subject = new HashSet<>();

    @Column(nullable = false)
    private String description;

    @Column(name = "integer1_visible")
    private boolean isInteger1Visible;

    @Column(name = "integer2_visible")
    private boolean isInteger2Visible;

    @Column(name = "integer3_visible")
    private boolean isInteger3Visible;

    @Column(name = "data1_visible")
    private boolean isData1Visible;

    @Column(name = "data2_visible")
    private boolean isData2Visible;

    @Column(name = "data3_visible")
    private boolean isData3Visible;

    @Column(name = "small_string1_visible")
    private boolean isSmallString1Visible;

    @Column(name = "small_string2_visible")
    private boolean isSmallString2Visible;

    @Column(name = "small_string3_visible")
    private boolean isSmallString3Visible;

    @Column(name = "big_string1_visible")
    private boolean isBigString1Visible;

    @Column(name = "big_string2_visible")
    private boolean isBigString2Visible;

    @Column(name = "big_string3_visible")
    private boolean isBigString3Visible;

    @Column(name = "check1_visible")
    private boolean isCheck1Visible;

    @Column(name = "check2_visible")
    private boolean isCheck2Visible;

    @Column(name = "check3_visible")
    private boolean isCheck3Visible;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Set<Subject> getSubject() {
        return subject;
    }

    public void setSubject(Set<Subject> subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInteger1Visible() {
        return isInteger1Visible;
    }

    public void setInteger1Visible(boolean integer1Visible) {
        isInteger1Visible = integer1Visible;
    }

    public boolean isInteger2Visible() {
        return isInteger2Visible;
    }

    public void setInteger2Visible(boolean integer2Visible) {
        isInteger2Visible = integer2Visible;
    }

    public boolean isInteger3Visible() {
        return isInteger3Visible;
    }

    public void setInteger3Visible(boolean integer3Visible) {
        isInteger3Visible = integer3Visible;
    }

    public boolean isData1Visible() {
        return isData1Visible;
    }

    public void setData1Visible(boolean data1Visible) {
        isData1Visible = data1Visible;
    }

    public boolean isData2Visible() {
        return isData2Visible;
    }

    public void setData2Visible(boolean data2Visible) {
        isData2Visible = data2Visible;
    }

    public boolean isData3Visible() {
        return isData3Visible;
    }

    public void setData3Visible(boolean data3Visible) {
        isData3Visible = data3Visible;
    }

    public boolean isSmallString1Visible() {
        return isSmallString1Visible;
    }

    public void setSmallString1Visible(boolean smallString1Visible) {
        isSmallString1Visible = smallString1Visible;
    }

    public boolean isSmallString2Visible() {
        return isSmallString2Visible;
    }

    public void setSmallString2Visible(boolean smallString2Visible) {
        isSmallString2Visible = smallString2Visible;
    }

    public boolean isSmallString3Visible() {
        return isSmallString3Visible;
    }

    public void setSmallString3Visible(boolean smallString3Visible) {
        isSmallString3Visible = smallString3Visible;
    }

    public boolean isBigString1Visible() {
        return isBigString1Visible;
    }

    public void setBigString1Visible(boolean bigString1Visible) {
        isBigString1Visible = bigString1Visible;
    }

    public boolean isBigString2Visible() {
        return isBigString2Visible;
    }

    public void setBigString2Visible(boolean bigString2Visible) {
        isBigString2Visible = bigString2Visible;
    }

    public boolean isBigString3Visible() {
        return isBigString3Visible;
    }

    public void setBigString3Visible(boolean bigString3Visible) {
        isBigString3Visible = bigString3Visible;
    }

    public boolean isCheck1Visible() {
        return isCheck1Visible;
    }

    public void setCheck1Visible(boolean check1Visible) {
        isCheck1Visible = check1Visible;
    }

    public boolean isCheck2Visible() {
        return isCheck2Visible;
    }

    public void setCheck2Visible(boolean check2Visible) {
        isCheck2Visible = check2Visible;
    }

    public boolean isCheck3Visible() {
        return isCheck3Visible;
    }

    public void setCheck3Visible(boolean check3Visible) {
        isCheck3Visible = check3Visible;
    }
}
