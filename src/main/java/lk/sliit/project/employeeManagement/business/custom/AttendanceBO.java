package lk.sliit.project.employeeManagement.business.custom;

import lk.sliit.project.employeeManagement.dto.AttendanceDTO;

import java.util.List;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 09-Apr-20
 */
public interface AttendanceBO {
   List<AttendanceDTO> findtodayAttendence();

}
