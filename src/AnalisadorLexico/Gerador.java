/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexico;

import java.io.File;
        
public class Gerador {
    public static void main (String[] args) {
        // mudar o caminho onde se encontra o arquivo "Lexer.flex"
        String path = "D:/Documentos/NetBeansProjects/Analisador_Diagrama_de_Classes/src/AnalisadorLexico/Lexer.flex";
        geradorLexico(path);
}
    
public static void geradorLexico(String path){
   
    File file = new File(path);
    JFlex.Main.generate(file);
    }
}
