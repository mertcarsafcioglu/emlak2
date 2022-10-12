package com.acikarttirma.emlak.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Kullanıcı")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private Long password;
    private  Long cityId;
    private  Long townId;
    private Long hoodId;
    private  String address;
    private  String firstName;
    private  String lastName;

}
