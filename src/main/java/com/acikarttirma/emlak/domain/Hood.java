package com.acikarttirma.emlak.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Mahalle")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;
    private Long townId;
}
