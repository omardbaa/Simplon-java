package dao;


import model.Administrateur;
import model.Employe;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.*;


public class DaoAdministrateur implements IDao<Administrateur> {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("connect");
	@Override
    public void save(Administrateur adminstrateur){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if (adminstrateur.getId()==null){
            em.persist(adminstrateur);
        }else {
            em.merge(adminstrateur);
        }

        tx.begin();
        tx.commit();
    }
	@Override
    public Administrateur show(Long id){
        EntityManager em = emf.createEntityManager();
        return em.find(Administrateur.class,id);
    }
	@Override
	public void delete(Long id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(em.find(Administrateur.class,id));
        tx.commit();
        System.out.println("L'administarteur ayant l'id "+id +" a été supprimé");
    }
	@Override
	public List findX() {
		List<Administrateur> listadmin = new ArrayList<Administrateur>();
		 EntityManager em = emf.createEntityManager();
	        EntityTransaction tx = em.getTransaction();
	        tx.begin();
	        em.find(Administrateur.class, tx);
	        tx.commit();
	        System.out.println("Voici la liste des admin");
			return listadmin;
	}
		public boolean logIn(String Email,String password) {
        EntityManager em = emf.createEntityManager();
        Administrateur admin= new Administrateur();
        admin = em.find(Administrateur.class,Email);
        if(admin.getPasswordAdmin()==password)
            return true;
        else 
            return false;
    }

}
