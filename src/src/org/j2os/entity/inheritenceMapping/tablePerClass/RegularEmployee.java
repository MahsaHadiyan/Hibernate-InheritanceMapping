package src.org.j2os.entity.inheritenceMapping.tablePerClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.08   Mahsa
 */
@Entity
@Table(name="regularemployee102")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="id")),
        @AttributeOverride(name="name", column=@Column(name="name"))
})
public class RegularEmployee extends Employee{

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