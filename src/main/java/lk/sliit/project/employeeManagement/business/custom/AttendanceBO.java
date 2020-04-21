package lk.sliit.project.employeeManagement.business.custom;

import lk.sliit.project.employeeManagement.business.SuperBO;
import lk.sliit.project.employeeManagement.dto.AttendanceDTO;
import java.util.List;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 09-Apr-20
 */
public interface AttendanceBO extends SuperBO {
   List<AttendanceDTO> findTodayAttendance();

 AttendanceDTO getEmployeeAttCount();

    void save(AttendanceDTO attendance);

    AttendanceDTO updateUser(String user) ;

    void deleteUser(String id) ;

    List<AttendanceDTO> findAllEmployees() ;

    AttendanceDTO findUser(String userCode) ;


}
