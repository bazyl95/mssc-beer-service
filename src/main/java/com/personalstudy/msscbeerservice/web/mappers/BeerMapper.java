package com.personalstudy.msscbeerservice.web.mappers;

import com.personalstudy.msscbeerservice.model.Beer;
import com.personalstudy.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDto dto);

    BeerDto beerToBeerDto(Beer beer);
}
