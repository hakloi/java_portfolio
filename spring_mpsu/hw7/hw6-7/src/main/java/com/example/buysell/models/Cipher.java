package com.example.buysell.models;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity


@Data
@AllArgsConstructor
// @NoArgsConstructor
public class Cipher {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "id")
    private Long id;

    // @Column(name = "title")
    private String title;

    // @Column(name = "desc", columnDefinition = "text")
    private String description;

    // @Column(name = "creator")
    private String creator;

    // @Column(name = "year")
    private int yearCreated;
}