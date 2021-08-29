package com.itransition.courses.collectorio;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 20)
    private String name;

    public String getRole() {
        return name;
    }

    public Role(Long id, String roleName) {
        this.id = id;
        this.name = roleName;
    }

    public Role(Long id) {
        this.id = id;
    }

    public Role(String roleName) {
        this.name = roleName;
    }

    public Role() {
    }
}
