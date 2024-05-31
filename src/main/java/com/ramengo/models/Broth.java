package com.ramengo.models;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "broths")
@Table(name = "broths")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Broth {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String imageInactive;
    private String imageActive;

    private String name;
    private String description;
    private Integer price;

}
