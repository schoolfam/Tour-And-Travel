package com.tourAndTravel.guest.web;

import com.tourAndTravel.guest.model.HotelPackages;
import com.tourAndTravel.guest.repository.PackageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class PackageController {

    PackageService packageService;

    @GetMapping("/package")
    public String GetAllPackages(Model model) {
        model.addAttribute("packages", new HotelPackages());
        return "Post Package";
    }


    @PostMapping("/PostPackage")
    public String store(HotelPackages packages, Errors error, Model model) {
        if (error.hasErrors()) {
            model.addAttribute("packages", new HotelPackages());

        }

        return "Post Package";
    }

}

