package ed.jpa;

import entity.Myuser;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Matthew Coulter
 */
public class MyuserDB {

    private EntityManager em = null;

    public MyuserDB() {
// using default persistence unit defined in the persistence.xml file
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ED-EntityPU");
        em = emf.createEntityManager();
    }

    public EntityManager getEntityManger() {
        return em;
    }

    public Myuser findMyuser(String userid) {
        return em.find(Myuser.class, userid);
    }

    public boolean createMyuser(Myuser myuser) throws Exception {
        try {
            if (findMyuser(myuser.getUserid()) != null) {
// myuser exists already
                return false;
            }
// myuser does not exist in database
            em.getTransaction().begin();
            em.persist(myuser); // to add an object to database
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean createRecord(MyuserDTO myuserDTO) {
        Myuser myuser = this.myDTO2DAO(myuserDTO);
        boolean result = false;
        try {
            result = this.createMyuser(myuser);
        } catch (Exception ex) {
        }
        return result;
    }

    private Myuser myDTO2DAO(MyuserDTO myDTO) {
        Myuser myuser = new Myuser();
        myuser.setUserid(myDTO.getUserid());
        myuser.setName(myDTO.getName());
        myuser.setPassword(myDTO.getPassword());
        myuser.setEmail(myDTO.getEmail());
        myuser.setPhone(myDTO.getPhone());
        myuser.setAddress(myDTO.getAddress());
        myuser.setSecqn(myDTO.getSecQn());
        myuser.setSecans(myDTO.getSecAns());
        return myuser;
    }
}
