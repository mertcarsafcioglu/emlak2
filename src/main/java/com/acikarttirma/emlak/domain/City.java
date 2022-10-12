package com.acikarttirma.emlak.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Şehir")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;

}
