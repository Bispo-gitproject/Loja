package br.alura.loja.teste;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class TESTE {
	



	static class Result {

	    /*
	     * Complete the 'fizzBuzz' function below.
	     *
	     * The function accepts INTEGER n as parameter.
	     */

	    public static void fizzBuzz(int n) {
	    // Write your code here
	    for (int i = 1; i<= n; i++){
	        if(i%3 ==0 && i%5 ==0){
	            System.out.print("FizzBuzz");
	        }
	        if(i%3 ==0){
	            System.out.print("Fizz");
	        }
	        if(i%5 ==0){
	            System.out.print("Buzz");
	        }else{
	            System.out.print(i);
	        }
	    }

	    }

	}

	public class Solution {
	    public void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        Result.fizzBuzz(20);

	        bufferedReader.close();
	    }
	}

}
