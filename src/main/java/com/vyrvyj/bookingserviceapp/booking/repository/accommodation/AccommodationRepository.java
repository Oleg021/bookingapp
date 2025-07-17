package com.vyrvyj.bookingserviceapp.booking.repository.accommodation;

import com.vyrvyj.bookingserviceapp.booking.model.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
}
