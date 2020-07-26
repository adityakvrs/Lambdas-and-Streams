package com.epam.filter;
import java.util.stream.Stream; 
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * To find Strings which start with letter 'a' and has exactly length 3
 * 
 *
 */
  
public class filterthestrings { 
  
    public static void main(String[] args) 
    { 
        
       List<String> elements = Arrays.asList("git","dell","hp","aaa","aol","audi");
       String start_with_a = elements.stream() .filter(x -> x.startsWith("a") && x.length()==3) .collect(Collectors.joining("\n"));
       System.out.println(start_with_a);


    } 
} 