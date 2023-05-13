package src.org.j2os.entity.inheritenceMapping.singleHierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.08   Mahsa
 */
@Entity
@DiscriminatorValue("regularemployee")
public class RegularEmployee extends Employee {

    @Column(name="salary")
    private float salary;

    @Column(name="bonus")
    private int bonus;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
