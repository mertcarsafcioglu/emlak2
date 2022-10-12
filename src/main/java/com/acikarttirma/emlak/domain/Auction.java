package com.acikarttirma.emlak.domain;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDateTime;

@Entity
@Table(name = "Acik arttirma")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long UserId;
    private Long expertId;
    private  String description;
    private  String title;
    private LocalDateTime startDate;
    private  LocalDateTime endDate;
}
