package com.currencyconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterController {

    @GetMapping("/")
    public String index() {
        return "index.html"; // Ensure this matches your template file name
    }

    @PostMapping("/convert")
    public String convert(@RequestParam double rands, Model model) {
        double exchangeRate = 0.052; // Example rate: 1 ZAR = 0.052 EUR
        double euros = rands * exchangeRate;
        model.addAttribute("euros", euros);
        model.addAttribute("rands", rands);
        return "index";
    }
}
