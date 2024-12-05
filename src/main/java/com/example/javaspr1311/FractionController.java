package com.example.javaspr1311;

import com.example.fractionservice.model.Fraction;
import com.example.fractionservice.service.FractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fractions")
public class FractionController
{
    @Autowired
    private FractionService fractionService;
    @GetMapping("/is-valid")
    public boolean isValid(@RequestParam int numerator, @RequestParam int denominator)
    {
        return fractionService.isValid(new Fraction(numerator, denominator));
    }
    @GetMapping("/simplify")
    public Fraction simplify(@RequestParam int numerator, @RequestParam int denominator)
    {
        return fractionService.simplify(new Fraction(numerator, denominator));
    }
    @GetMapping("/add")
    public Fraction add(@RequestParam int num1, @RequestParam int den1, @RequestParam int num2, @RequestParam int den2)
    {
        return fractionService.add(new Fraction(num1, den1), new Fraction(num2, den2));
    }
    @GetMapping("/subtract")
    public Fraction subtract(@RequestParam int num1, @RequestParam int den1, @RequestParam int num2, @RequestParam int den2)
    {
        return fractionService.subtract(new Fraction(num1, den1), new Fraction(num2, den2));
    }
    @GetMapping("/multiply")
    public Fraction multiply(@RequestParam int num1, @RequestParam int den1, @RequestParam int num2, @RequestParam int den2)
    {
        return fractionService.multiply(new Fraction(num1, den1), new Fraction(num2, den2));
    }
    @GetMapping("/divide")
    public Fraction divide(@RequestParam int num1, @RequestParam int den1, @RequestParam int num2, @RequestParam int den2)
    {
        return fractionService.divide(new Fraction(num1, den1), new Fraction(num2, den2));
    }
}
