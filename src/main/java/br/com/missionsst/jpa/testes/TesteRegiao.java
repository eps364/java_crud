package br.com.missionsst.jpa.testes;

import br.com.missionsst.jpa.model.Cliente;
import br.com.missionsst.jpa.model.Regiao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class TesteRegiao extends SQLException {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pedidos_PU");
        EntityManager em = emf.createEntityManager();

        Regiao regiao = new Regiao("Sudeste");

        em.getTransaction().begin();
        em.persist(regiao);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
