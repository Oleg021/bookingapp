package com.vyrvyj.bookingserviceapp.booking.mapper;

import com.vyrvyj.bookingserviceapp.booking.config.MapperConfig;
import com.vyrvyj.bookingserviceapp.booking.dto.accommodation.AccommodationDto;
import com.vyrvyj.bookingserviceapp.booking.dto.accommodation.AccommodationRequestDto;
import com.vyrvyj.bookingserviceapp.booking.model.Accommodation;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", config = MapperConfig.class)
public interface AccommodationMapper {
    Accommodation toModel(AccommodationRequestDto requestDto);

    AccommodationDto toDto(Accommodation accommodation);

    void updateAccommodationFromDto(
            AccommodationRequestDto requestDto, @MappingTarget Accommodation accommodation
    );
}
