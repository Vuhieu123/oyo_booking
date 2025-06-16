package com.oyo.booking.backend.entities.wish;

import com.oyo.booking.backend.entities.base.BasePesistence;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "wish_item")
public class WishItem  extends BasePesistence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(
//            name = "accom_id",
//            referencedColumnName = "id",
//            foreignKey = @ForeignKey(name = "fk_association_wish_item_accom"),
//            nullable = false,
//            insertable = false,
//            updatable = false
//    )
//    private AccomPlace accomPlace;

    @Column(name = "accom_id")
    private Long accomId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "wish_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_association_wish_item_wish_list"),
            nullable = false,
            insertable = false,
            updatable = false
    )
    private WishList wishList;

    @Column(name = "wish_id")
    private Long wishId;

}
