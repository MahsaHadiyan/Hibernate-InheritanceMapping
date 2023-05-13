package src.org.j2os.entity.inheritenceMapping.mappedSuperClass;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.09   Mahsa
 */
@Entity(name = "employee")
@Table(name = "employee20")
public class Employee extends Person {
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
