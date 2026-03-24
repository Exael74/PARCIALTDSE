package co.edu.eci.collatz.controller;

import co.edu.eci.collatz.dto.CollatzResponse;
import co.edu.eci.collatz.service.CollatzService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CollatzController {
    private final CollatzService collatzService;

    public CollatzController(CollatzService collatzService){
        this.collatzService = collatzService;
    }

    // Corregido: se agregó la 'e' que faltaba en 'sequence'
    @GetMapping("/collatzsequence")
    public ResponseEntity<?> collatzGet(@RequestParam(value = "value") String value) {
        return processRequest(value);
    }

    @PostMapping("/collatzsequence")
    public ResponseEntity<?> collatzPost(@RequestParam(value = "value") String value) {
        return processRequest(value);
    }

    private ResponseEntity<?> processRequest(String value) {
        if (value == null || value.isBlank()){
            return ResponseEntity.badRequest().body(Map.of("error", "Input value is required and cannot be blank."));
        }

        long n; 

        try {
            n = Long.parseLong(value.trim());
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", "Parameter 'value' must be a valid integer."));
        }

        try {
            String sequence = collatzService.generateSequence(n);
            return ResponseEntity.ok(new CollatzResponse("collatzsequence", n, sequence));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", e.getMessage()));
        }
    }
}
