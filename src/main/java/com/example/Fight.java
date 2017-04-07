package com.example;

import lombok.*;

import javax.persistence.*;

/**
 * Created by SDA on 07.04.2017.
 */
@Entity
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fight {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "fight")
    private Combination combination;

    private String result;
}
