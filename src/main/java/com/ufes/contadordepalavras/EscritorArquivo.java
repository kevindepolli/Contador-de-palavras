/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.contadordepalavras;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kevin
 */
public class EscritorArquivo {
    public void salvarRelatorio(Map<String, Integer> frequenciaPalavras, String caminhoDestino) throws Exception {
        List<String> relatorio = new ArrayList<>();
        for (Map.Entry<String, Integer> entrada : frequenciaPalavras.entrySet()) {
            relatorio.add(entrada.getKey() + ": " + entrada.getValue());
        }
        Files.write(Paths.get(caminhoDestino), relatorio);
    }
}

