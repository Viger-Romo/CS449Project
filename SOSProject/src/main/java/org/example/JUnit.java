package org.example;

public class JUnit {

    /**
     * Code for isPrime function from geeksforgeeks.org
     * link: https://www.geeksforgeeks.org/java-prime-number-program/
     * @param n
     * @return true or falseon if number is Prime
     */
    public boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public String isEven(int n){
        if (n %2 == 0){
            return "Yes the number is even";
        }
        else if (n %2 == 1) {
            return "No, the number is not even";
        }
        else
            return "Number provided does not work";
    }
}
