
package Validacao;

import Operacao.Menu;
import java.util.ArrayList;

public class Validar {
    
    public boolean Usuario (String nome, String senha){
        
        int indexNome, indexSenha;
        ArrayList <String> usuarios = new ArrayList();
        ArrayList <String> senhas = new ArrayList();
        
        //Adicionando usuarios
        usuarios.add("Angel");
        usuarios.add("");
        usuarios.add("");
        usuarios.add("");
        usuarios.add("");
        usuarios.add("");
        
        //registando senhas
        senhas.add("Nguilazi");
        senhas.add("");
        senhas.add("");
        senhas.add("");
        senhas.add("");
        senhas.add("");
        
        if (usuarios.contains(nome) && senhas.contains(senha)){
            indexNome = usuarios.indexOf(nome);
            indexSenha = senhas.indexOf(senha);
            return (indexSenha == indexNome);
        }
        return false;
    }
    
    public boolean Vendas (String produto, int quantidade){
        
        return false;
    }
}
