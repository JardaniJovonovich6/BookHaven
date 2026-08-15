package app.aman.BookHaven.controller;


import app.aman.BookHaven.dto.HotelDto;
import app.aman.BookHaven.dto.HotelInfoDto;
import app.aman.BookHaven.dto.HotelPriceDto;
import app.aman.BookHaven.dto.HotelSearchRequest;
import app.aman.BookHaven.service.HotelService;
import app.aman.BookHaven.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @PostMapping("/search")
    public ResponseEntity<Page<HotelPriceDto>> searchHotels(
            @RequestBody HotelSearchRequest hotelSearchRequest) {

        Page<HotelPriceDto> page =
                inventoryService.searchHotels(hotelSearchRequest);

        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }

}
