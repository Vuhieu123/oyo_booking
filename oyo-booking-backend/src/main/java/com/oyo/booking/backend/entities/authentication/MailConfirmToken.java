//package com.oyo.booking.backend.entities.authentication;
//
//import com.oyo.booking.backend.entities.base.BasePesistence;
//import com.oyo.booking.backend.entities.booking.BookingList;
//import com.oyo.booking.backend.entities.notification.Notification;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
//import org.hibernate.annotations.Fetch;
//import org.hibernate.annotations.FetchMode;
//
//import java.util.Set;
//
//@SuperBuilder
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name = "users")
//public class MailConfirmToken extends BasePesistence {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "user_name")
//    private String userName;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "last_name")
//    private String lastName;
//
//    @Column(name = "gender")
//    private Integer gender;
//
//    @Column(name = "date_of_birth")
//    private LocalDate dateOfBirth;
//
//    @Column(name = "mail", unique = true)
//    private String mail;
//
//    @Column(name = "address")
//    private String address;
//
//    @Column(name = "phone")
//    private String phone;
//
//    @Column(name = "avatar_url")
//    private String avatarUrl;
//
//    @Column(name = "provider", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private AuthProviderEnum provider;
//
//    @Column(name = "provider_id")
//    private String providerId;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    @Fetch(FetchMode.SUBSELECT)
//    private Set<RefreshToken> refreshTokenSet;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    @Fetch(FetchMode.SUBSELECT)
//    private Set<AccomPlace> accomPlace;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipient")
//    @Fetch(FetchMode.SUBSELECT)
//    private Set<Notification> notifications;
//
//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private WishList wishList;
//
//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private BookingList bookingList;
//
//
//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private ReviewList reviewList;
//
//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "user_role",
//            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
//    )
//    private Set<Role> roleSet;
//
//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private MailConfirmToken mailConfirmToken;
//
//    @Column(name = "status")
//    @Enumerated(EnumType.STRING)
//    private UserStatusEnum status;
//
//}
