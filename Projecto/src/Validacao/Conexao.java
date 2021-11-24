/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel Banze
 */
public class Conexao {
    
    /*private String caminho = "localhost";
    private String porta = "3306";
    private String nome = "db_pastelaria";
    private String usuario = "root";
    private String senha = "";
    
    private String url = "jdbc:mysql://" + caminho + ":" + porta + "/" + nome + "?useTimezone=true&serverTimezone=GMT";
    
    public static Conexao getConnection (){
        Conexao conexao = null;
        if (conexao == null){
            conexao = new Conexao();
            return conexao;
        }else {
            return null;
        }
    }
    
    public void Conectar (){
        try {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conectado com sucesso");
        } catch (Exception ex){
            System.err.println("ERRO AO CONECTAR COM A BD: \n" + ex);
        }
    }*/
    
    //metodo para conexao
    
    public static Connection Conector (){
        java.sql.Connection conexao = null;
        
        //chamada do driver
        String driver = "com.mysql.jdbc.Driver";
        
        //informacoes referentes a DB
        String url = "jdbc:mysql://localhost:3306/db_pastelaria";
        String user = "root";
        String password = "";
        
        //estabelecendo a conexao com a DB
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //indetificador de erro na conexao
            //System.out.println(e);
            return null;
        }
    }
}
