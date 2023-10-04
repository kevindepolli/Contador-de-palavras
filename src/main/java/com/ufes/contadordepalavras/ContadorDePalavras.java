/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.contadordepalavras;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Kevin
 */
public class ContadorDePalavras {

    public static void main(String[] args) {
        LeitorArquivo leitor = new LeitorArquivo();
        ProcessadorTexto processador = new ProcessadorTexto();
        EscritorArquivo escritor = new EscritorArquivo();

        try {
            List<String> linhas = leitor.ler("exemplo.txt");
            Map<String, Integer> frequenciaPalavras = processador.contarFrequenciaPalavras(linhas);
            escritor.salvarRelatorio(frequenciaPalavras, "relatorio.txt");
        } catch (Exception e) {
            System.out.println("Falha: " + e.getMessage());
        }
    }

}

