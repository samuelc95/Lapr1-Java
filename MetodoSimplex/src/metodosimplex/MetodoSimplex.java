/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosimplex;

import com.sun.corba.se.impl.util.PackagePrefixChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Barros
 */
public class MetodoSimplex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String ficheiro = "funcao_objeto.txt";
        String ficheiroNovo = "novo_funcao_objeto.txt";
        Scanner lerFicheiro = new Scanner(new File(ficheiro));
        Formatter escreve = new Formatter(new File(ficheiroNovo));
        lerFicheiroTxt(lerFicheiro);
        gravaFicheiroTxt(escreve);
        
    }
    
    static String[] lerFicheiroTxt(Scanner ler){
        String aux;
        int count = 0;
        while (ler.hasNext()){
            aux = ler.nextLine();
            System.out.println(aux);
            String[] vars;
            
            if (){
                
            }
            count++;
        }
        return null;
    }
    
    static void gravaFicheiroTxt(Formatter escreve){
        String newVal = "ola";
        escreve.format(newVal);
    }
    
}
