package lk.sliit.project.employeeManagement.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 19-Mar-20
 */
@Entity
public class Salary implements SuperEntity {

    @Id
    private int salaryId;
    @Column(nullable = true)
    private double salary;
    private double totalOtHours;
    private String fullPayment;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "employeeID", referencedColumnName = "idNo", nullable = true)
    private Employee employeeID;



    public Salary() {

    }

    public Salary(int salaryId, double salary, double totalOtHours, String fullPayment, Employee employeeID) {
        this.salaryId = salaryId;
        this.salary = salary;
        this.totalOtHours = totalOtHours;
        this.fullPayment = fullPayment;
        this.employeeID = employeeID;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTotalOtHours() {
        return totalOtHours;
    }

    public void setTotalOtHours(double totalOtHours) {
        this.totalOtHours = totalOtHours;
    }

    public String getFullPayment() {
        return fullPayment;
    }

    public void setFullPayment(String fullPayment) {
        this.fullPayment = fullPayment;
    }

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salaryId=" + salaryId +
                ", salary=" + salary +
                ", totalOtHours=" + totalOtHours +
                ", fullPayment='" + fullPayment + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }


}
