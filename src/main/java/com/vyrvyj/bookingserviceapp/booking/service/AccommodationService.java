package com.vyrvyj.bookingserviceapp.booking.service;

import com.vyrvyj.bookingserviceapp.booking.dto.accommodation.AccommodationDto;
import com.vyrvyj.bookingserviceapp.booking.dto.accommodation.AccommodationRequestDto;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccommodationService {
    AccommodationDto save(@Valid AccommodationRequestDto requestDto);

    Page<AccommodationDto> findAll(Pageable pageable);

    AccommodationDto getById(Long id);

    AccommodationDto update(Long id, @Valid AccommodationRequestDto requestDto);

    void delete(Long id);
}
