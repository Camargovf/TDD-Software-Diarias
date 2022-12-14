package com.vcamargo.tdd.repository;

import model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, String> {

    Optional<BookingModel> findbyReserveName(String name);

}
