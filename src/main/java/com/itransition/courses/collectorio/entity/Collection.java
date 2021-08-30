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
}
