package src.org.j2os.service.superClass;

import org.j2os.common.JPA;
import org.j2os.entity.inheritenceMapping.mappedSuperClass.Employee;
import org.j2os.entity.inheritenceMapping.mappedSuperClass.Person;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.13   Mahsa
 */
public class PersonService {
    public static void save() {

        EntityManager entityManager = JPA.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Employee emp = new Employee();
        emp.setName("mahsa");
        emp.setName("TESLA");
        entityManager.persist(emp);
        Person e2 = new Person();
        e2.setName("Mina Hadiyan");
        entityManager.persist(e2);

        entityTransaction.commit();
        entityManager.close();
    }

    public static void main(String[] args) {
        save();
    }
}
