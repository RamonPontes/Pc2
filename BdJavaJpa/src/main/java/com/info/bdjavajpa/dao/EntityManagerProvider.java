/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.info.bdjavajpa.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.Properties;

/**
 *
 * @author info2025
 */
public class EntityManagerProvider {
     private static EntityManagerFactory emf = null;
     private static EntityManager em = null;
     private EntityManagerProvider() { }
     
     public static EntityManagerFactory getEmf() {
        if (emf == null) {
            Properties prop = new Properties();
            prop.setProperty("jakarta.persistence.jdbc.url", "jdbc:mysql://localhost/professor?serverTimezone=America/Sao_Paulo");       
            prop.setProperty("jakarta.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
            prop.setProperty("jakarta.persistence.jdbc.password", "vertrigo");
            prop.setProperty("jakarta.persistence.jdbc.user", "root");

            emf = Persistence.createEntityManagerFactory("ProfessorPU", prop);
        }
        
        return emf;
    }
     
    public static EntityManager getEm() {
        if (em == null) {
            em = getEmf().createEntityManager();
        }
        
        return em;
    }
}
