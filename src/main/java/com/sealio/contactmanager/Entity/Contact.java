package com.sealio.contactmanager.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact_details")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cId;
    private String name;
    private String nickName;
    private String email;
    private String work;
    private String phone;
    private String imageUrl;
    @Column(length = 500)
    private String about;
    @ManyToOne
    private User user;


}
