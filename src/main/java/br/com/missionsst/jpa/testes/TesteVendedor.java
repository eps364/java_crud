package br.com.missionsst.jpa.testes;

import br.com.missionsst.jpa.model.Vendedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class TesteVendedor extends SQLException {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pedidos_PU");
        EntityManager em = emf.createEntityManager();

        Vendedor vendedor = new Vendedor("Jose Vendedor", (double) 5, (double) 2000);

        em.getTransaction().begin();
        em.persist(vendedor);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
