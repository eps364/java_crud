package br.com.missionsst.testes;

import br.com.missionsst.modal.bean.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteProdutos {

    public static void main(String[] args) {
        Produto p = new Produto();

        p.setDescricao("Teste JPA");
        p.setPreco(1.45f);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyConnection");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

}
