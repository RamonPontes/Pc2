/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.info.bdjavajpa.dao;

import com.info.bdjavajpa.vo.Professor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author info2025
 */
public class ProfessorDao {
    EntityManager em;
    
    public ProfessorDao() {
        em = EntityManagerProvider.getEm();
    }
    
    public void salva(Professor p) {
        em.getTransaction().begin();
        
        if (p.getId() == 0) {
            em.persist(p);
        } else {
            em.merge(p);
        }
        
        em.getTransaction().commit();
    }
    
    public Professor localiza(int id) {
        Professor p = em.find(Professor.class, id);
        
        return p;
    }
    
    public void exclui(int id) {
        em.getTransaction().begin();
        Professor p = em.find(Professor.class ,id);
        em.remove(p);
        em.getTransaction().commit();
    }
    
    public List<Professor> pesquisa(String nome) {
        Query q = em.createNativeQuery("select * from PROFESSOR where nome like ? order by nome", Professor.class);
        q.setParameter(1, "%" + nome + "%");
        List<Professor> lista = q.getResultList();
        
        return lista;
    }
}
