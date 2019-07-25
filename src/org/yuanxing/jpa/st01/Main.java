package org.yuanxing.jpa.st01;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author yuanxing
 * @create 2019-07-25 13:58
 * @see
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 1.创建EntityManagerFactory
         */
        String persistenceUnitName = "jpa-st-01";
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory(persistenceUnitName);

        /**
         * 2.创建 EntityManager
         */
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /**
         * 3. 开启事务
         */
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        /**
         * 4. 进行持久化操作
         */
        Customer customer = new Customer();
        customer.setAge(12);
        customer.setEmail("tom@atguigu.com");
        customer.setLastName("Tom");
        entityManager.persist(customer);


        /**
         * 5. 提交事务
         */
        transaction.commit();

        /**
         * 6. 关闭 EntityManager
         */
        entityManager.close();

        /**
         *  7. 关闭 EntityManangerFactory
         */
        entityManagerFactory.close();
    }
}
