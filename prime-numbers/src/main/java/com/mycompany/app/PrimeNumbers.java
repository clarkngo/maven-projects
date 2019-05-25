package com.mycompany.app;

import java.lang.Iterable;
import java.util.*;


/**
 * Prime Numbers
 *
 */
public class PrimeNumbers implements Iterable<Integer>
{
    private List<Integer> primes = new ArrayList<Integer>();

    public void computePrimes (int n) 
    {
        int count = 1; // count of primes
        int number = 2; // number tested for primeness
        boolean isPrime; // is this number a prime
        while (count <= n)
        {
            isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++)
            {
                if (number % divisor == 0)
                {
                    isPrime = false;
                    break; // for loop
                }
            }
            if (isPrime && (number % 10 != 9)) // FAULT
            {
                primes.add (number);
                count++;
            }
            number++;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return primes.iterator();
    }

    @Override public String toString()
    {
        return primes.toString();    
    }
    public static void main( String[] args )
    {
        PrimeNumbers pNum = new PrimeNumbers();
        pNum.computePrimes(4);
        pNum.toString();
        pNum.iterator();
        System.out.println(pNum.toString());
        System.out.println(pNum.iterator());
    }
}
