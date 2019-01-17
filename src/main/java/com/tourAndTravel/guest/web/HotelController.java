package com.tourAndTravel.guest.web;

import com.tourAndTravel.guest.model.Hotel;
import com.tourAndTravel.guest.repository.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @GetMapping("/index/hotels")
    public String data(Model model) {
        model.addAttribute("hotel",hotelService.getAll());
        return "Post Package";
    }
    @GetMapping("/hotel/all")
    public String GetAll() {
        ModelAndView v = new ModelAndView();


        v.addObject("index");
        hotelService.getAll().iterator().hasNext();
        v.addObject(Hotel.class);
        return "Hotel";
    }


}


