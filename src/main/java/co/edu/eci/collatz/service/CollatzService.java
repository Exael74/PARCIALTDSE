package co.edu.eci.collatz.service;

import org.springframework.stereotype.Service;

@Service
public class CollatzService {

    /**
     * Generates the Collatz sequence.
     *
     * @param n the starting positive integer
     * @return a string with each term separated by " -> ", e.g. "13 -> 40 -> ... -> 1"
     * @throws IllegalArgumentException if n is not a positive integer
     */
    public String generateSequence(long n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer greater than zero.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            sb.append(" -> ").append(n);
        }
        return sb.toString();
    }
}
