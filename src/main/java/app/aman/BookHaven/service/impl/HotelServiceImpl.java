package app.aman.BookHaven.service.impl;

import app.aman.BookHaven.dto.HotelDto;
import app.aman.BookHaven.entity.Hotel;
import app.aman.BookHaven.exception.ResourceNotFoundException;
import app.aman.BookHaven.repository.HotelRepository;
import app.aman.BookHaven.service.HotelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@RequiredArgsConstructor
@Slf4j
@Service
public class HotelServiceImpl implements HotelService {

    private final ModelMapper modelMapper;
    private final HotelRepository hotelRepository;

    @Override
    public HotelDto createNewHotel(HotelDto hotelDto) {
        log.info("Creating new hotel for hotel name : {}", hotelDto.getName());
        Hotel hotel = modelMapper.map(hotelDto , Hotel.class);
        hotel.setActive(false);
        hotel = hotelRepository.save(hotel);
        log.info("Hotel Created with ID : {}" , hotel.getId());
        return modelMapper.map(hotel , HotelDto.class);

    }

    @Override
    public HotelDto getHotelById(Long id) {
        log.info("finding hotel by ID : " + id);

        Hotel hotel =  hotelRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel with ID not found : " + id));

        return modelMapper.map(hotel , HotelDto.class);
    }

    @Override

    public HotelDto updateHotelById(Long id, HotelDto hotelDto) {
        log.info("Updating the hotel with ID: {}", id);
        Hotel hotel = hotelRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: "+id));
        modelMapper.map(hotelDto, hotel);
        hotel.setId(id);
        hotel = hotelRepository.save(hotel);
        return modelMapper.map(hotel, HotelDto.class);
    }

    @Override
    @Transactional
    public void deleteHotelById(Long id) {

    }

    @Override
    public void activateHotel(Long hotelId) {

    }
}
