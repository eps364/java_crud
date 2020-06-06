package br.com.missionsst.jpa.testes;

import br.com.missionsst.jpa.model.Produto;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class TesteProduto extends SQLException {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pedidos_PU");
        EntityManager em = emf.createEntityManager();

        Produto produto = new Produto("Teclado", (float) 30.25 );

        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
