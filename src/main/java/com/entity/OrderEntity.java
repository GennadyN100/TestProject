package com.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "order_list")

public class OrderEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private int id;

    @Column(name = "order_name", nullable = false)
    private String name;

    public OrderEntity(String name) {
        this.name = name;
    }
}
