package br.com.missionsst.jpa.testes;

import br.com.missionsst.jpa.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class TesteCliente extends SQLException {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pedidos_PU");
        EntityManager em = emf.createEntityManager();

        Cliente cliente = new Cliente("Emerson Silva", "Rua Joao Santino, 50",
                "Santo Antonio de Posse", "13831-012", "SP", "32521454721", "2156465487", (double) 1000);

        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
