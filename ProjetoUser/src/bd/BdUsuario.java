/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.*;
import javax.swing.JOptionPane;
import vo.Usuario;

/**
 *
 * @author info2025
 */
public class BdUsuario {
    public void insere(Usuario usuario) {
        String sql = "insert into usuario (nome, user, senha) values (?, ?, ?)";
        try {
            PreparedStatement ps = Bd.getCon().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getUser());
            ps.setString(3, usuario.getSenha());
            
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
    }
    
    public void atualiza(Usuario usuario) {
        String sql = "update usuario set nome=?, senha=? where user=?";
        try {
            PreparedStatement ps = Bd.getCon().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getUser());
            ps.setString(3, usuario.getSenha());
            
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
    }
    
    public Usuario localiza(String user) {
        String sql = "select * from usuario where user=?";
        Usuario usuario = null;

        try {
            PreparedStatement ps = Bd.getCon().prepareStatement(sql);
            ps.setString(1, user);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                usuario = new Usuario();
               
                usuario.setUser(rs.getString("user"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        
        return usuario;
    }
    
    public void exclui(String user) {
        String sql = "delete from usuario where user=?";        
        try {
            PreparedStatement ps = Bd.getCon().prepareStatement(sql);
            ps.setString(1, user);
            
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
    }
}