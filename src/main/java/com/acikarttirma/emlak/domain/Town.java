package com.acikarttirma.emlak.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "İlçe")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Town {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;
    private Long cityId;
}
