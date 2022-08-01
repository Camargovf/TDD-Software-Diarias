package model;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.time.LocalDate;


@Data
@AllArgsConstructor
public class BookingModel {

    private String id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberGuests;

    }

