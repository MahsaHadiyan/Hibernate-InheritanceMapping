package src.com.github.entity.inheritenceMapping.join;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.08   Mahsa
 */
@Entity
@Table(name="regularemployee103")
@PrimaryKeyJoinColumn(name="ID")
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
