package lk.sliit.project.employeeManagement.controller.notice;

import lk.sliit.project.employeeManagement.controller.SuperController;
import lk.sliit.project.employeeManagement.dto.SalaryDTO;
import lk.sliit.project.employeeManagement.service.custom.EmployeeBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 23-Apr-20
 */
@Controller
public class NoticeController { //form_wizards.jsp For All Notice

    @Autowired
    EmployeeBO employeeBO;
    @GetMapping("/form_wizards")
    public ModelAndView index(Model model, @ModelAttribute SalaryDTO salaryDTO, HttpServletRequest request, HttpServletResponse response) throws ServletException,IllegalStateException, IOException {
        model.addAttribute ( "loggerName", employeeBO.getEmployeeByIdNo ( SuperController.idNo ) );
        ModelAndView mav = new ModelAndView ( "form_wizards" );
        return mav;
    }
}
