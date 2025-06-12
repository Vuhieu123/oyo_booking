package com.oyo.booking.backend.entities.notification;

import com.oyo.booking.backend.entities.base.BasePesistence;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "notification")
@Entity
public class Notification extends BasePesistence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

}
