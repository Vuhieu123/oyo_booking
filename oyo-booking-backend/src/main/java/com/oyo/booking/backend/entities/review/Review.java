package com.oyo.booking.backend.entities.review;

import com.oyo.booking.backend.entities.base.BasePesistence;
import com.oyo.booking.backend.entities.booking.Booking;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Set;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "review")
public class Review extends BasePesistence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content",columnDefinition = "TEXT")
    private String content;

    @Column(name = "rate_star")
    private Float rateStar;

    @Column(name = "have_img", nullable = false)
    private Boolean haveImage;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "review")
//    @Fetch(FetchMode.SUBSELECT)
//    private Set<ImageReview> imageReviewSet;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "booking_id")
//    private Booking booking;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(
//            name = "review_list_id",
//            referencedColumnName = "id",
//            foreignKey = @ForeignKey(name = "fk_association_review_review_list"),
//            nullable = false,
//            insertable = false,
//            updatable = false
//    )
    private ReviewList reviewList;

    @Column(name = "review_list_id")
    private Long reviewListId;

//    @Column(name = "status")
//    @Enumerated(EnumType.STRING)
//    private CommonStatusEnum status;

}
