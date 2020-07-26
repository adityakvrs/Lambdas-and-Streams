package com.epam.average;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
 
/**
 * To calculate average of numbers
 * 
 *
 */
public class Average {
 
    public static void main(String[] args) {
 
        int arr[] = {3,5,7,9,11}; 
 
        
 
        IntStream elements = Arrays.stream(arr);
 
        OptionalDouble averageOfNumbers = elements.average();
 
        System.out.println("Average of Numbers: " + averageOfNumbers.getAsDouble());
 
    }
 
 
}