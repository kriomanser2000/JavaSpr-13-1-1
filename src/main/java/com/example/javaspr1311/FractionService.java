package com.example.javaspr1311;

import com.example.fractionservice.model.Fraction;
import org.springframework.stereotype.Service;

@Service
public class FractionService
{
    public boolean isValid(Fraction fraction)
    {
        return fraction.getDenominator() != 0;
    }
    public Fraction simplify(Fraction fraction)
    {
        int gcd = gcd(fraction.getNumerator(), fraction.getDenominator());
        return new Fraction(fraction.getNumerator() / gcd, fraction.getDenominator() / gcd);
    }
    public Fraction add(Fraction f1, Fraction f2)
    {
        int numerator = f1.getNumerator() * f2.getDenominator() + f2.getNumerator() * f1.getDenominator();
        int denominator = f1.getDenominator() * f2.getDenominator();
        return simplify(new Fraction(numerator, denominator));
    }
    public Fraction subtract(Fraction f1, Fraction f2)
    {
        int numerator = f1.getNumerator() * f2.getDenominator() - f2.getNumerator() * f1.getDenominator();
        int denominator = f1.getDenominator() * f2.getDenominator();
        return simplify(new Fraction(numerator, denominator));
    }
    public Fraction multiply(Fraction f1, Fraction f2)
    {
        int numerator = f1.getNumerator() * f2.getNumerator();
        int denominator = f1.getDenominator() * f2.getDenominator();
        return simplify(new Fraction(numerator, denominator));
    }
    public Fraction divide(Fraction f1, Fraction f2)
    {
        int numerator = f1.getNumerator() * f2.getDenominator();
        int denominator = f1.getDenominator() * f2.getNumerator();
        return simplify(new Fraction(numerator, denominator));
    }
    private int gcd(int a, int b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }
}
