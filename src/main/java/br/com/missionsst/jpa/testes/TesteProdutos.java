package br.com.missionsst.jpa.testes;

import br.com.missionsst.jpa.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class TesteProdutos extends SQLException {

    public static void main(String[] args)  {
        Produto p = new Produto();

        p.setDescricao("Teste JPA");
        p.setPreco(1.45f);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pedidos_PU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

}
