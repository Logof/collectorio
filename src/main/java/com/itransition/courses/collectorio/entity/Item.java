package com.itransition.courses.collectorio.entity;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(name = "collection_id",nullable = false)
    private Long collectionId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String tags;

    @Column(name = "integer_field_1", length = 10)
    private Integer integerField1;

    @Column(name = "integer_field_2", length = 10)
    private Integer integerField2;

    @Column(name = "integer_field_3", length = 10)
    private Integer integerField3;

    @Column(name = "data_field_1", length = 10)
    private String dataField1;

    @Column(name = "data_field_2", length = 10)
    private String dataField2;

    @Column(name = "data_field_3", length = 10)
    private String dataField3;

    @Column(name = "small_string_field_1")
    private String smallStringField1;

    @Column(name = "small_string_field_2")
    private String smallStringField2;

    @Column(name = "small_string_field_3")
    private String smallStringField3;

    @Column(name = "big_string_field_1")
    private String bigStringField1;

    @Column(name = "big_string_field_2")
    private String bigStringField2;

    @Column(name = "big_string_field_3")
    private String bigStringField3;

    @Column(name = "check_field_1")
    private boolean checkField1;

    @Column(name = "check_field_2")
    private boolean checkField2;

    @Column(name = "check_field_3")
    private boolean checkField3;

}
