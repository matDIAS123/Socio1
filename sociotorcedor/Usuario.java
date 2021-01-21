/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sociotorcedor;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Usuario {
    
    private int usuCod;
    private String usuNome;
    private String usuTipo;
    private String usuSenha;

    public int getUsuCod() {
        return usuCod;
    }

    public void setUsuCod(int usuCod) {
        this.usuCod = usuCod;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuTipo() {
        return usuTipo;
    }

    public void setUsuTipo(String usuTipo) {
        this.usuTipo = usuTipo;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }
  
      public void adicionar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        try{
        dados.put("Nome", usuNome);
        dados.put("Senha", usuSenha);
        dados.put("Tipo", usuTipo);
        
        db.conectar();
        
        JOptionPane.showMessageDialog(null, "usuario inserido!");
        }catch (SQLException ex){
        db.insert("Usuario", dados);
        JOptionPane.showMessageDialog(null, "usuario não inserido!");
        }
        db.desconectar();
    }
}
