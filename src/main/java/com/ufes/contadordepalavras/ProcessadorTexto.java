/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.contadordepalavras;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kevin
 */
public class ProcessadorTexto {
    public Map<String, Integer> contarFrequenciaPalavras(List<String> linhas) {
        Map<String, Integer> frequenciaPalavras = new HashMap<>();
        for (String linha : linhas) {
            String[] palavras = linha.split(" ");
            for (String palavra : palavras) {
                frequenciaPalavras.put(palavra, frequenciaPalavras.getOrDefault(palavra, 0) + 1);
            }
        }
        return frequenciaPalavras;
    }
}

