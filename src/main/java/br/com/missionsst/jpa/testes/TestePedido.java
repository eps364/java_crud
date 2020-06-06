package br.com.missionsst.jpa.testes;

import br.com.missionsst.jpa.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.Date;

public class TestePedido extends SQLException {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pedidos_PU");
        EntityManager em = emf.createEntityManager();

        Cliente cliente = new Cliente();
        cliente.setCodCliente((long) 1);
        Vendedor vendedor = new Vendedor();
        vendedor.setCodVendedor((long) 2);

        Pedido pedido = new Pedido(new Date(), new Date(), cliente, vendedor);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();

        produto1.setCodigo((long) 3);
        produto2.setCodigo((long) 3);
        produto3.setCodigo((long) 32);
        produto4.setCodigo((long) 33);
        ItemPedido itemPedido1 = new ItemPedido(pedido, produto1, (double) 3, (double) 3.5);
        ItemPedido itemPedido2 = new ItemPedido(pedido, produto2, (double) 3, (double) 3.5);
        ItemPedido itemPedido3 = new ItemPedido(pedido, produto3, (double) 3, (double) 3.5);
        ItemPedido itemPedido4 = new ItemPedido(pedido, produto4, (double) 3, (double) 3.5);

        em.getTransaction().begin();
        em.persist(pedido);
        em.persist(itemPedido1);
        em.persist(itemPedido2);
        em.persist(itemPedido3);
        em.persist(itemPedido4);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
