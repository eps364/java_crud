package br.com.missionsst.jpa.testes;

import br.com.missionsst.jpa.model.Departamento;
import br.com.missionsst.jpa.model.Regiao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class TesteDepartamento extends SQLException {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pedidos_PU");
        EntityManager em = emf.createEntityManager();

        Regiao regiao = new Regiao();
        regiao.setCodRegiao((long) 14);


        Departamento departamento = new Departamento();
        departamento.setNomeDepartamento("Informatica");
        departamento.setCodRegiao(regiao);

        em.getTransaction().begin();
        em.persist(departamento);

        em.getTransaction().commit();


        System.out.println("departamento.toString() = " + departamento.toString());
        em.close();
        emf.close();
    }
}
