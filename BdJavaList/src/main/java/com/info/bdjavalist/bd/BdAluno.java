package com.info.bdjavalist.bd;

import com.info.bdjavalist.vo.Aluno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BdAluno {
    public void insere(Aluno aluno) {
        String sql = "insert into aluno(nome,serie,turma) values(?,?,?)";
        try {
            PreparedStatement ps = Bd.getCon().prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setInt(2, aluno.getSerie());
            ps.setString(3, aluno.getTurma());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
    }

    public void salva(Aluno aluno) {
        if (aluno.getId() == 0) {
            insere(aluno);
        } else {
            String sql = "update aluno set nome=?,serie=?,turma=? where id=?";
            try {
                PreparedStatement ps = Bd.getCon().prepareStatement(sql);
                ps.setInt(4, aluno.getId());
                ps.setString(1, aluno.getNome());
                ps.setInt(2, aluno.getSerie());
                ps.setString(3, aluno.getTurma());
                ps.execute();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
            }
        }
    }

    public Aluno localiza(int id) {
        String sql = "select * from aluno where id=?";
        Aluno registro = new Aluno();
        try {
            PreparedStatement ps = Bd.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                registro.setId(rs.getInt("id"));
                registro.setNome(rs.getString("nome"));
                registro.setSerie(rs.getInt("serie"));
                registro.setTurma(rs.getString("turma"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

    public List<Aluno> pesquisa(String busca) {
        String sql = "select * from aluno where nome like ?";
        List lista = new ArrayList<>();
        try {
            PreparedStatement ps = Bd.getCon().prepareStatement(sql);
            ps.setString(1, "%" + busca + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Aluno registro = new Aluno();
                registro.setId(rs.getInt("id"));
                registro.setNome(rs.getString("nome"));
                registro.setSerie(rs.getInt("serie"));
                registro.setTurma(rs.getString("turma"));
                lista.add(registro);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return lista;
    }

    public void exclui(int id) {
        String sql = "delete from aluno where id=?";
        try {
            PreparedStatement ps = Bd.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
    }
}