package com.ramengo.models;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "proteins")
@Table(name = "proteins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Protein {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String imageInactive;
    private String imageActive;
    private String name;
    private String description;
    private Integer price;

}
