package com.cnweb20211.soict.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart")
public class Cart implements Serializable {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cartId;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JsonIgnore
//    @JoinColumn(name = "email", referencedColumnName = "email")
    private User user;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true,
            mappedBy = "cart")
    private Set<ProductInOrder> products = new HashSet<>();

    public Cart(User user) {
        this.user  = user;
    }

}
