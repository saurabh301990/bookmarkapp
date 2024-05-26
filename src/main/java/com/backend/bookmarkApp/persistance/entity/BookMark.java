package com.backend.bookmarkApp.persistance.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "bookmark")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookMark {

    @Id
    @SequenceGenerator(name = "bm_id_seq_gen",sequenceName = "bq_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bm_id_seq_gen")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String url;

    @CreationTimestamp
    private Instant createdAt;

}
