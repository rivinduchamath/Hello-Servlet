package lk.sliit.project.employeeManagement.business.custom;

import lk.sliit.project.employeeManagement.business.SuperBO;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 16-Mar-20
 */
public interface DashboardBO extends SuperBO {
    long getAllEmployeeCount();

    long getMaleCount();

    long getFemaleCount();

    long getEmployeeAttCount();

}
