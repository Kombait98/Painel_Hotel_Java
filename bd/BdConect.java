/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
/**
 *
 * @author Aluno
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class BdConect {
    private Connection conexao;
    public boolean concetar(){
        try{
            String url = "jdbc:sqlite:src/bd/pimbago.db";
           this.conexao = DriverManager.getConnection(url);
        } catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
        if(false){
            System.out.println("nao conectou");    
        }else{
        System.out.println("conectou !");
        return true;
        }
        return true;
        }
    
}

