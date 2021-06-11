/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Olek
 */
public class Project {
    public EntityManagerFactory emf;
    public EntityManager getEntityManager() {
        if (emf==null) emf = Persistence.createEntityManagerFactory("ProjectPU");
        return emf.createEntityManager();
    }
    
    public void zapisz( StudentEntity student) {
       EntityManager em = getEntityManager();
       em.getTransaction().begin();
       try {
            em.persist(student);
            // 5. zatwierdzić transakcję  
            em.getTransaction().commit();
        } 
        catch (Exception e) {
            System.err.print("Error "+e.getMessage());
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }
    }
    
    public List<StudentEntity> wyswietl() {
        EntityManager em = getEntityManager();
        TypedQuery<StudentEntity> q = em.createNamedQuery("StudentEntity.findAll",
                StudentEntity.class);
        
        
        List<StudentEntity> result = q.getResultList();
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
