/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorSintatico;
import java.io.File;
        
public class GeradorSintatico {
    
    public static void main (String[] args) {
        //Localiza o arquivo
        String path = "D:/Documentos/NetBeansProjects/Analisador Léxico/src/codigo/LexerCup.flex";
        
       // chamada do método main
        geradorLexicoSint(path);
}
    
public static void geradorLexicoSint(String path){
   
    File file = new File(path); // abre o arquivo "Lexer.flex"
    JFlex.Main.generate(file); // gera a classe "Lexer.java"
}

}