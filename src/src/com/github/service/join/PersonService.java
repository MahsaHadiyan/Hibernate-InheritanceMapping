package src.com.github.service.join;

import org.j2os.common.JPA;
import org.j2os.entity.inheritenceMapping.join.ContractEmployee;
import org.j2os.entity.inheritenceMapping.join.Employee;
import org.j2os.entity.inheritenceMapping.join.RegularEmployee;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonService {


    public static void save() {
        EntityManager entityManager = JPA.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();


        Employee e1=new Employee();
        e1.setName("Mahsa Hadiyan");

        RegularEmployee e2=new RegularEmployee();
        e2.setName("Mina Hadiyan");
        e2.setSalary(50000);
        e2.setBonus(5);

        ContractEmployee e3=new ContractEmployee();
        e3.setName("Sina Hadiyan");
        e3.setPay_per_hour(1000);
        e3.setContract_duration("15 hours");

        entityManager.persist(e1);
        entityManager.persist(e2);
        entityManager.persist(e3);

        entityTransaction.commit();
        entityManager.close();

    }

    public static void main(String[] args) {
        save();
    }
}
