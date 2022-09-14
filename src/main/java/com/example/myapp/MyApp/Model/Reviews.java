package com.example.myapp.MyApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="REVIEWS")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private long id;
    @Column(name="REVIEW_BODY")
    private String reviewBody;
    /*@Column(name="CITY")
    private String city;
    @Column(name="STATE")
    private String state;
    @Column(name="RATING")
    private int rating;
    @Column(name="CREATED_DATE")
    private Date createdAt;
    @Column(name="CREATED_BY")
    private String createdBy;
    @Column(name="REVIEW_DATE")
    private Date reviewDate;
    @Column(name="MODIFIED_DATE")
    private Date modifiedAt;
    @Column(name="MODIFIED_BY")
    private String modifiedBy;*/

}
