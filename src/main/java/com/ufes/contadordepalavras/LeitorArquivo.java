/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.contadordepalavras;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Kevin
 */
public class LeitorArquivo {
    public List<String> ler(String caminhoArquivo) throws Exception {
        return Files.readAllLines(Paths.get(caminhoArquivo));
    }
}

