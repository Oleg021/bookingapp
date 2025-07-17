package com.vyrvyj.bookingserviceapp.booking.dto.accommodation;

import com.vyrvyj.bookingserviceapp.booking.model.Accommodation;
import java.math.BigDecimal;
import java.util.Set;

public record AccommodationDto(
        Long id,
        Accommodation.Type type,
        String address,
        String size,
        Set<String> amenities,
        BigDecimal dailyRate,
        Integer availability
) {
}
