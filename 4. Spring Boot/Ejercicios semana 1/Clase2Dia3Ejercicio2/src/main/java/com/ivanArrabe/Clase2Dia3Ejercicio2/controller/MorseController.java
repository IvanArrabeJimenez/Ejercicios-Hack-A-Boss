package com.ivanArrabe.Clase2Dia3Ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MorseController {

    @GetMapping("/morse/{palabra}")
    public String traducirAMorse(@PathVariable String palabra) {
        String palabraEnMorse = convertirMorse(palabra);
        return "La palabra " + palabra + " escrita en morse sería: " + palabraEnMorse;
    }

    private String convertirMorse(String palabra) {
        char[] abecedarioNumeros = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] codigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

        StringBuilder resultado = new StringBuilder();
        char[] palabraATraducir = palabra.toUpperCase().toCharArray();
        for (int i = 0; i < palabraATraducir.length; i++) {
            char caracter = palabraATraducir[i];
            // Busca el índice del carácter en el array abecedarioNumeros
            int indice = -1;
            for (int j = 0; j < abecedarioNumeros.length; j++) {
                if (abecedarioNumeros[j] == caracter) {
                    indice = j;
                    break;
                }
            }
            // Si el carácter está en el abecedario
            if (indice != -1) {
                // Agrega el equivalente Morse al resultado
                resultado.append(codigoMorse[indice]).append(" ");
            } else {
                // Si el carácter no está en el abecedario, agrega un espacio
                resultado.append(" ");
            }
        }
        return resultado.toString();
    }

}
