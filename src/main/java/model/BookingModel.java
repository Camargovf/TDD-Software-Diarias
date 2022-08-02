package model;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingModel {

    @Id
    private String id;

    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberGuests;


}

